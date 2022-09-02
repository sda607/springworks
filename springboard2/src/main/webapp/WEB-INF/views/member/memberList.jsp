<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<jsp:include page="../menu.jsp" />
	<div id="container">
		<section id="list">
			<h2>회원 목록</h2>
				<table class="tbl_list">
					<thead>
						<tr>
							<th>아이디</th>
						<!-- 	<th>비밀번호</th> -->
							<th>이 름</th>
							<th>가입일</th>
						</tr>
					</thead>
				</table>
				<tbody>
				<c:forEach items="${memberList}" var="member">
					<tr>
						<td><a href="/member/memberView?userid=<c:out value="${member.userid}" />v"> <c:out value="${member.userid}" /></a></td>
						<%-- <td><c:out value="${member.userpw}" /> --%>
						<td><c:out value="${member.username}" />
						<td><fmt:formatDate value="${member.regDate}" pattern="yyyy-MM-dd hh:mm:ss"/>
					</tr>
				</c:forEach>
				</tbody>
		</section>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>