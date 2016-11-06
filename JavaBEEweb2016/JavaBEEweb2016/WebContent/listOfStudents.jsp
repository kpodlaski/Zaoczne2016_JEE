<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Student"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dane" class="model.Dane" scope="application"></jsp:useBean>
	
	<%
		for(Student s : dane.getStudents()){
			out.append("<a href=\"student.jsp?imie=");
			out.append(s.getImie());
			out.append("&nazwisko=");
			out.append(s.getNazwisko());
			out.append("&index=");
			out.append(""+s.getIndex());
			out.append("&foto=");
			out.append(s.getFoto());
			out.append("\">");
			out.append(s.getImie() + " "+ s.getNazwisko());
			out.append("</a><br/>");
		}
		out.append("<hr/>");
		int id = 0;
		for(Student s : dane.getStudents()){
		out.append("<a href=\"student2.jsp?id="+id);
		out.append("\">");
		out.append(s.getImie() + " "+ s.getNazwisko());
		out.append("</a><br/>");
		id++;
	}
	%>
</body>
</html>