<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deptAdd.jsp' starting page</title>
    
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
	<form action="Work/addWork.action" method="post">
		<table>
			<tr>
				<td>工人编号:</td>
				<td><input type = "text" name="id" id="id"/></td>  			
			</tr>
			<tr>
				<td>工人名称:</td>
				<td><input type = "text" name="workName" id="workName"/></td>
			</tr>  
			<tr>
				<td>工作地址:</td>
				<td><input type = "text" name="workAdress" id="workAdress"/></td>
			</tr>   
			<tr>
				<td colspan="2">
					<input type = "submit" value="添加"/>
					<input type = "reset" value="重置"/>		
				</td>
			</tr>  	
		</table>   	
	</form>
</body>
</html>

