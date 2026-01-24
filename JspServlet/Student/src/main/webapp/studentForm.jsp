<form action="StudentServlet" method="post">
First Name* <input type="text" name="firstName" maxlength="50" required><br>
Last Name <input type="text" name="lastName" maxlength="50"><br>
Email* <input type="email" name="email" maxlength="100" required><br>
DOB <input type="date" name="dob"><br>

Gender*
<select name="gender" required>
  <option>Male</option>
  <option>Female</option>
</select><br>

Admission Date* <input type="date" name="admissionDate" required><br>
Class <input type="text" name="studentClass" maxlength="10"><br>
City <input type="text" name="city" maxlength="50"><br>
State Code <input type="text" name="stateCode" maxlength="2"><br>
Country <input type="text" name="country" maxlength="50"><br>

<input type="submit" value="Save">
</form>
