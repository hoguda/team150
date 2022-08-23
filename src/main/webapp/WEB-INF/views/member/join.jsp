<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign Up Form</title>
        <link rel="stylesheet" href="form.css">
    </head>
    <body>

      <form action="index.html" method="post">
        
        <h1>회원가입</h1>
        
        <fieldset>
          
          <legend><span class="number">1</span>회원정보</legend>
          
          <label for="name">아이디</label>
          <input type="text" id="memberId" name="memberId">
          
          <label for="password">비밀번호</label>
          <input type="password" id="memberPassword" name="memberPassword">
          
          <label for="password">비밀번호 재확인</label>
          <input type="password" id="reconfirm" name="reconfirm">
          
          <label for="name">이름</label>
          <input type="text" id="memberName" name="memberName">
          
          <label for="mail">이메일</label>
          <input type="email" id="memberEmail" name="memberEmail">
          
        </fieldset>
        
        <button type="submit">Sign Up</button>
        
      </form>
      
    </body>
</html>