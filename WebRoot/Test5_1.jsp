<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Test5_1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page.123 <br>
    
    <!-- 这个主食客户端可以看见 -->
    <%--JSP中的注释，客户端无法看见 --%>
    <%
    	//Java 中提供的单行注释，客户端无法看见
    	/*
    		Java中提供的多行注释，客户端无法看见
    	*/
    
     %>
     
     <%
     	int x = 10;										// 定义局部变量
     	String info = "www.mldnjava.cn";				// 定义局部变量
     	out.println("<h2>x = " + x + "</h2>");			// 编写语句
     	out.println("<h2>info = " + info + "</h2>");	// 编写语句
     
      %>
     
     
    
    
    
  </body>
</html>
