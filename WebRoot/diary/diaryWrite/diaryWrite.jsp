<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>write</title>

	<link rel="stylesheet" href="static/css/magnific-popup.css">
	<link rel="stylesheet" href="static/css/font-awesome.min.css">
	<link rel="stylesheet" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" href="static/css/animate.css">
	<link rel="stylesheet" href="static/css/fonts.css">
	<link rel="stylesheet" href="static/css/preset.css">
	<link rel="stylesheet" href="static/otherCss/style.css">
	<link rel="stylesheet" href="static/css/responsive.css">
	

<link rel="stylesheet" href="diary/diaryWrite/diaryWrite.css">

</head>

<body>

<div>
	<%@include file="../../headerFooter/header.jsp" %>
	</div>
	<div class="container container-write">
		<!-- 提示 -->
		<div class="result alert-info"></div>
		<form class="form-group write-form" action="write" method="post">
			<div class="input-group">

				<label for="article_title">日记标题： <input type="text"
					name="article_title" id="article_title" placeholder="请输入标题"
					value="<c:if test="${isExited eq '1'}">${diary.diaryTitle}</c:if>"
					autocomplete="off"> <span style="font-size: 15px;">字数：<span
						class="title-words">0</span>/<span class="title-max-words">25</span></span>
				</label>
			</div>

			<div class="form-inline">
				<label class="">日记类型： <select name="article_type"
					class="form-control mr-3">

						<c:forEach items="${diaryTypes}" var="p" varStatus="status">
							<c:choose>

								<c:when test="${p.diaryTypeID eq diary.diaryType.diaryTypeID }">
									<option value="${diary.diaryType.diaryTypeID}"
										selected="selected">${diary.diaryType.diaryTypeName}</option>
								</c:when>
								<c:otherwise>
									<option value="${p.diaryTypeID}">${p.diaryTypeName}</option>
								</c:otherwise>

							</c:choose>

						</c:forEach>

						<option value="-1" disabled>————</option>
						<option value="0" class="new-article-type">新建类型</option>

				</select> <span style="display: none" class="addResult"></span>
					<div class="add-articleType input-group mb-auto" style="display: none;">

						<input type="text" class="form-control" placeholder="文章类型名称"
							name="new_type_name">
						<div class="input-group-append">
							<button type="button" class="btn btn-success add-type">添加</button>
							<button type="button" class="btn btn-warning close-type">取消</button>
						</div>
						<span class="type-warning" style="color: red;display: none;">已存在！</span>
					</div>
				</label>
			</div>

			<div>
				<span class="textarea1">文本域：</span>
				<div id="article_con">
					<c:if test="${isExited eq '1'}">${diary.diaryContent}</c:if>
				</div>
				<textarea id="article_con2"
					style="width:100%; height:200px;display: none;"></textarea>
				<div class="text-right">
					<span class="badge badge-pill badge-danger over-words"
						style="display: none">!</span> <span>字数：</span> <span
						class="now-words">0</span> <span>/</span> <span class="max-words">4000</span>
				</div>
			</div>

			<hr>
			<div class="submit-info"></div>
			<div class="article_final">
				<div class="btn-group ">

					<span class="isExited" style="display: none;">
						${isExited}
					</span>
					<!--  -->
					<span style="display: none;">
						<c:if test="${isExited eq '1'}">
						<span class="articleID">${article.articleID}</span>
						</c:if>
						<c:if test="${isExited eq '0'}"><span class="articleID">0</span></c:if>
					</span>
					
					<button type="button" class="btn btn-primary submit-button">立即提交</button>
				</div>
			</div>
		</form>
	</div>
	
	<div>
	<%@include file="../../headerFooter/footer.jsp" %>
	</div>
	<!-- Include All JavaScript -->
	<script src="static/js/jquery-3.3.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/mixIt.js"></script>
	<script src="static/js/jquery.magnific-popup.min.js"></script>
	<script src="static/js/main.js"></script>
	
	
	<script src="diary/diaryWrite/diaryWrite.js"></script>
	<script src="static/editor/wangEditor.min.js"></script>
	<script src="diary/diaryWrite/editor.js"></script>

</body>

</html>

