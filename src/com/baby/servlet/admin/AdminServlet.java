package com.baby.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminServlet",urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	HttpSession hs = request.getSession();
//		String userID=(String) hs.getAttribute("adminID");
//		if (userID!=null) {
			
			request.getRequestDispatcher("/admin/index/index.jsp").forward(request,response);
//			return;
//		}else{
//			response.sendRedirect("adminLogin");
//			return;
//		}
    }
}
