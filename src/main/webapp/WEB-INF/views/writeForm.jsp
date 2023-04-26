<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="500">
		<form action="write">
			<tr>
				<td>이름</td>
				<td><input type="text" name="bname" size="60"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="btitle" size="60"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="50" name="bcontent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="글입력" onclick="scripr:window.location.href='list'">&nbsp;&nbsp;&nbsp;
					<input type="button" value="글목록" onclick="scripr:window.location.href='list'">
				</td>
			</tr>
		</form>
	</table>
</body>
</html>