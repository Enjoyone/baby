package com.baby.service.admin.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baby.entity.Admin;
import com.baby.entity.Parent;
import com.blog.dao.admin.impl.AdminDaoImpl;



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
		List<User> userList = new ArrayList<>();
		userList=backUser();
		
		int userNum=userList.size();
		
		int[] monthListActive=new int[30];
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
	    java.sql.Date sdate = null; //初始化 
	    
	    Date now =new Date();
		for (User user : userList) {
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
//	返回屏蔽的文章
	public List<Article> backBlockArticle() {
		List<Article> articleList = new ArrayList<>();
		List<Article> blockArticleList = new ArrayList<>();
		articleList=backArticle();
		for (Article article : blockArticleList) {
			if (!article.isArticleBlock()&&!article.isArticleDraft()) {
				blockArticleList.add(article);
			}
		}
		return blockArticleList;
	}

	
	public Object[] backBlockUser() {
		List<User> userList = new ArrayList<>();
		List<User> blockUserList = new ArrayList<>();
		userList=backUser();
		for (User user : userList) {
			if (!user.isStatus()) {
				blockUserList.add(user);
			}
		}
		
		List<Admin> adminList = new ArrayList<>();
		List<Admin> blockAdminList = new ArrayList<>();
		
		Map<String, String> maps=new HashMap<>();
		adminList=backAdmin(maps);
		for (Admin admin : adminList) {
			if (!admin.isStatus()) {
				blockAdminList.add(admin);
			}
		}
				
		Object[] objects=new Object[2];
		objects[0]=blockUserList;
		objects[1]=blockAdminList;
		return objects;
	}

	public List<User> backNormalUser() {
		List<User> userList = new ArrayList<>();
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
		
		List<User> userList=new ArrayList<>();
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
		
		if (admin.getUserPWD().equals(userPWD)) {
			return admin;
		}else{
			return null;
		}
	}

	public List<AppealArticle> backAppealArticle() {
		
		return new AdminDaoImpl().backAppealArticles();
	}

	public boolean isDealAppealArticle(String articleID) {
		List<AppealArticle> appealArticles=new ArrayList<>();
		appealArticles=backAppealArticle();
		boolean s=false;
		for (AppealArticle appealArticle : appealArticles) {
			if (!articleID.equals(appealArticle.getArticleID())) {
				return true;
			}
		}
		return s;
	}
}
