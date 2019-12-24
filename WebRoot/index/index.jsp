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
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Include All Css -->
<link rel="stylesheet" href="static/css/magnific-popup.css">
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/animate.css">
<link rel="stylesheet" href="static/css/fonts.css">
<link rel="stylesheet" href="static/css/preset.css">
<link rel="stylesheet" href="static/css/responsive.css">


<link rel="stylesheet" href="static/otherCss/style.css">


<link rel="stylesheet" href="index/index.css">

</head>

<body>
	<div>
		<%@include file="../headerFooter/header.jsp"%>
	</div>

	<!-- Breadcrumb  -->
	<section class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-xs-12 text-center">
					<div class="breadcrumb-content">
						<div class="indexShow">
							<div>
								<div>Play!</div>
								<div class="two">
									<img src="static/images/index/map.png" alt=""> <a
										href="kidSocial">儿童社交</a>
								</div>
							</div>
							<div>
								<div>Share!</div>
								<div class="two">
									<a href="community">日记社区</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.breadcrumb-section  -->

	<!-- Classes Section -->
	<section class="classes-section-2">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-xs-12">
					<div class="class-sort-btn-section">
						<ul class="sort-btn pull-left">
							<li class="active filter" data-filter="mix"><a href="#">All</a></li>
							<li class="filter" data-filter="kinder" id="kinder"><a
								href="#">&lt;1岁</a></li>
							<li class="filter" data-filter="play" id="play"><a href="#">1-3岁</a></li>
							<li class="filter" data-filter="primary" id="primary"><a
								href="#">3-5岁</a></li>
							<li class="filter" data-filter="story" id="story"><a
								href="#">&gt;5岁</a></li>
						</ul>
						<form method="post" action="#" class="class-search pull-right">
							<input type="search" name="search" placeholder="Search">
							<button type="submit">
								<i class="fa fa-search"></i>
							</button>
						</form>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="row index-con">
				<div class="index1">
					<div>
						<div class="title">管孩子可是门大学问！</div>

						<div class="content">现在的爸爸妈妈在管孩子上可以说是左右不讨好，
							教吧，就会有人说你教错了；不教吧，就会有人说你竟然不教育孩子。 真是骑虎难下！这种左右为难的情况要怎么解决，可是门大学问。</div>
					</div>
					<div>
						<div class="title">宝宝呛奶怎么办</div>

						<div class="content">对于宝宝来说呛奶是一件非常常见的事情，
							相信很多宝宝都出现过这样的情况。其实要解决这样的问题也是非常简单的， 爸爸妈妈快来一起看看要怎么处理吧！</div>
					</div>
					<div>
						<div class="title">宝宝尿布的选择和洗涤技巧</div>

						<div class="content">宝宝刚刚出生的时候皮肤是非常娇嫩的。一个不小心就会皮肤过敏，
							所以爸爸妈妈对于尿布的选择是一定要注意的。 好的尿布能够让宝宝觉得非常自在，同时也会更加安心睡觉。
							接下来就跟大家来讲讲怎么样挑选尿布吧！</div>
					</div>
					<div>
						<div class="title">宝宝食欲不振，肝气郁结怎么办？</div>

						<div class="content">小宝宝肝气过旺的时候可能会导致脾气虚弱，人体内脏息息相关，
							肝火旺盛会影响了胃功能，从而影响了小儿的食欲， 很多在小儿科就诊的宝宝经常就是因为胃功能影响导致了厌食，偏食等症状，
							而孩子肠胃不佳的时候还会容易引起情绪焦躁，睡眠不安等。</div>
					</div>

				</div>
				<div class="index2">
					<aside class="widget">
						<h4 class="widget-title">日记精选</h4>
						<ul>
							<li><a href="#"><span class="cat-name">宝宝食欲不振，肝气</span><span
									class="cat-count">&&</span></a></li>
							<li><a href="#"><span class="cat-name">宝宝食欲不振，肝气</span><span
									class="cat-count">&&</span></a></li>
							<li><a href="#"><span class="cat-name">宝宝食欲不振，肝气</span><span
									class="cat-count">&&</span></a></li>
						</ul>
					</aside>
				</div>









			</div>
			<div class="row">
				<div class="col-sm-12 col-xs-12 text-center">
					<ul class="paginations">
						<li><a href="#"><i class="icon-prev"></i></a></li>
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
						<li><a href="#"><i class="icon-next"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
	</section>

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