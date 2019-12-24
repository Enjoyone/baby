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
<title>register</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="static/css/magnific-popup.css">
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/animate.css">
<link rel="stylesheet" href="static/css/fonts.css">
<link rel="stylesheet" href="static/css/preset.css">
<link rel="stylesheet" href="static/otherCss/style.css">
<link rel="stylesheet" href="static/css/responsive.css">


<!--  -->

<!-- foont-awesome  bootsrtap... -->
<link rel="stylesheet" href="loginRegister/assets/css/form-elements.css">

<link rel="stylesheet" href="loginRegister/assets/css/style.css">



</head>

<body>
	<div>
		<%@include file="../headerFooter/header.jsp"%>
	</div>

	<div class="register-con">
		<div class="top-content">
			<div class="inner-bg">
				<div class="container">
					<div class="row">
						<div class="col-sm-7 text"></div>
						<div class="col-sm-5 form-box">
							<div class="form-top">
								<div class="form-top-left">
									<h3>欢迎注册</h3>
									<p>注册信息---></p>
								</div>
								<div class="form-top-right">
									<i class="fa fa-pencil"></i>
								</div>
								<div class="form-top-divider"></div>
							</div>
							<div class="form-bottom">
								<form role="form" action="register" method="post"
									class="registration-form">
									<div class="form-group">
										<label class="sr-only" for="id">用户名</label> <input type="text"
											name="id" placeholder="用户名..."
											class="form-first-name form-control" id="id">
									</div>
									<div class="form-group">
										<label class="sr-only" for="name">姓名</label> <input
											type="text" name="name" placeholder="姓名..."
											class="form-last-name form-control" id="name">
									</div>
									<div class="form-group">
										<label class="sr-only" for="pwd1">密码</label> <input
											type="password" name="pwd1" placeholder="密码..."
											class="form-pwd form-control" id="pwd1">
									</div>
									<div class="form-group">
										<label class="sr-only" for="pwd2">密码</label> <input
											type="password" name="pwd2" placeholder="再次输入..."
											class="form-pwd form-control" id="pwd2">
									</div>

									<button type="submit" class="btn">注册</button>
								</form>
							</div>
						</div>
					</div>
				</div>
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

	<!--  -->

	<script src="loginRegister/assets/js/jquery.backstretch.min.js"></script>
	<script src="loginRegister/assets/js/retina-1.1.0.min.js"></script>
	<script src="loginRegister/assets/js/scripts.js"></script>



</body>

</html>