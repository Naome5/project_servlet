<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="admissionStyle.css">
</head>

<body>


 <nav>
 		<a href="Home.html">HOME</a>
        <a href="Login.jsp">Login</a>
        <a href="StudentAdmission.jsp">Admission</a>
        <a href="trial.jsp">Conversion</a>
    </nav>
   
    
 <div class="login-container">
        <form action=" LoginSevrlet" method="post">
         <% if (request.getAttribute("error") != null) { %>
    <p style="color: red;"><%= request.getAttribute("error") %></p>
<% } %>
            <h2>Login</h2>
            
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>