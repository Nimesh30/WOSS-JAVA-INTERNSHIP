<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="isEdit" value="${not empty student}" />

<c:if test="${isEdit}">
    <input type="hidden" name="id" value="${student.id}">
</c:if>
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

    form h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    input, select {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      margin-bottom: 12px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      background-color: #4CAF50;
      color: white;
      border: none;
      cursor: pointer;
      font-size: 16px;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }

    label {
      font-weight: bold;
    }
  </style>
</head>

<body>

<form action="StudentServlet" method="post">
  <h2>${isEdit ? "Update Student" : "Student Registration"}</h2>


  <label>First Name *</label>
<input type="text" name="firstName"
       value="${student.firstName}" maxlength="50" required>


  <label>Last Name</label>
  <input type="text" name="lastName"
         value="${student.lastName}" maxlength="50">


  <label>Email *</label>
  <input type="email" name="email"
         value="${student.email}" maxlength="100" required>


  <label>DOB</label>
  <input type="date" name="dob" value="${student.dob}">

  <label>Gender *</label>
  <select name="gender" required>
    <option value="">Select Gender</option>
    <option value="Male" ${student.gender == 'Male' ? 'selected' : ''}>Male</option>
    <option value="Female" ${student.gender == 'Female' ? 'selected' : ''}>Female</option>
  </select>


  <label>Admission Date *</label>
  <input type="date" name="admissionDate" value="${student.admissionDate}" required>

  <label>Class</label>
  <input type="text" name="studentClass" value="${student.studentClass}" maxlength="10">

  <label>City</label>
  <input type="text" name="city" value="${student.city}" maxlength="50">

  <label>State Code</label>
  <input type="text" name="stateCode" value="${student.stateCode}"  maxlength="2">

  <label>Country</label>
  <input type="text" name="country" value="${student.country}"  maxlength="50">

  <h2>${isEdit ? "Update Student" : "Student Registration"}</h2>

  <input type="submit" value="${isEdit ? 'Update' : 'Save'}">

  <input type="button" onclick="history.back()" value="Back">
</form>

</body>
</html>
