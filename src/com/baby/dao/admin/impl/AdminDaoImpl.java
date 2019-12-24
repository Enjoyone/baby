package com.baby.dao.admin.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.blog.dao.admin.AdminDao;
import com.blog.dao.common.impl.CommonDaoImpl;
import com.blog.entity.Admin;
import com.blog.entity.AppealArticle;
import com.blog.entity.Article;
import com.blog.entity.ArticleType;
import com.blog.entity.User;

public class AdminDaoImpl implements AdminDao {

	public List<Admin> backAdmin(Map<String, String> maps) {
		ResultSet rs = null;
		// 声明变量
		Admin admin = null;
		List<Admin> adminList = new ArrayList<>();
		String sql = null;
		Object[] param = null;
		if (maps.size() < 1) {
			sql = "select * from adminInfo";
		} else {
			sql = "select * from adminInfo where userID=?";
			param = new Object[1];
			param[0] = maps.get("userID");
		}
		// 加载驱动
		try {
			rs = new CommonDaoImpl().executeQuery(sql, param);
			while (rs.next()) {
				admin = new Admin();
				admin.setUserID(rs.getString("userID"));
				admin.setUserName(rs.getString("userName"));
				admin.setUserPWD(rs.getString("userPWD"));
				admin.setRegisterTime(rs.getString("registerTime"));
				admin.setGender(rs.getBoolean("gender"));
				admin.setPhone(rs.getString("phone"));
				admin.setType(rs.getBoolean("type"));
				admin.setStatus(rs.getBoolean("status"));
				adminList.add(admin);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			new CommonDaoImpl().close();
		}

		return adminList;
	}

	public Boolean changeUserStatus(String userID, boolean toStatus) {
		boolean success = false;

		String sql = null;
		Object[] param = null;
		int i = -1;

		sql = "update userInfo set status=? where userID=?";
		param = new Object[2];
		param[0] = toStatus;
		param[1] = userID;

		try {
			i = new CommonDaoImpl().executeUpdate(sql, param);
			if (i > 0) {
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return success;

	}
	
	
	public List<AppealArticle> backAppealArticles(){
		List<AppealArticle> appealArticles=new ArrayList<>();
		
		ResultSet rs=null;
		AppealArticle appealArticle=null;
		User user=null;
		String sql="select * from AppealArticle";
		Object[]param=null;
		
		try {
			rs=new CommonDaoImpl().executeQuery(sql, param);
			while(rs.next()){
				appealArticle=new AppealArticle();
				appealArticle.setAppealArticleID(rs.getInt("appealArticleID"));
				appealArticle.setArticleID(rs.getInt("articleID"));
				appealArticle.setCon(rs.getString("con"));
				user=new User();
				user.setUserID(rs.getString("userID"));
				appealArticle.setUser(user);
				appealArticles.add(appealArticle);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return appealArticles;

	}


	public List<Article> articlePageDao(int pageIndex,int pageSize) {
		ResultSet rs = null;
		// 声明变量
		String sql="select top (select ?) * from "
				+ "(select row_number() over(order by articleID) as rownumber,* from articleShow) "
				+ "temp_row where rownumber>(?-1)*?";
		Article article = null;
		User userInfo = null;
		ArticleType articleType = null;
		List<Article> articleList = new ArrayList<>();

		Object[] param = new Object[3];
		param[0]=pageSize;
		param[1]=pageIndex;
		param[2]=pageSize;
		
		try {
			rs = new CommonDaoImpl().executeQuery(sql, param);
			while (rs.next()) {
				
				article = new Article();
				userInfo = new User();
				articleType = new ArticleType();
				article.setArticleID(rs.getInt("articleID"));
				article.setArticleTitle(rs.getString("articleTitle"));
				articleType.setArticleTypeID(rs.getInt("articleTypeID"));
				articleType.setArticleTypeName(rs.getString("articleTypeName"));
				article.setArticleType(articleType);

				article.setArticleContent(rs.getString("articleContent"));
				userInfo.setUserID(rs.getString("userID"));
				article.setUserInfo(userInfo);

				article.setLaunchTime(rs.getString("launchTime"));
				article.setLatestChangeTime(rs.getString("latestChangeTime"));
				article.setSupportNum(rs.getInt("supportNum"));
				article.setCommentNum(rs.getInt("commentNum"));
				article.setArticlePublic(rs.getBoolean("articlePublic"));
				article.setArticleComment(rs.getBoolean("articleComment"));
				article.setArticleShare(rs.getBoolean("articleShare"));
				article.setArticleDraft(rs.getBoolean("articleDraft"));
				article.setArticleBlock(rs.getBoolean("articleBlock"));

				articleList.add(article);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			new CommonDaoImpl().close();
		}
		return articleList;
	}

	
	
	
	
	
	
	



}
