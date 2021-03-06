<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<head>
<base href="<%=basePath%>">
<title>articleShow</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="article/articleShow/articleShow.css">
<link rel="stylesheet" href="article/articleShow/comment.css">
<link rel="stylesheet" href="article/articleShow/support/Css/demo.css">
</head>

<body>

	<div id="result"></div>
	<div class="container">
		<c:forEach items="${articleList}" var="p" varStatus="vs">
			<div>
				<span class="articleID" style="display: none;">${p.articleID}</span>
				<p class="article-title text-center p-2">${p.articleTitle }</p>
				<p class="article-inf text-center">
					<a href="userIndex?userID=${p.userInfo.userID }">${p.userInfo.userID }</a>
					<span>字数</span><span class="article_word">${p.articleContent.length() }</span>
					<span
						class="article_time">${p.launchTime }</span>
				</p>
			</div>
			<div class="pl-2 pr-2">${p.articleContent}</div>
			<hr>
			<div class="article-oprate">
				<!-- 点赞 -->
				<div class="praise">
					<span id="praise">
					<c:if test="${isSupport eq true }">
					<img src="article/articleShow/support/Images/yizan.png" id="praise-img" />
					</c:if>
					<c:if test="${isSupport eq false}">
					<img src="article/articleShow/support/Images/zan.png" id="praise-img" />
					</c:if>
					
					</span>

					<span id="praise-txt">${p.supportNum }</span> <span id="add-num"><em>+1</em></span>
				</div>

				<!-- 评论 -->
				
				<div>
					<div class="comment-icon">
						<div>
							<div></div>
							<div></div>
							<div></div>
						</div>
						<div class="out"></div>
						<div class="in"></div>
						<span>${p.commentNum }</span>
					</div>
					
				</div>

			</div>
		</c:forEach>


		<div class="comment">
			<div class="alert-warning to-comment">
				<div>
					<input type="text" class=" form-control" placeholder="评论">
					<div>
						<span class="words">0</span><span>/50</span>
					</div>
				</div>
				<div>
					<button class="btn btn-success sub" type="button">发布</button>
					<button class="btn btn-info cancel" type="button">取消</button>
				</div>
			</div>

			<div class="comment-con">
			
			
			
			
			</div>

		</div>

	</div>
	</div>

	<script src="static/js/jquery-3.3.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="article/articleShow/support/support.js"></script>
	<script src="article/articleShow/articleShow.js"></script>



</body>
</html>
