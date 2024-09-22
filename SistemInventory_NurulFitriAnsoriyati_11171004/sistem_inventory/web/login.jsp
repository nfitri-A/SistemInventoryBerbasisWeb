<%-- 
    Document   : formlogin
    Created on : May 28, 2020, 7:59:07 PM
    Author     : fitri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html>
	<head>

		<meta charset="utf-8">
		<title>Login Form</title>

<style>
                    body
{
	margin: 0;
	padding: 0;
	background: url(img/123.jpg);
	background-size: cover;
	font-family: sans-serif;
}
.loginBox
{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 350px;
	height: 420px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}
.user
{
	width: 100px;
	height: 100px;
	border-radius: 50%;
	overflow: hidden;
	position: absolute;
	top: calc(-100px/2);
	left: calc(50% - 50px);
}
h2
{
	margin: 0;
	padding: 0 0 20px;
	color: #efed40;
	text-align: center;
}
.loginBox p
{
	margin: 0;
	padding: 0;
	font-weight: bold;
	color: #fff;
}
.loginBox input
{
	width: 100%;
	margin-bottom: 20px;
}
.loginBox input[type="text"],
.loginBox input[type="password"]
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}
::placeholder
{
	color: rgba(255,255,255,.5);
}
.loginBox input[type="submit"]
{
	border: none;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
	background: #ff267e;
	cursor: pointer;
	border-radius: 20px;
}
.loginBox input[type="submit"]:hover
{
	background: #efed40;
	color: #262626;
}
.loginBox a
{
	color: #fff;
	font-size: 14px;
	font-weight: bold;
	text-decoration: none;
}

                </style>
	</head>
<script type="text/javascript">
function validasi(form){
  if (form.username.value == ""){
    alert("Nama user harus diisi!");
    form.username.focus();
    return (false);
  }else if(form.password.value == ""){
      alert("Password harus diisi untuk keamanan!");
      form.password.focus();
      return(false);
  }else if (form.password.value.length < 6){
    alert("Panjang password minimal 6 karater!");
    form.username.focus();
    return (false);
  }
return (true);
}
</script>
	<body>
		<div class="loginBox">
			<img src="img/user.png" class="user">
			<h2>Log In Here</h2>
			<form method="post" action="Login?proses=login" onsubmit="return validasi(this)">
				<p>Username</p>
				<input type="text" name="username" placeholder="Masukan Username" value=""/>
				<p>Password</p>
				<input type="password" name="password" placeholder="••••••" value=""/>
				<input type="submit" name="" value="login">
                                <input type="reset" value="Reset"/>
				
			</form>
		</div>
	</body>
</html>
