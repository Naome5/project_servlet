<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT ADMISSION</title>
  <link rel="stylesheet" href="admissionStyle.css">
</head>
<body>
<nav>
 		<a href="Home.html">HOME</a>
        <a href="Login.jsp">Login</a>
        <a href="StudentAdmission.jsp">Admission</a>
        <a href="trial.jsp">Conversion</a>
    </nav>

<form action="studentSeverlet" method="post">
        
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" required>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" min="1" required>
        <label for="gender">Gender:</label>
        <select id="gender" name="gender" required>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="course">Desired Course:</label>
        <input type="text" id="course" name="course" required>

        <label for="year">Year of Admission:</label>
        <input type="text" id="year" name="year"  required>
        <button type="submit">Submit</button>
    </form>
</body>
</html>