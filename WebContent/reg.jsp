<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>
<form action="regAction" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input type="text" id="userName" name="userName"/></td>
			<td></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" id="userPwd" name="userPwd"/></td>
			<td></td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td><input type="text" id="reuserPwd" name="reuserPwd"/></td>
			<td></td>
		</tr>
		<tr>
			<td>真实姓名：</td>
			<td><input type="text" id="realName" name="realName"/></td>
			<td></td>
		</tr>
		<tr>
			<td>电话：</td>
			<td><input type="text" id="phone" name="phone"/></td>
			<td></td>
		</tr>
		<tr>
			<td>地址：</td>
			<td><input type="text" id="address" name="address"/></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" id="tijiao" name="tijiao" value="登录"/></td>
			<td></td>
		</tr>
		
	</table>
</form>
</body>
</html>