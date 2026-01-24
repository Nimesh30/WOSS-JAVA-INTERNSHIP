<%@ page import="java.util.*,model.Student" %>

<h2>Manage Students</h2>
<a href="studentForm.jsp">Add Student</a>

<table border="1">
<tr>
  <th>First Name</th><th>Last Name</th><th>Gender</th>
  <th>Class</th><th>Location</th><th>Action</th>
</tr>

<%
List<Student> list = (List<Student>) request.getAttribute("students");
for(Student s : list){
%>
<tr>
<td><%= s.getFirstName() %></td>
<td><%= s.getLastName() %></td>
<td><%= s.getGender() %></td>
<td><%= s.getStudentClass() %></td>
<td><%= s.getCity() %>, <%= s.getStateCode() %>, <%= s.getCountry() %></td>
<td>
  <a href="StudentServlet?action=delete&id=<%=s.getId()%>"
     onclick="return confirm('Are you sure?')">Delete</a>
</td>
</tr>
<% } %>
</table>
