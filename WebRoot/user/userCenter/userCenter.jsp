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
	<title>usercenter</title>
	<meta charset="UTF-8">
	<!-- Include All Css -->
	<link rel="stylesheet" href="static/css/font-awesome.min.css">
	<!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
	<link rel="stylesheet" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" href="static/css/animate.css">
	<link rel="stylesheet" href="static/css/fonts.css">
	<link rel="stylesheet" href="static/css/preset.css">
	<link rel="stylesheet" href="static/otherCss/style.css">
	<link rel="stylesheet" href="static/css/responsive.css">
    <link rel="stylesheet" href="user/userCenter/userCenter.css">
    <link rel="stylesheet" href="headerFooter/header.css">

</head>

<body>
	<div>
	<%@include file="/headerFooter/header.jsp"%>
	</div>
	<!-- Breadcrumb  -->
	<section class="breadcrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-xs-12 text-center">
					<div class="breadcrumb-content">
						<h2>个人中心</h2>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /.breadcrumb-section  -->


	<!-- Team Section -->
	<section class="team-section">
        <div class="container">
            <ul class="main-menu limenu">
                <li class="da">日记</li>
                <li class="inf">资料</li>
                <li class="colle">收藏记录</li>
                <li class="add">添加孩子<strong>+</strong></li>
            </ul>
            

            <div class="dairy-list">
                <div class="dairy card">
                    <div class="card-body">
                        <h4 class="card-title">Card title</h4>
                        <p class="card-text">Some example text. Some example text.</p>
                        <a href="#" class="card-link">#旅游</a>
                        <a href="#" class="card-link">更多</a>
                      </div>
                </div>
                <div class="dairy card">
                    <div class="card-body">
                        <h4 class="card-title">Card title</h4>
                        <p class="card-text">Some example text. Some example text.</p>
                        <a href="#" class="card-link">#旅游¸</a>
                        <a href="#" class="card-link">更多</a>
                      </div>
                </div>
            </div>


            <div class="userinfo card container">
                <div class="card-body ">
                    <p>Tommy</p>
                    <p>女</p>
                    <p>生日：1990-5-1</p>
                    <p>孩子：Jan,Mary</p>
                    <p>Phone:100xxxx0000</p>
                </div>
                   <button class="btn">修改</button> 
            </div>


            <div class="collect-list">
                <div class="collect card">
                    <div class="card-body">
                        <h4 class="card-title">Card title</h4>
                        <p class="card-text">Some example text. Some example text.</p>
                        <a href="#" class="card-link">取消收藏</a>
                        <a href="#" class="card-link">更多</a>
                      </div>
                </div>

            </div>

            <div class="addkid">
                <form action="">
                    <div class="form-group">
                        	姓名：	<input class="form-control"  name="kidName" type="text">
                    </div>
                    <div class="form-group">
                       		 性别: <input name="sex" type="radio" value="男">男孩
                              <input name="sex" type="radio" value="女">女孩
                    </div>
                    <div class="form-group">
                       		 出生日期：<input class="form-control"  name="kiDbirth" type="text">
                    </div>
                    <button  class="btn btn-primary" type="submit"> 添加</button>
                </form>
            </div>

        </div>




	</section>
	<!-- /.team-section -->

<%@ include file="/headerFooter/footer.jsp" %>
	<!-- Include All JavaScript -->
	<script src="static/js/jquery-3.3.1.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <script src="user/userCenter/userCenter.js"></script>


</body>

</html>