<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Number Converter</h2>
    <form id="converterForm" action="Myservlet" method="post">
       
    Enter Base 10 Number: <input type="text" name="number" required><br>
    <button type="submit" name="convert" value="Binary">Binary</button>
    <button type="submit" name="convert" value="Decimal">Decimal</button>
    <button type="submit" name="convert" value="Hexa">Hexa</button>
    <button type="submit" name="convert" value="Octal">Octal</button>
</form>
<% if(request.getAttribute("inputNumber") != null){ %>
      	   <div id="resultContainer">
      	       <h2>Number Conversion Result</h2>
    <p>Number: ${param.number}</p>
    <p>Conversion Type: ${param.convert}</p>
    <p>Result: ${result}</p>
    <p style="color: blue;">Base nbr converted to ${param.convert}</p>
       
    </div>
   <% } %>
</body>
</html>