<%@page import="com.longyuan.www.pojo.Dept"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
  
    <title>工人管理</title>
    
   	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/dept.css">
	<script type="text/javascript" src="jsp/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){		
   	 		$("#search").click(function(){
   	 			var id = $("#sid").val();
   	 			location.href="Work/queryWorkById.action?id="+id;
   	 		});
   	 		
   	 		$("#delete").click(function(){
	 			var id = $("#did").val();
	 			location.href="Work/deleteWorkById.action?id="+id;
	 		});
		})
	
   	 </script>
  </head>
  
  <body>
  		<table>
        	<tr>
        		<td><a href="jsp/work/workAdd.jsp">添加员工</a></td>
        	</tr>
        	<tr>
        		<td><input type="text" name="id" id="did"/>
        		
        		<input type="button" value="删除员工" id="delete"></td>
        	</tr>
        	<tr>
        		<td><a href="jsp/work/workEdit.jsp" id="update">修改员工</a></td>
        	</tr>
        	<tr>
        		<td><input type="text" name="id" id="sid"/>
        		
        		<input type="button" value="查询员工" id="search"></td>	
        	</tr>
        	<tr>
        		<td><a href="Work/queryAllWork.action">查询所有员工</a></td>
        	</tr>
        </table>	
        
        <%
        	List<Dept> deptList = new ArrayList<Dept>();
        	deptList.add(new Dept("aaa","bbb","ccc","ddd"));
        	deptList.add(new Dept("ddd","eee","fff","ggg"));
        	
        	request.setAttribute("deptList",deptList); 
        
        
        %>
        
         <table>
         		<tr>
         			<td>部门编号</td>
         			<td>部门名称</td>
         			<td>部门位置</td>
         			<td>部门负责人</td>
         		</tr>
         		<c:forEach items="${deptList}" var="dept">
         			<tr>
         				<td>${dept.deptNo}</td>
         				<td>${dept.deptName}</td>
         				<td>${dept.deptLoc}</td>
         				<td>${dept.deptLeader}</td>
        	</c:forEach>
        	
        </table>
  </body>
</html>
