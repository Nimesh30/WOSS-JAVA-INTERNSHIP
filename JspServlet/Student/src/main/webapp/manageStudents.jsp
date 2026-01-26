<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.temporal.ChronoUnit" %>

<h2>Manage Students</h2>
<a href="studentForm.jsp">Add Student</a>

<table border="1">
<tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Gender</th>
    <th>Class</th>
    <th>Age</th>
    <th>Location</th>
    <th>Action</th>
</tr>

<%
List<Student> list = (List<Student>) request.getAttribute("students");

if (list != null && !list.isEmpty()) {
    for (Student s : list) {

        String age = "N/A";

        if (s.getDob() != null) {
            LocalDate birthDate = s.getDob().toLocalDate();
            LocalDate today = LocalDate.now();

            long totalDays = ChronoUnit.DAYS.between(birthDate, today);
            long years = totalDays / 365;
            long extraDays = totalDays % 365;
            long weeks = extraDays / 7;
            long days = extraDays % 7;

            age = years + " years, " + weeks + " weeks, " + days + " days";
        }
%>
<tr>
    <td><%= s.getFirstName() %></td>
    <td><%= s.getLastName() %></td>
    <td><%= s.getGender() %></td>
    <td><%= s.getStudentClass() %></td>
    <td><%= age %></td>
    <td><%= s.getCity() %>, <%= s.getStateCode() %>, <%= s.getCountry() %></td>
    <td>
        <a href="StudentServlet?action=delete&id=<%= s.getId() %>"
           onclick="return confirm('Are you sure?')">Delete</a>
        <a href="StudentServlet?action=edit&id=<%=s.getId() %>">Update</a>
    </td>
</tr>
<%
    }
} else {
%>
<tr>
    <td colspan="7">No students found</td>
</tr>
<%
}
%>
</table>
