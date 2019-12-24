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

import com.baby.service.admin.impl.AdminServiceImpl;

@WebServlet("/adminAffair")
public class AdminAffair extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operateType=request.getParameter("operateType");
		if (operateType.equals("userStatus")) {
			changeUserStatus(request,response);
		}
		
	}

	private void changeUserStatus(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
//		
		PrintWriter out = response.getWriter();
		
		String operateCon=request.getParameter("operateCon");
		boolean toStatus=operateCon.equals("lock")?false:true;
		String userID=request.getParameter("userID");
//		放回用户修改后的状态，和是否修改成功
		List<Boolean> result=new ArrayList<>();
		result=new AdminServiceImpl().changeUserStatus(userID,toStatus);
//		[0]  true 表示修改成功    [1] 表示最终状态 
		String finalStatus=null;
		
		if (result.get(0)) {
//			修改成功
			finalStatus=result.get(1).equals(true)?"1":"0";
			out.print(finalStatus);
		}else{
			out.print("-1");
		}

	}
	
	
	

}
