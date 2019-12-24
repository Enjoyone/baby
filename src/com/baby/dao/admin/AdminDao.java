package com.baby.dao.admin;

import java.util.List;
import java.util.Map;

import com.baby.entity.Admin;
import com.baby.entity.Article;

public interface AdminDao {

	List<Admin> backAdmin(Map<String, String> maps);

	Boolean changeUserStatus(String userID, boolean toStatus);

	
	List<Article> articlePageDao(int pageIndex,int pageSize);
}
