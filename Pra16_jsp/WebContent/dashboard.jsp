<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<p>
	<h2>
		<%=session.getAttribute("name")%></h2>
	<%		
		String[] subs = (String[]) session.getAttribute("subjects");
	%>
	<table style="border: 1px solid black;">
		<tr>
			<td>subjects</td>
		</tr>
		<%
			for (String sub : subs) {
		%>
		<tr>
			<td><%=sub%></td>
		</tr>
		<%
			}
		%>
	</table>
	</p>
</body>
</html>