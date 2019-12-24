package com.blog.dao.admin;

import java.util.List;
import java.util.Map;

import com.blog.entity.Admin;
import com.blog.entity.AppealArticle;
import com.blog.entity.Article;

public interface AdminDao {

	List<Admin> backAdmin(Map<String, String> maps);

	Boolean changeUserStatus(String userID, boolean toStatus);

	List<AppealArticle> backAppealArticles();
	
	List<Article> articlePageDao(int pageIndex,int pageSize);
}
