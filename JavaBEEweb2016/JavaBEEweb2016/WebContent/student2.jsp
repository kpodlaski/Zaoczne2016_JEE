<%@page import="model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="stud" class="model.Student" scope="session">	
	</jsp:useBean>
	<jsp:useBean id="dane" class="model.Dane" scope="application"/>
	<%
		if (request.getParameter("id") != null){ 
			int id = Integer.parseInt( request.getParameter("id") );
			Student temp = dane.getStudents().get(id);
			stud.setImie(temp.getImie());
			stud.setNazwisko(temp.getNazwisko());
			stud.setIndex(temp.getIndex());
			stud.setFoto(temp.getFoto());
			}
	%>
	<table>
		<tr> <td><img src="images/${stud.foto}" width="200px"/></td>
		<td> 
			<table>
				<tr> <td>nr. indeksu: ${stud.index}</td></tr>
				<tr> <td>${stud.imie}</td></tr>
				<tr> <td>${stud.nazwisko}</td></tr>
			</table>
		</td>
		</tr>
	</table>
</body>
</html>