package com.baby.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.baby.dao.admin.impl.AdminDaoImpl;
import com.baby.entity.Admin;
import com.baby.entity.Article;
import com.baby.entity.ArticleType;
import com.baby.entity.Parent;
import com.baby.service.admin.impl.AdminServiceImpl;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@WebServlet("/adminWeb")
public class AdminWeb extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession hs = request.getSession();
		String userID=(String) hs.getAttribute("adminID");
		if (userID==null) {                      
			response.sendRedirect("adminLogin");
			return;
		}else{
		
		String web = request.getParameter("web");
	
		if (web.equals("normalUser")) {
			normalUserWeb(request,response);
			return;
		}
		if (web.equals("article")) {
			articleWeb(request,response);
			return;
		}
		
		if (web.equals("diary")) {
			centerWeb(request,response);
			return;
		}
		
		else {
			response.sendRedirect("admin");
			return;
		}
		
		}

	}
// 文章类型
	private void typeWeb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		List<ArticleType> typeList=new ArrayList<>();
		typeList=new AdminServiceImpl().backType();
		request.setAttribute("typeList", typeList);
		request.getRequestDispatcher("/admin/article/type.jsp").forward(
				request, response);
		
	}

	private void articleWeb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		List<Article> articleList=new ArrayList<>();
		// 非第一次请求
		String changeBack=request.getParameter("changeBack");
		if (changeBack!=null) {
			System.out.println("2--->");
			int pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
		//	int pageSize=Integer.parseInt(request.getParameter("pageSize"));
			articleList=new AdminDaoImpl().articlePageDao(pageIndex,10);

			Gson gson = new Gson();
			String articleJson = gson.toJson(articleList);
			
			
			
			out.print(articleJson);
			out.flush();
			out.close();
			return;
		}
		System.out.println("1--->");
		articleList=new AdminDaoImpl().articlePageDao(1,10);
		request.setAttribute("articleList", articleList);
		request.getRequestDispatcher("/admin/article/article.jsp").forward(
				request, response);
	}

	private void normalUserWeb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Parent> normalUserList=new ArrayList<Parent>();
		normalUserList=new AdminServiceImpl().backNormalUser();
		request.setAttribute("normalUserList", normalUserList);
		request.getRequestDispatcher("/admin/user/normalUser.jsp").forward(
				request, response);
		
	}

	private void manageUserWeb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Admin> manageUserList=new ArrayList<>();
		manageUserList=new AdminServiceImpl().backManageUser();
		request.setAttribute("manageUserList", manageUserList);
		request.getRequestDispatcher("/admin/user/manageUser.jsp").forward(
				request, response);
		
	}
	

	private void centerWeb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		request.getRequestDispatcher("/admin/center/center.jsp").forward(
				request, response);
		
	}
	
	private void messageWeb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		request.getRequestDispatcher("/admin/message/message.jsp").forward(
				request, response);
		
	}
	
}
