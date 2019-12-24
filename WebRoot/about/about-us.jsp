<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>">
	<title></title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="Themeum">

	<!-- Include All Css -->
	<link rel="stylesheet" href="static/css/font-awesome.min.css">
	<link rel="stylesheet" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" href="static/css/animate.css">
	<link rel="stylesheet" href="static/css/fonts.css">
	<link rel="stylesheet" href="static/css/preset.css">
	<link rel="stylesheet" href="static/otherCss/style.css">
	<link rel="stylesheet" href="static/css/responsive.css">

	<!--[if lt IE 9]>
		<script src="js/html5shive.js"></script>
	<![endif]-->

</head>
<body>
	<!-- Header Area -->
	<header class="header-area inner-page">
		<nav class="navigation">
			<div class="logo pull-left">
				<a href="index.html">贝小乐</a>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-sm-12 col-xs-12">

						<ul class="main-menu pull-left">
							<li><a href="index.html">首页</a></li>
							<li><a href="#">关于</a></li>
							<li class="menu-has-child"><a href="#">计划</a>
								<ul>
									<li><a href="#">未来</a>
										<ul>
											<li><a href="#">Event</a></li>
										</ul></li>
									<li><a href="#">所有</a></li>
								</ul></li>
							<li><a href="shortcode.html">同城</a>
								<ul>
									<li><a href="#">Classes Details</a></li>
								</ul></li>
							<li><a href="#" id="search-pop"><i class="fa fa-search"></i></a>
							</li>
						</ul>
						<ul class="main-menu pull-right">
							<li class="menu-has-child"><a href="#">James</a>
								<ul>
									<li><a href="#">个人中心</a></li>
									<li><a href="#">退出</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="search-area">
				<form action="#" method="post">
					<input type="search" name="search"
						placeholder="Enter your Search Text Here....">
				</form>
				<a href="#" class="search-close"><i class="fa fa-times"></i></a>
			</div>
		</nav>
	</header>
	<!-- /.header-area -->

	<!-- Breadcrumb  -->
	<section class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-xs-12 text-center">
					<div class="breadcrumb-content">
						<h2>About Us</h2>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.breadcrumb-section  -->

	<!-- Classes Section -->
	<section class="who-we-section">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-xs-12">
					<div class="who-we-img">
						<img alt="" src="images/about/who.jpg">
					</div>
				</div>
				<div class="col-sm-6 col-xs-12 text-left">
					<div class="who-we-details">
						<h2 class="title-2">diary</h2>
						<p class="subtitle color">qqqqqqq</p>
						<article class="who-we-content">
							<p>qqqqqqqq</p>
						</article>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.who-we-section -->

	<!-- Promo Section -->
	<section class="promo-section">
		<div class="container">
			<div class="row">
				<div class="col-sm-7 col-md-5 col-xs-12">
					<div class="promo-content">
						<h4>kids play</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna</p>
						<a href="#" class="primary-btn"><span>Enroll Your Child</span></a>
					</div>
				</div>
				<div class="col-sm-5 col-md-7">
					<div class="enroll-img">
						<img alt="" src="images/home1/enroll-img.png">
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.promo-section -->

	<!-- Footer Section -->
	<footer class="footer-section">
		<div class="container">
			<div class="row"></div>
		</div>
	</footer>
	<!-- /.footer-section -->

	<!-- Include All JavaScript -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/mixIt.js"></script>
	<script src="js/main.js"></script>
</body>
</html>

