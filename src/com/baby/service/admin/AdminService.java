package com.blog.service.admin;

import java.util.List;
import java.util.Map;

import com.blog.entity.Admin;
import com.blog.entity.AppealArticle;
import com.blog.entity.Article;
import com.blog.entity.ArticleType;
import com.blog.entity.User;

public interface AdminService {

	List<Article> backArticle();

	List<User> backUser();

	List<Admin> backAdmin(Map<String, String> maps);

	List<ArticleType> backType();

	Object[] backAboutUser();

	List<Article> backBlockArticle();

	List<Admin> backManageUser();

	List<Boolean> changeUserStatus(String userID, boolean toStatus);

	Admin loginCheck(String userID, String userPWD);

	List<AppealArticle> backAppealArticle();

	boolean isDealAppealArticle(String articleID);
}
