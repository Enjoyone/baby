package com.baby.servlet.loginRegister;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baby.entity.Parent;
import com.baby.service.loginregister.impl.LoginRegisterServiceImpl;
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
		parent.setParentID(request.getParameter("id"));
		parent.setName(request.getParameter("name"));
		parent.setPwd(request.getParameter("pwd1"));
		if(new LoginRegisterServiceImpl().addParent(parent)){
			response.sendRedirect("login");
			return;
		}else{
			return;
		}
		
		
	}
}
