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
	<title>kid</title>
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
					<h2>Kid</h2>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- /.breadcrumb-section  -->

<!-- Classes Section -->
<section class="classes-section-3">
	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-xs-12">
				<div class="class-sort-btn-section">
					<ul class="sort-btn pull-left">
						<li><a href="class.html#kinder">预约</a></li>
						<li><a href="class.html#play">相册</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-6 col-xs-12">
				<div class="class-detail-img">
					<img alt="" src="./images/city-social/1.jpg">
				</div>
			</div>
			<div class="col-sm-6 col-xs-12">
				<div class="class-information">
					<h3>Tom</h3>
					<h5>play basketball</h5>
					<p>
						more introduction
					</p>
				</div>
				<div class="class-meta-data">
					<div class="class-single-meta pull-left">
						<p>Years Old</p>
						<h4>1</h4>
					</div>
					<div class="class-single-meta pull-left">
						<p>性格</p>
						<h4>外向</h4>
					</div>
			</div>
		</div>
	</div>
</section>
<!-- /.classes-section-2 -->

<!-- Subject and teacher Section -->
<section class="subject-and-teacher-details">
	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-xs-12">
				<div class="subject-details">
					<div class="sub-heading"><h4>其他<span>(生活记录)</span></h4><p>+20</p></div>
					
				</div>
			</div>
		</div>
		</div>
	</div>
</section>
<!-- /.subject-and-teacher-details -->
<!-- Related Course Section -->
<section class="related-course-section">
	<div class="container">
		<div class="row">
			
		</div>
	</div>
</section>
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
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>

