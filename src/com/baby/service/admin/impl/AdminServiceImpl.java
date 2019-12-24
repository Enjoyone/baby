package com.baby.service.admin.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baby.dao.admin.impl.AdminDaoImpl;
import com.baby.dao.loginregisterdao.impl.LoginRegisterDaoImpl;
import com.baby.entity.Admin;
import com.baby.entity.Article;
import com.baby.entity.ArticleType;
import com.baby.entity.Parent;
import com.baby.service.admin.AdminService;




public class AdminServiceImpl implements AdminService {

	public List<Article> backArticle() {
		List<Article> articleList = new ArrayList<>();
		Map<String, String> maps=new HashMap<String, String>();
		articleList = new ArticleBaseDaoImpl().articleShowDao(maps);
		return articleList;
	}

	public List<Parent> backUser() {
		List<Parent> userList = new ArrayList<>();
		Map<String, String> maps=new HashMap<String, String>();
		userList = new LoginRegisterDaoImpl().backUser(maps);
		return userList;
	}
	
	public List<Admin> backAdmin(Map<String, String> maps) {
		List<Admin> adminList = new ArrayList<>();
		adminList = new AdminDaoImpl().backAdmin(maps);
		return adminList;
	}
	
	public List<ArticleType> backType() {
		List<ArticleType> typeList = new ArrayList<>();
		Map<String, String> maps=new HashMap<String, String>();
		typeList = new ArticleBaseDaoImpl().articleTypeShowDao(maps);
		return typeList;
	}
	
	
//	
	public Object[] backAboutUser() {
		List<Parent> parentList = new ArrayList<>();
		parentList=backUser();
		
		int userNum=parentList.size();
		
		int[] monthListActive=new int[30];
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
	    java.sql.Date sdate = null; //初始化 
	    
	    Date now =new Date();
		for (Parent parent : parentList) {
			try { 
//				时间
				java.util.Date udate = df.parse(""); 
				if (now.getMonth()==udate.getMonth()) {
					sdate = new java.sql.Date(udate.getTime()); //2013-01-14 
					int day=sdate.getDate();
					monthListActive[day-1]++;
					System.out.println(day);
					System.out.println(sdate);
				}

				} catch (ParseException e) { 

				e.printStackTrace(); 

			}
		}
		
		Object[] objects=new Object[2];
		objects[0]=userNum;
		objects[1]=monthListActive;
		
		return objects;
	}
	
	
	public Object[] backBlockUser() {
		List<Parent> parentList = new ArrayList<>();
		List<Parent> blockUserList = new ArrayList<>();
		parentList=backUser();
		for (Parent user : parentList) {
			if (!user.isStatus()) {
				blockUserList.add(user);
			}
		}
		
		List<Admin> adminList = new ArrayList<>();
		List<Admin> blockAdminList = new ArrayList<>();
		Map<String, String> maps=new HashMap<>();		
		Object[] objects=new Object[2];
		objects[0]=blockUserList;
	
		return objects;
	}

	public List<Parent> backNormalUser() {
		List<Parent> userList = new ArrayList<>();
		userList=backUser();
		return userList;
	}

	public List<Admin> backManageUser() {
		List<Admin> adminList = new ArrayList<>();
		Map<String, String> maps=new HashMap<>();
		adminList=backAdmin(maps);
		return adminList;
	}

	public List<Boolean> changeUserStatus(String userID, boolean toStatus) {
		List<Boolean> finalResult=new ArrayList<>();
		Boolean changeResult=new AdminDaoImpl().changeUserStatus(userID,toStatus);
		
		List<Parent> userList=new ArrayList<>();
		Map<String, String> maps=new HashMap<>();
		maps.put("userID", userID);
		userList=new LoginRegisterDaoImpl().backUser(maps);
		boolean finalStatus=userList.get(0).isStatus();
		
		finalResult.add(changeResult);
		finalResult.add(finalStatus);
		return finalResult;
	}

	public Admin loginCheck(String userID, String userPWD) {
		List<Admin> adminList=new ArrayList<>();
		Map<String, String> maps=new HashMap<>();
		maps.put("userID", userID);
		adminList=backAdmin(maps);
		Admin admin=new Admin();
		admin=adminList.get(0);
		
		if (admin.getPasswod().equals(userPWD)) {
			return admin;
		}else{
			return null;
		}
	}

	@Override
	public List<Article> backBlockArticle() {
		// TODO Auto-generated method stub
		return null;
	}



	
}
