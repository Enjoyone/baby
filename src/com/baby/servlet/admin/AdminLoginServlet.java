package com.baby.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.baby.entity.Admin;
import com.baby.service.admin.impl.AdminServiceImpl;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/admin/login/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userID=request.getParameter("userID");
		String userPWD=request.getParameter("userPWD");
		
		if (new AdminServiceImpl().loginCheck(userID,userPWD)) {
			HttpSession hs = request.getSession();
			hs.setAttribute("adminID", userID);
			response.sendRedirect("admin");
			return;
		}else{
			response.sendRedirect("adminLogin?error=yes");
            return;
		}
	}

}
