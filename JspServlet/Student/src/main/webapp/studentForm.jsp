<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="isEdit" value="${not empty student}" />

<!DOCTYPE html>
<html>
<head>
  <title>Student Form</title>

  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f6f8;
    }
    form {
      width: 380px;
      margin: 40px auto;
      padding: 20px;
      background-color: #ffffff;
      border-radius: 6px;
      box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
    }
    input, select {
      width: 100%;
      padding: 8px;
      margin-bottom: 12px;
    }
    input[type="submit"] {
      background-color: #4CAF50;
      color: white;
      border: none;
      cursor: pointer;
      font-size: 16px;
    }
  </style>
</head>

<body>

<form action="StudentServlet" method="post" onsubmit="return validateStudentForm();">

  <h2>${isEdit ? "Update Student" : "Student Registration"}</h2>

  <!-- Hidden fields for EDIT -->
  <c:if test="${isEdit}">
    <input type="hidden" name="id" value="${student.id}">
  </c:if>

  <input type="hidden" name="isEdit" value="${isEdit}">

  <label>First Name *</label>
  <input type="text" id="firstName" name="firstName"
         value="${student.firstName}" maxlength="50" required>

  <label>Last Name</label>
  <input type="text" id="lastName" name="lastName"
         value="${student.lastName}" maxlength="50">

  <label>Email *</label>
  <input type="email" id="email" name="email"
         value="${student.email}" required>

  <label>DOB</label>
  <input type="date" id="dob" name="dob" value="${student.dob}">

  <label>Gender *</label>
  <select name="gender" required>
    <option value="">Select Gender</option>
    <option value="Male" ${student.gender == 'Male' ? 'selected' : ''}>Male</option>
    <option value="Female" ${student.gender == 'Female' ? 'selected' : ''}>Female</option>
  </select>

  <label>Admission Date *</label>
  <input type="date" id="admissionDate" name="admissionDate"
         value="${student.admissionDate}" required>

  <label>Class</label>
  <input type="text" name="studentClass" value="${student.studentClass}">

  <label>City</label>
  <input type="text" id="city" name="city" value="${student.city}">

  <label>State Code</label>
  <input type="text" id="stateCode" name="stateCode"
         value="${student.stateCode}" maxlength="2">

  <label>Country</label>
  <input type="text" id="country" name="country" value="${student.country}">

  <input type="submit" value="${isEdit ? 'Update' : 'Save'}">
  <input type="button" value="Back" onclick="history.back()">
<c:if test="${not empty error}">
    <script>alert("${error}");</script>

</c:if>
</form>
<script src="js/validation.js"></script>
</body>
</html>
