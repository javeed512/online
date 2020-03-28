<%@ page language="java"  import="com.capg.Employee"  isELIgnored="false"   contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:fuchsia;">WELCOME TO JSP</h1>


<% 

		Employee emp =  (Employee) session.getAttribute("emp");

	out.print(emp);


%>




Employee Details: ${emp}





</body>
</html>