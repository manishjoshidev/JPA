<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Reservation Form</title>
</head>
<h3>Student Reservation Form</h3>
<body>
<form:form action="submitForm" modelAttribute="stdreg">
Student id:<form:input path="sId" />
<br><br>
Student name"<form:nput path=sName" />
<br><br>
Student Percentage:<form:input path="sPer" />
<br><br>
Student gender:<br>
<form:radiobutton name="gender" value="Male" pathh="Gender" />Male
<form:radiobutton name="gender" value="FeMale" path=sGender" />Female
<br>
<br>
<input:type="submit" value=submit" />

</form:form>
</body>
</html>