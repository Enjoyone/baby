package com.baby.servlet.loginregister;

import java.io.IOException;
import java.io.PrintWriter;

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
		request.getRequestDispatcher("register.jsp").forward(request, response);
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
		}
	}

}
