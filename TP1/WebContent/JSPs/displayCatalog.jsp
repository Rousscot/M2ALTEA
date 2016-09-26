<%@page import="java.util.HashMap"%>
<%@page import="java.io.IOException"%>
<%@page import="bean.Catalog"%>
<%@page import="bean.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel=stylesheet type="text/css" href="/TP1/css/styles.css">
</head>
<body>

	<div class="titre">Catalogue</div>
	<br>
	<br>

	<%
		Catalog catalog = (Catalog) request.getAttribute("catalog");
		for (HashMap.Entry<String, Product> entry : catalog.getProductList().entrySet()) {
			out.println("<div class=\"produit\">");
			out.println("<table>");
			out.println("<tr>");
			out.println("<td rowspan=\"2\"></td>");
			out.println("<td><a class=\"nom\" href=\"/TP1/DisplayProduct?id=");
			out.println(entry.getKey());
			out.println("\">");
			out.println(entry.getValue().getName());
			out.println("</a></td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</div>");
		}
	%>


</body>
</html>