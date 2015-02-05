<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'scriptlet_demo02.jsp' starting page</title>
    
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
	<%!
		public static final String INFO = "www.MLDNJAVA.cn";	// 定义全局常量
	 %>    
	<%!
		public int add(int x, int y){
			return x + y;
		}
	 %>
	<%!
		class Person{											// 定义 Person 类
			private String name;								// 定义 name 属性
			private int age;									// 定义 age 属性
			public Person(String name, int age){				// 通过构造方法设置属性内容
				this.name = name;								// 为 name 属性赋值
				this.age = age;
			}
			
			public String toString(){							// 覆写 toString()方法
				return "name = " + this.name + "; age = " + this.age;
			}
		}	 
	%>
	<% // 编写普通的 Scriptlet
		out.println("<h3>INFO = "+INFO+"</h3>");
		out.println("<h3>3+5 = "+add(3,5)+"</h3>");
		out.println("<h3>"+new Person("zhangsan",30)+"</h3>");
	%>

  </body>
</html>
