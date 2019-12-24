package com.baby.dao.admin;

import java.util.List;

import com.baby.entity.Article;
import com.baby.entity.Diary;
import com.baby.entity.Parent;

public interface AdminDao {

	Boolean changeUserStatus(String parentID, boolean toStatus);

	List<Article> articlePageDao(int pageIndex,int pageSize);
	
	List<Diary> diaryPageDao(int pageIndex,int pageSize);
	
	List<Parent> parentsPageDao(int pageIndex,int pageSize);
}
