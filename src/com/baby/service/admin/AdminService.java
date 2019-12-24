package com.baby.service.admin;

import java.util.List;
import java.util.Map;

import com.baby.entity.Admin;
import com.baby.entity.Article;
import com.baby.entity.ArticleType;
import com.baby.entity.Parent;

public interface AdminService {

	List<Article> backArticle();

	List<Parent> backUser();


	List<ArticleType> backType();

	Object[] backAboutUser();

	List<Article> backBlockArticle();


	List<Boolean> changeUserStatus(String userID, boolean toStatus);

	boolean loginCheck(String userID, String userPWD);


}
