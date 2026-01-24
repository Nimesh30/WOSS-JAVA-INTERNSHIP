package controller;

//import java.io.IOException;
//import dao.StudentDAO;
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import model.Student;
//import java.sql.Date;


import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import model.Student;
public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String action = req.getParameter("action");

        try {
            StudentDAO dao = new StudentDAO();

            if ("delete".equals(action)) {
                int id = Integer.parseInt(req.getParameter("id"));
                dao.deleteStudent(id);
                res.sendRedirect("StudentServlet");
            } else {
                req.setAttribute("students", dao.getAllStudents());
                RequestDispatcher rd =
                        req.getRequestDispatcher("manageStudents.jsp");
                rd.forward(req, res);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            Student s = new Student();
            s.setFirstName(req.getParameter("firstName"));
            s.setLastName(req.getParameter("lastName"));
            s.setEmail(req.getParameter("email"));
            s.setDob(Date.valueOf(req.getParameter("dob")));
            s.setGender(req.getParameter("gender"));
            s.setAdmissionDate(Date.valueOf(req.getParameter("admissionDate")));
            s.setStudentClass(req.getParameter("studentClass"));
            s.setCity(req.getParameter("city"));
            s.setStateCode(req.getParameter("stateCode").toUpperCase());
            s.setCountry(req.getParameter("country"));

            StudentDAO dao = new StudentDAO();
            dao.addStudent(s);

            res.sendRedirect("StudentServlet");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




