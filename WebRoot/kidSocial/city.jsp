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
	<title>city</title>
	<meta charset="UTF-8">
	<!-- Include All Css -->
	<link rel="stylesheet" href="static/css/magnific-popup.css">
	<link rel="stylesheet" href="static/css/font-awesome.min.css">
	<link rel="stylesheet" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" href="static/css/animate.css">
	<link rel="stylesheet" href="static/css/fonts.css">
	<link rel="stylesheet" href="static/css/preset.css">
	<link rel="stylesheet" href="static/otherCss/style.css">
	<link rel="stylesheet" href="static/css/responsive.css">
	<link rel="stylesheet" href="./city.css">
	<link rel="stylesheet" href="./map.css">

</head>

<body>
	<!-- Header Area -->
	<header class="header-area inner-page">

		<!-- /.header-top -->
		<nav class="navigation">
			<div class="logo pull-left">
				<a href="index.html">贝小乐</a>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-sm-12 col-xs-12">
						
						<ul class="main-menu pull-left">
							<li>
								<a href="index.html">首页</a>
	
							</li>
							<li><a href="#">关于</a></li>
							<li class="menu-has-child">
								<a href="#">计划</a>
								<ul>
									<li>
										<a href="#">未来</a>
										<ul>
											<li><a href="#">Event</a></li>
										</ul>
									</li>
									<li><a href="#">所有</a></li>
								</ul>
							</li>
							<li>
								<a href="shortcode.html">同城</a>
								<ul>
									<li><a href="#">Classes Details</a></li>
								</ul>
							</li>
							<li>
								<a href="#" id="search-pop"><i class="fa fa-search"></i></a>
							</li>
						</ul>
						<ul class="main-menu pull-right">
							<li class="menu-has-child">
								<a href="#">James</a>
								<ul>
									<li>
										<a href="#">个人中心</a>
									</li>
									<li>
										<a href="#">退出</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="search-area">
				<form action="#" method="post">
					<input type="search" name="search" placeholder="Enter your Search Text Here....">
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
						<h2>Play</h2>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.breadcrumb-section  -->

	<!-- Team Section -->
	<section class="team-section teacher-page">
		<div class="container citySocial">
			<div>
				<div class="word1">
					目前同城空闲儿童推荐
				</div>
				<div class="row">
					<div class="col-sm-6 col-md-3 col-xs-12 text-center">
						<div class="single-team">
							<div class="team-img">
								<img alt="" src="static/images/city-social/1.jpg">
								<ul class="team-social">
									<li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
								</ul>
							</div>
							<h3>Mike </h3>
							<p>画画，唱歌</p>
					</div>
					</div>
					<div class="col-sm-6 col-md-3 col-xs-12 text-center">
						<div class="single-team">
							<div class="team-img">
								<img alt="" src="static/images/city-social/2.jpg">
								<ul class="team-social">
									<li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
								</ul>
							</div>
							<h3>Tom </h3>
							<p>玩游戏</p>
						</div>
					</div>
					<div class="col-sm-6 col-md-3 col-xs-12 text-center">
						<div class="single-team">
							<div class="team-img">
								<img alt="" src="static/images/city-social/3.jpg">
								<ul class="team-social">
									<li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
								</ul>
							</div>
							<h3>Jim </h3>
							<p>玩玩具</p>
						</div>
					</div>
					<div class="col-sm-6 col-md-3 col-xs-12 text-center">
						<div class="single-team">
							<div class="team-img">
								<img alt="" src="static/images/city-social/4.jpg">
								<ul class="team-social">
									<li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
								</ul>
							</div>
							<h3>Louis </h3>
							<p>涂鸦 </p>
						</div>
					</div>

				</div>

				<div class="city-map" style="border: 1px solid red;">
					<div class="left1">
						<ul class="nav flex-column">
							<li class="nav-item">
								<a class="nav-link" href="#">预约单</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">消息</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="#">发起预约请求</a>
							</li>
						</ul>
						<div>
							<div> <span>同城空闲儿童：</span><span class="badge badge-info">10</span></div>

						</div>
					</div>
					<div class="right1">
						<script type="text/javascript"src="http://api.map.baidu.com/api?v=3.0&ak=8ZN0SG7CiGxsEArLdtY5qBnuWhkEwohs"></script>
						
						<div style="height:600px;">

							<div id="allmap"></div>
						</div>
						<script src="./map.js"></script>
					</div>

				</div>
			</div>

			<div class="citySocial-map">


			</div>


		</div>
	</section>
	<!-- /.team-section -->

	<!-- Facilities Section -->
	<section class="facility-section">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-xs-12">
					<div class="title-with-icon text-center">

						<p class="subtitle-2 font-weight-bold">
							&copy;2019 贝小乐
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.facility-section -->

	<!-- Footer Section -->
	<footer class="footer-section">
		<div class="container">
			<div class="row">
			</div>
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