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
	<title>plan</title>
	<meta charset="UTF-8">

	<!-- Include All Css -->
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
	<link rel="stylesheet" href="static/css/magnific-popup.css">
	<link rel="stylesheet" href="static/css/font-awesome.min.css">
	<link rel="stylesheet" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" href="static/css/animate.css">
	<link rel="stylesheet" href="static/css/fonts.css">
	<link rel="stylesheet" href="static/css/preset.css">
	<link rel="stylesheet" href="static/otherCss/style.css">
	<link rel="stylesheet" href="static/css/responsive.css">

	<link rel="stylesheet" href="./plan.css">

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
						<h2>Plan</h2>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.breadcrumb-section  -->

	<section class="classes-section-3">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-xs-12">
					<div class="class-sort-btn-section">
						<ul class="sort-btn pull-left">
							<li><a href="#">添加</a></li>
							<li><a href="#">日历</a></li>
							<li><a href="#">所有</a></li>
						</ul>
						<form method="post" action="#" class="class-search pull-right">
							<input type="search" name="search" placeholder="Search">
							<button type="submit"><i class="fa fa-search"></i></button>
						</form>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<!-- Event Section -->
	<section class="event-section">
		<div class="container">


			<div class="plan-show">
				<div class="row">
					<div class="col-sm-6 col-xs-12">
						<div class="single-event">
							<div class="event-img">
								<img src="images/event/thumb1.jpg" alt="">
								<div class="class-hover">
									<a class="popup" href="images/event/thumb1.jpg"><i class="icon-link"></i></a>
								</div>
								<a href="#">1日<span>12月</span></a>
							</div>
							<h3><a href="#">拜访英语老师</a></h3>
							<a href="#">14:00 - 16:00</a>
							<a href="#">幼儿园</a>
							<p>
								去幸福幼儿园拜访孩子的英语老师
							</p>
						</div>
						<div class="single-event">
							<div class="event-img">
								<img src="images/event/thumb3.jpg" alt="">
								<div class="class-hover">
									<a class="popup" href="images/event/thumb3.jpg"><i class="icon-link"></i></a>
								</div>
								<a href="#" class="bg2">3日<span>12月</span></a>
							</div>
							<h3><a href="#">打疫苗</a></h3>
							<a href="#">9:00 - 11:00</a>
							<a href="#">社区卫生院</a>
							<p>
								记得带户口本,接种证
							</p>


						</div>
						<div class="single-event">
							<div class="event-img">
								<img src="images/event/thumb5.jpg" alt="">
								<div class="class-hover">
									<a class="popup" href="images/event/thumb5.jpg"><i class="icon-link"></i></a>
								</div>
								<a href="#" class="bg3">8日<span>12月</span></a>
							</div>
							<h3><a href="#">体检</a></h3>
							<a href="#">14:00 - 15:00</a>
							<a href="#">市人民医院</a>
							<p>
								带户口本身份证
							</p>
						</div>

					</div>
					<div class="col-sm-6 col-xs-12">
						<div class="single-event">
							<div class="event-img">
								<img src="images/event/thumb2.jpg" alt="">
								<div class="class-hover">
									<a class="popup" href="images/event/thumb2.jpg"><i class="icon-link"></i></a>
								</div>
								<a href="#" class="bg4">9日<span>12月</span></a>
							</div>
							<h3><a href="#">买幼儿教育书籍</a></h3>
							<a href="#">14:00 - 16:00</a>
							<a href="#">跑马街新华书店</a>
							<p>
								英语，数学，国学，启蒙教育
							</p>
						</div>
						<div class="single-event">
							<div class="event-img">
								<img src="images/event/thumb4.jpg" alt="">
								<div class="class-hover">
									<a class="popup" href="images/event/thumb4.jpg"><i class="icon-link"></i></a>
								</div>
								<a href="#" class="bg5">20<span>1/span></a>
							</div>
							<h3><a href="#">和小朋友玩耍</a></h3>
							<a href="#">14:00 - 16:00</a>
							<a href="#">和平街10号</a>
							<p>
								带上自己的玩具
							</p>
						</div>
					</div>
				</div>
				<div class="recommend-plan">
					<div class="text-center p-3">
						推荐计划
					</div>
					<hr>
					<div>
						<img src="./images/recommend/图片1.png" alt="qwe">
						<span class="badge badge-pill badge-danger">水痘疫苗</span>
					</div>

				</div>
			</div>

			<div class="row">
				<div class="col-sm-12 col-xs-12">
					<ul class="paginations post-pagi">
						<li><a href="#"><i aria-hidden="true" class="fa fa-angle-left"></i></a></li>
						<li><a href="#">1</a></li>
						<li class="active"><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">6</a></li>
						<li><a href="#">7</a></li>
						<li><a href="#">8</a></li>
						<li><a href="#">9</a></li>
						<li><a href="#">10</a></li>
						<li><a href="#"><i aria-hidden="true" class="fa fa-angle-right"></i></a></li>
					</ul>
				</div>
			</div>


		</div>
	</section>
	<!-- /.event-section -->

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