<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/common.css" />
<title>게시판</title>
</head>
<body>
	<div id="boardWraaper">
		<div>
			<input type="button" value="클쓰기" onclick="boardWriteForm()">
		</div>
		<div>
			<ul>
				<li>글번호</li>
				<li>제목</li>
				<li>작성자</li>
				<li>작성일</li>
				<li>조회수</li>
			</ul>
			<c:if test="${not empty requestScope.boardList}">
				<c:forEach var="b" items="${requestScope.boardList}">
				<ul>
						<li>${b.id}</li>
						<li>${b.title }</li>
						<li>${b.userId}</li>
						<li>${b.createdAt }</li>
						<li>${b.cnt }</li>
					</ul>
				</c:forEach>
			</c:if>
		</div>
		<%-- <table border="1" style="width: 100%">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<c:if test="${not empty requestScope.boardList}">
				<c:forEach var="b" items="${requestScope.boardList}">
					<tr>
						<td>${b.id}</td>
						<th>${b.title }</th>
						<th>${b.userId}</th>
						<th>${b.createdAt }</th>
						<th>${b.cnt }</th>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${empty requestScope.boardList}">
				<c:forEach var="m" items="${requestScope.boardList}">
					<tr>
						<td colspan="5">출력 할 자료가 없습니다.</td>
					</tr>
				</c:forEach>
			</c:if>
		</table> --%>
	</div>
</body>
</html>