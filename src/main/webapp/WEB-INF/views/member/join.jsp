<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${request.getContextPath()}"></c:set>
<!DOCTYPE html>
<html>
	<head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Sign Up Form</title>
		<link rel="stylesheet" href="form.css">
	</head>
	<body>
	
		<form action="index.html" method="post">
	
			<h1>회원가입</h1>
	
			<fieldset>
	
				<legend>
					<span class="number">1</span>회원정보
				</legend>
	
				<div>
					<label for="name">아이디</label> <input type="text" id="memberId"
						name="memberId" style="width: 63%;">
					<button id="idCheckBtn" name="idCheckBtn" type="button">중복체크</button>
					<div>
						<p class="idCheckInfo"></p>
					</div>
				</div>
	
				<label for="password">비밀번호</label> <input type="password"
					id="memberPassword" name="memberPassword"> <label
					for="password">비밀번호 재확인</label> <input type="password"
					id="reconfirm" name="reconfirm"> <label for="name">이름</label>
				<input type="text" id="memberName" name="memberName"> <label
					for="mail">이메일</label> <input type="email" id="memberEmail"
					name="memberEmail">
	
			</fieldset>
	
			<button type="submit">가입</button>
	
		</form>
	
	</body>
<script>
$(document).ready(function(){
	var idCheckBtn = $("#idCheckBtn");
	idCheckBtn.on("click", function(){
		var memberIdVal = $("#memberId").val();
		//alert("아이디 중복체크");
		
		var jsonData = {"memberId" : memberIdVal};
		if (checkMemberIdVal(memberIdVal)) {
			$.ajax({
				url : "${path}/member/idDuplicateCheck",
				data : JSON.stringify(jsonData),
				type : "post",
				dataType : "json",
				contentType: "application/json; charset=utf-8",
				success : function (result) {
					var msg = result.msg;
					if (msg == "possible") {
						showIdCheck(result);
					} else if (msg == "impossible") {
						showIdCheck(reuslt);
					}
				}
			});
		} else {
			alert("아이디를 입력해주세요");
		}
		
	});
});

//회원 아이디 공백확인
function checkMemberIdVal(val){
	var check = false;
	if (val != "") {
		check = true;
	}
	
	return check;
}

//회원 아이디 중복 표시
function showIdCheck(data){
	var inputEl = $(".inputCheckInfo");
	if (data == "possible") {
		//inputCheckInfo 폰트 초록색  
		inputEl.attr("color", "green").text("사용가능한 아이디 입니다.");
		inputEl.attr("display", "inline");
	} else if (data == "impossible") {
		//inputCheckInfo 폰트 빨간색
		inputEl.atrr("color", "red").text("이미 사용중입니다 다른 아이디를 입력해 주세요.");
		inputEl.attr("display", "inline");
	}
}
</script>
</html>