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
���⣺<input type="text" name="artGet.title" id="title1" />
���ݣ�<input type="text" name="artGet.content" id="content1" />
<input type="submit" name="chaxun" id="chaxun" value="��ѯ" />
</form>
<table>
	<tr>
		<td>���</td>
		<td>���±���</td>
		<td>����ʱ��</td>
		<td>����</td>
	</tr>
<c:forEach items="${sessionScope.arts }" var="art" varStatus="vs" >
	<tr>
		<td>${vs.index+1 }</td>
		<td><a href="getOneAction?artId=${art.artId }&op=1">${art.title }</a></td>
		<td>${art.artDate }</td>
		<td>
			<a href="deleteOneAction?artId=${art.artId }">ɾ��</a>   
			<a href="getOneAction?artId=${art.artId }">�޸�</a>
		</td>
	</tr>
</c:forEach>	
</table>
<br /><br /><br /><br /><br />


<form action="insertOrUpdateAction" method="post" id="f">
	<table>
		<tr>
			<td>���</td>
			<td><input type="text" name="artId" id="artId" value="${sessionScope.art1.artId}" /></td>
		</tr>
		<tr>
			<td>����</td>
			<td><input type="text" name="title" id="title" value="${sessionScope.art1.title}" /></td>
		</tr>
		<tr>
			<td>ժҪ</td>
			<td><input type="text" name="artSummary" id="artSummary" value="${art1.artSummary}"  /></td>
		</tr>
		<tr>
			<td>����</td>
			<td>
				<textarea name="content" id="content" cols="50" rows="10">
					${art1.content}
				</textarea>
			</td>
		</tr>
		<tr>
			<td>����</td>
			<td><input type="submit" name="tijiao" id="tijiao" value="����" /></td>
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