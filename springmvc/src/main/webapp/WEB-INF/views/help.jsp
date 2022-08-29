<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
    <%
   /*   String name=(String)request.getAttribute("name");
      String city=(String)request.getAttribute("city");*/
    %>
    
 <!--  -->  <h1>my name is <%--  <%=name %> --%>  ${name}</h1>
   <h1>my city is <%-- <%=city --%>  ${city }</h1>
   
   <hr/>
   
   
   <c:forEach var="item" items="${marks }">
        <h1>${item}</h1>
   </c:forEach>
</body>
</html>