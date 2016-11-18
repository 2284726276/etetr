<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>
admin
<br /><br /><br />
<form action="getByTitleOrContent" method="post">
标题：<input type="text" name="artGet.title" id="title1" />
内容：<input type="text" name="artGet.content" id="content1" />
<input type="submit" name="chaxun" id="chaxun" value="查询" />
</form>
<table>
	<tr>
		<td>序号</td>
		<td>文章标题</td>
		<td>发布时间</td>
		<td>操作</td>
	</tr>
<c:forEach items="${sessionScope.arts }" var="art" varStatus="vs" >
	<tr>
		<td>${vs.index+1 }</td>
		<td><a href="getOneAction?artId=${art.artId }&op=1">${art.title }</a></td>
		<td>${art.artDate }</td>
		<td>
			<a href="deleteOneAction?artId=${art.artId }">删除</a>   
			<a href="getOneAction?artId=${art.artId }">修改</a>
		</td>
	</tr>
</c:forEach>	
</table>
<br /><br /><br /><br /><br />


<form action="insertOrUpdateAction" method="post" id="f">
	<table>
		<tr>
			<td>编号</td>
			<td><input type="text" name="artId" id="artId" value="${sessionScope.art1.artId}" /></td>
		</tr>
		<tr>
			<td>标题</td>
			<td><input type="text" name="title" id="title" value="${sessionScope.art1.title}" /></td>
		</tr>
		<tr>
			<td>摘要</td>
			<td><input type="text" name="artSummary" id="artSummary" value="${art1.artSummary}"  /></td>
		</tr>
		<tr>
			<td>内容</td>
			<td>
				<textarea name="content" id="content" cols="50" rows="10">
					${art1.content}
				</textarea>
			</td>
		</tr>
		<tr>
			<td>操作</td>
			<td><input type="submit" name="tijiao" id="tijiao" value="保存" /></td>
		</tr>
		
	</table>

</form>
<script type="text/javascript">
function fun(){
	var act="insertOneAction";
	var artid=document.getElementById("artId").value;
	if(artid!=""){
		act="updateOneAction";
	}
	document.getElementById("f").attributes['action']=act;
}
</script>

</body>
</html>