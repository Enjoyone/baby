package com.baby.servlet.loginregister;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baby.entity.Parent;
import com.baby.service.loginRegister.impl.LoginRegisterServiceImpl;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/loginRegister/register.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		Parent parent =new Parent();
		parent.setParentID(request.getParameter("username"));
		parent.setPwd(request.getParameter("password"));
		parent.setSex(request.getParameter("sex"));
		if(new LoginRegisterServiceImpl().addParent(parent)){
			response.sendRedirect("login");
			return;
		}
//		<label class="sr-only" for="id">用户名</label> <input type="text"
//				name="id" placeholder="用户名..."
//				class="form-first-name form-control" id="id">
//		</div>
//		<div class="form-group">
//			<label class="sr-only" for="name">姓名</label> <input
//				type="text" name="name" placeholder="姓名..."
//				class="form-last-name form-control" id="name">
//		</div>
//		<div class="form-group">
//			<label class="sr-only" for="pwd1">密码</label> <input
//				type="password" name="pwd1" placeholder="密码..."
//				class="form-pwd form-control" id="pwd1">
//		</div>
//		<div class="form-group">
//			<label class="sr-only" for="pwd2">密码</label> <input
//				type="password" name="pwd2" placeholder="再次输入..."
//				class="form-pwd form-control" id="pwd2">
//		</div>
//
//		<button type="submit" class="btn">注册</button>
//	</form>
//	
		
		
		
	}
}
