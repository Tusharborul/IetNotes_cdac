<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p" class="com.demo.beans.Product"></jsp:useBean>
 <jsp:setProperty property="*" name="p" />
Pid : <jsp:getProperty property="pid" name="p"/>
Pname : <jsp:getProperty property="pname" name="p"/>
qty : <jsp:getProperty property="qty" name="p"/>
Price : <jsp:getProperty property="price" name="p"/>
</body>
</html>