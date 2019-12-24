<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<base href="<%=basePath%>">
<title>login</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Include All Css -->
<link rel="stylesheet" href="static/css/magnific-popup.css">
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/animate.css">
<link rel="stylesheet" href="static/css/fonts.css">
<link rel="stylesheet" href="static/css/preset.css">
<link rel="stylesheet" href="static/otherCss/style.css">
<link rel="stylesheet" href="static/css/responsive.css">

<!--  -->
<link rel="stylesheet" href="loginRegister/login.css">


</head>

<body>
	<div>
		<%@include file="../headerFooter/header.jsp"%>
	</div>
	<div class="login-con">
		<div class="message warning">
			<div class="inset">
				<div class="login-head">
					<h1>欢迎登录</h1>
				</div>
				<form action="login" method="post">
					<li><input type="text" class="text" name="userName"
						placeholder="userName"><a href="javascript:void(0)"
						class=" icon user"></a></li>
					<div class="clear"></div>
					<li><input type="password" name="pwd" placeholder="password">
						<a href="javascript:void(0)" class="icon lock"></a></li>
					<div class="clear"></div>
					<div class="submit">
						<div>
							<input type="submit" value="登录">
						</div>
						<h4>
							<a href="#">忘记密码？</a>
						</h4>
						<div class="clear"></div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<div>
		<%@include file="../headerFooter/footer.jsp"%>
	</div>
	<!-- Include All JavaScript -->
	<script src="static/js/jquery-3.3.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/mixIt.js"></script>
	<script src="static/js/jquery.magnific-popup.min.js"></script>
	<script src="static/js/main.js"></script>



</body>

</html>