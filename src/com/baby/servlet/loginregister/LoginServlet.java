package com.baby.servlet.loginregister;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.baby.service.loginregister.impl.LoginRegisterServiceImpl;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/loginregister/login.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parentID = request.getParameter("username");
		String password = request.getParameter("password");
		if(new LoginRegisterServiceImpl().loginCheck(parentID, password)){
			HttpSession session = request.getSession();
			session.setAttribute("userID", parentID);
			response.sendRedirect("index");
		}
	}

}
