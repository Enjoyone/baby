<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Header Area -->
<header class="header-area inner-page">
	<!-- /.header-top -->
	<nav class="navigation">
		<div class="logo pull-left">
			<a href="index">贝小乐</a>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-xs-12">

					<ul class="main-menu pull-left">
						<li><a href="index">首页</a></li>
						<li><a href="#">关于</a></li>
						<li class="menu-has-child"><a href="#">计划</a>
							<ul>
								<li><a href="#">未来</a>
									<ul>
										<li><a href="#">Event</a></li>
									</ul></li>
								<li><a href="#">所有</a></li>
							</ul></li>
						<li><a href="#">同城</a>
							<ul>
								<li><a href="#">Classes Details</a></li>
							</ul></li>
						<li><a href="#" id="search-pop"><i class="fa fa-search"></i></a>
						</li>
					</ul>
					<ul class="main-menu pull-right">

						<c:choose>
							<c:when test="${parentID!=null}">
								<li class="menu-has-child"><a href="#">${parentID}</a>
									<ul>
										<li><a href="#">个人中心</a></li>
										<li><a href="logout">退出</a></li>
									</ul></li>
							</c:when>
							<c:otherwise>
								<li class="nav-item login_reg"><a href="login">登录</a> <a
									href="register">注册</a></li>
							</c:otherwise>
						</c:choose>


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
