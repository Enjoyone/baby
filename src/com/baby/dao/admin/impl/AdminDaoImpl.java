package com.baby.dao.admin.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baby.dao.DbObject;
import com.baby.dao.admin.AdminDao;
import com.baby.entity.Admin;
import com.baby.entity.Article;
import com.baby.entity.ArticleType;
import com.baby.entity.Diary;
import com.baby.entity.DiaryType;
import com.baby.entity.Parent;

public class AdminDaoImpl implements AdminDao {
	
	public Boolean changeUserStatus(String parentID, boolean toStatus){
		boolean success = false;

		String sql = null;
		Object[] param = null;
		int i = -1;

		sql = "update parent set status=? where parentID=?";
		param = new Object[2];
		param[0] = toStatus;
		param[1] = parentID;

		try {
			i = new DbObject().executeUpdate(sql, param);
			if (i > 0) {
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return success;
		
		
	}

	public List<Article> articlePageDao(int pageIndex,int pageSize){
		ResultSet rs = null;
		// 声明变量
		String sql="select top (select ?) * from "
				+ "(select row_number() over(order by articleID) as rownumber,* from article) "
				+ "temp_row where rownumber>(?-1)*?";
		Article article = null;
		ArticleType articleType = null;
		List<Article> articleList = new ArrayList<>();

		Object[] param = new Object[3];
		param[0]=pageSize;
		param[1]=pageIndex;
		param[2]=pageSize;
		
		try {
			rs = new DbObject().executeQuery(sql, param);
			while (rs.next()) {
				article = new Article();
				articleType = new ArticleType();
				article.setArticleID(rs.getInt("articleID"));
				article.setArticleTitle(rs.getString("articleTitle"));
				articleType.setArticleTypeID(rs.getInt("articleTypeID"));
				articleType.setArticleTypeName(rs.getString("articleTypeName"));
				article.setArticleTypeID(articleType);

				article.setArticleContent(rs.getString("articleContent"));
				

				article.setArticleCreateTime(rs.getString("articleCreateTime"));
				article.setArticleStatus(rs.getBoolean("articleStatus"));
				articleList.add(article);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			new DbObject().close();
		}
		return articleList;
	}
	
	public List<Diary> diaryPageDao(int pageIndex,int pageSize){
		ResultSet rs = null;
		// 声明变量
		String sql="select top (select ?) * from "
				+ "(select row_number() over(order by diaryID) as rownumber,* from diaryShow) "
				+ "temp_row where rownumber>(?-1)*?";
		Diary diary = null;
		Parent parent = null;
		DiaryType diaryType = null;
		List<Diary> diaries = new ArrayList<>();

		Object[] param = new Object[3];
		param[0]=pageSize;
		param[1]=pageIndex;
		param[2]=pageSize;
		
		try {
			rs = new DbObject().executeQuery(sql, param);
			while (rs.next()) {
				
				diary = new Diary();
				parent = new Parent();
				diaryType = new DiaryType();
				
				diary.setDiaryID(rs.getInt("diaryID"));
				parent.setParentID(rs.getString("parentID"));
				diaryType.setDiaryTypeID(rs.getInt("diaryTypeID"));
				diaryType.setDiaryTypeName(rs.getString("diaryTypeName"));
				diary.setDiaryType(diaryType);
				diary.setParentID(parent);
				
				diary.setDiaryTitle(rs.getString("diaryTitle"));
				diary.setDiaryContent(rs.getString("diaryContent"));
				diary.setCreateTime(rs.getString("createTime"));
				
				diary.setCommentNum(rs.getInt("commentNum"));
				diary.setDiaryStatus(rs.getBoolean("diaryStatus"));
				
				
				diaries.add(diary);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			new DbObject().close();
		}
		return diaries;
	}
	
	public List<Parent> parentsPageDao(int pageIndex,int pageSize){
		ResultSet rs = null;
		// 声明变量
		Parent parent = null;
		List<Parent> parents = new ArrayList<>();
		
		String sql="select top (select ?) * from "
				+ "(select row_number() over(order by parentID) as rownumber,* from parentShow) "
				+ "temp_row where rownumber>(?-1)*?";
		
		Object[] param = new Object[3];
		param[0]=pageSize;
		param[1]=pageIndex;
		param[2]=pageSize;
		
		
	
		try {
			rs = new DbObject().executeQuery(sql, param);
			while (rs.next()) {
				parent = new Parent();
				
				parent.setParentID(rs.getString("parentID"));
				parent.setPwd(rs.getString("pwd"));
				parent.setName(rs.getString("namw"));
				parent.setSex(rs.getString("sex"));
				parent.setBirth(rs.getString("birth"));
				parent.setRole(rs.getString("role"));
				parent.setAddress(rs.getString("address"));
				parent.setKidNum(rs.getInt("kidNum"));
				parent.setStatus(rs.getBoolean("status"));

				parents.add(parent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			new DbObject().close();
		}

		return parents;
	}

	public Admin backAdmin(String userID) {
		ResultSet rs = null;
		// 声明变量
		Admin admin= null;
	
		
		String sql="select * from admin where userID=? ";
		
		Object[] param = new Object[1];
		param[0]=userID;
	
		try {
			rs = new DbObject().executeQuery(sql, param);
			while (rs.next()) {
				admin = new Admin();
				admin.setUserID(rs.getString("userID"));
				admin.setPasswod(rs.getString("password"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			new DbObject().close();
		}

		return admin;
	}
	


}
