package com.baby.servlet.diary.diaryWrite;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baby.entity.DiaryType;
import com.baby.service.diary.impl.DiaryServiceImpl;

@WebServlet("/diaryWrite")
public class DiaryWriteServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userID = (String) request.getSession().getAttribute("userID");
		List<DiaryType> diaryTypes = new ArrayList<DiaryType>();
		diaryTypes = new DiaryServiceImpl()
					.diaryTypeShowService(userID);
		request.setAttribute("diaryTypes", diaryTypes);
		request.setAttribute("isExited", "0");
		request.getRequestDispatcher("diary/diaryWrite/diaryWrite.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String userID = (String) request.getSession().getAttribute("userID");

		PrintWriter out = response.getWriter();
		String diaryJson = request.getParameter("diary");

		String isExited = request.getParameter("isExited");

		System.out.println("servlet:" + diaryJson);

		int backDiaryID = 0;
		
		if (isExited.equals("1")) {// 已存在
			System.out.println("isExited=1--->update");
			backDiaryID = new DiaryServiceImpl().updateDiary(userID,
					diaryJson);

		} else {// 不存在
			System.out.println("isExited=0--->insert");
			backDiaryID = new DiaryServiceImpl().addDiary(userID,
					diaryJson);
		}

		System.out.println("backarticleID:"+backDiaryID);

		out.print(backDiaryID);
		out.flush();
		out.close();
		return;
	}

}
