package dao;
//package Controller;
import model.Student;
import java.sql.*;
import java.util.*;

public class StudentDAO {

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "Admin@3006"
        );
    }


    public void addStudent(Student s) throws Exception {
        String sql = "INSERT INTO students VALUES (NULL,?,?,?,?,?,?,?,?,?,?)";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, s.getFirstName());
        ps.setString(2, s.getLastName());
        ps.setString(3, s.getEmail());
        ps.setDate(4, s.getDob());
        ps.setString(5, s.getGender());
        ps.setDate(6, s.getAdmissionDate());
        ps.setString(7, s.getStudentClass());
        ps.setString(8, s.getCity());
        ps.setString(9, s.getStateCode());
        ps.setString(10, s.getCountry());

        ps.executeUpdate();
    }


    public List<Student> getAllStudents() throws Exception {
        List<Student> list = new ArrayList<>();
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setFirstName(rs.getString("first_name"));
            s.setLastName(rs.getString("last_name"));
            s.setEmail(rs.getString("email"));
            s.setDob(rs.getDate("dob"));
            s.setGender(rs.getString("gender"));
            s.setAdmissionDate(rs.getDate("admission_date"));
            s.setStudentClass(rs.getString("class"));
            s.setCity(rs.getString("city"));
            s.setStateCode(rs.getString("state_code"));
            s.setCountry(rs.getString("country"));
            list.add(s);
        }
        return list;
    }

    public void deleteStudent(int id) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps =
                con.prepareStatement("DELETE FROM students WHERE id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public Student getStudentById(int id) throws Exception {
        Student s = null;
        Connection con = getConnection();
        PreparedStatement ps =
                con.prepareStatement("SELECT * FROM students WHERE id=?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            s = new Student();
            s.setId(rs.getInt("id"));
            s.setFirstName(rs.getString("first_name"));
            s.setLastName(rs.getString("last_name"));
            s.setEmail(rs.getString("email"));
            s.setDob(rs.getDate("dob"));
            s.setGender(rs.getString("gender"));
            s.setAdmissionDate(rs.getDate("admission_date"));
            s.setStudentClass(rs.getString("class"));
            s.setCity(rs.getString("city"));
            s.setStateCode(rs.getString("state_code"));
            s.setCountry(rs.getString("country"));
        }
        return s;
    }


    public void updateStudent(Student s) throws Exception {
        String sql = "UPDATE students SET " +
                "first_name=?, last_name=?, email=?, dob=?, gender=?, " +
                "admission_date=?, class=?, city=?, state_code=?, country=? " +
                "WHERE id=?";

        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, s.getFirstName());
        ps.setString(2, s.getLastName());
        ps.setString(3, s.getEmail());
        ps.setDate(4, s.getDob());
        ps.setString(5, s.getGender());
        ps.setDate(6, s.getAdmissionDate());
        ps.setString(7, s.getStudentClass());
        ps.setString(8, s.getCity());
        ps.setString(9, s.getStateCode());
        ps.setString(10, s.getCountry());
        ps.setInt(11, s.getId());

        ps.executeUpdate();
    }



}


