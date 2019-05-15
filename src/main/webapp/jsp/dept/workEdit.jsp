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
	<form action="Work/updateWorkById.action" method="post">
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
					<input type = "submit" value="修改"/>
					<input type = "reset" value="重置"/>		
				</td>
			</tr>  	
		</table> 
		<table>
		<thead>
		<tr>
		   <td>deptNo</td>
		   <td>deptName</td>
		   <td>deptLoc</td>
		   <td>deptLeader</td>
		   </tr>
		</thead>
		<tbody class="info">
			<tr>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</tbody>
		</table>  	
	</form>
</body>
<script src="js/jquery-1.8.3.min.js"></script>
<script>  
function queryWorkById($id){
$.ajax({
	type:'post',
	url:'http://localhost:8080/SSM/Work/queryWorkById.action',
	data:{id:$id},
	success: function(data){
		console.log(data);
		/* var obj = eval("("+data+")");
		console.log(obj); */
		
 var a = eval("x=10;y=20;z=30");
		console.log(a); 
		
	var html ='';
	html+='<tr>';
	html+='<td>'+data.id+'</td>';
	html+='<td>'+data.workName+'</td>';
	html+='<td>'+data.workAdress+'</td>';
	html+='<td>'+data.createTime+'</td>';
	html+='</tr>';
	$(".info").html(html);
	}
})
}

queryWorkById(2);
</script>
</html>

