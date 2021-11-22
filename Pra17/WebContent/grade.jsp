<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<%
		Double ajp = Double.parseDouble(request.getParameter("ajp"));
		Double nma = Double.parseDouble(request.getParameter("nma"));
		Double mcad = Double.parseDouble(request.getParameter("mcad"));
		Double prj2 = Double.parseDouble(request.getParameter("proj2"));
		Double mooc = Double.parseDouble(request.getParameter("mooc"));
		Double percent = (ajp + nma + mcad + prj2 + mooc) / 5;
		String grade = "F";
		if (percent > 90)
			grade = "A";
		else if (percent > 75)
			grade = "B";
		else if (percent > 55)
			grade = "C";
		else if (percent > 35)
			grade = "D";
	%>
	<%="Your Grade is " + grade%>
</body>
</html>