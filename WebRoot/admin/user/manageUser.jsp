<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>manageUser</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="admin/common/common.css">
<link rel="stylesheet" href="admin/user/user.css">
<link rel="stylesheet" href="admin/user/manageUser.css">
</head>

<body>
	<!-- 虚化层 -->
	<div id="back" disabled="disabled"></div>

	<div class="admin">
		<div class="admin-left">
			<%@include file="../common/left.jsp"%>
		</div>

		<div class="admin-right">
			<%@include file="../common/rightHeader.jsp"%>
			<div class="con">

				<div class="con-next">
					<div class="title1">已被禁用户</div>
					<div class="table-responsive ">
						<table class="table table-striped table-bordered table-hover">
							<thead class=" table-success">
								<tr>
									<th></th>
									<th></th>
									<th>用户名</th>
									<th>姓名</th>
									<th>性别</th>
									<th>手机</th>
									<th>类型</th>
									<th>注册时间</th>
									<th>账号状态</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${manageUserList}" var="p" varStatus="vs">
									<tr>
										<td></td>
										<td>${vs.count }</td>
										<td><a href="javascript:void(0)" class="showThis">${p.userID}</a></td>
										<td>${p.userName}</td>
										<td>${p.gender eq true?"男":"女"}</td>
										<td>${p.phone}</td>
										<td class="type">${p.type eq true?"超级管理员":"普通管理员" }</td>
										<td>${fn:substring(p.registerTime,0,10)}</td>
										<td class="allStatus">${p.status eq true?"正常":"已停用"}</td>
										<td class="operateTD">
											<div class="operate">
												<input type="checkbox" value="${p.status}" id="${p.userID}"
													name="blockUser" /> <label for="${p.userID}"> <span
													class="word"></span> <ins class="userID"
														style="display: none;">${p.userID}</ins>
												</label>
											</div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>

					<div class="intro-more" style="display:none;">
						<span></span>
					</div>
					<div class="change-result" style="display:none;"></div>

					<div class="all-info alert-warning fade show">
						<button type="button" class="btn close mr-3 px-2 bg-danger">&times;</button>
						<table class="table table-striped table-bordered table-hover">
							<c:forEach items="${manageUserList}" var="p" varStatus="vs">
								<tbody class="${p.userID}">
									<tr>
										<td>用户名：</td>
										<td colspan="3"><a href="javascript:void(0)">${p.userID}
												<span class="badge badge-light">${p.status eq true?"正常":"已停用"}</span>
												<span class="badge badge-warning">${p.type eq true?"超级管理员":"普通管理员" }</span>
										</a>
										</td>
									</tr>
									<tr>
										<td>姓名：</td>
										<td>${p.userName}</td>
										<td>性别：</td>
										<td>${p.gender eq true?"男":"女"}</td>
									</tr>
									<tr>
									<td>手机：</td>
										<td>${p.phone}</td>
										<td>注册时间：</td>
										<td>${p.registerTime}</td>
									</tr>
								</tbody>
							</c:forEach>

						</table>

					</div>

				</div>

			</div>
		</div>

	</div>


	<script src="static/js/jquery-3.3.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="admin/common/common.js"></script>
	<script src="admin/user/user.js"></script>

</body>
</html>
