package com.baby.service.diary.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baby.dao.diary.impl.DiaryDaoImpl;
import com.baby.dao.impl.DbObjectImpl;
import com.baby.entity.Diary;
import com.baby.entity.DiaryType;
import com.baby.entity.Parent;
import com.baby.service.diary.DiaryService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class DiaryServiceImpl implements DiaryService {

	public List<DiaryType> diaryTypeShowService(String parentID) {
		
		Map<String, String> maps=new HashMap<String, String>();
		maps.put("parentID",parentID);
		
		return new DiaryDaoImpl().backDiaryType(maps);
	}

	public Diary dealdiaryJson(String userID, String diaryJson) {
		Diary diary = new Diary();
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(diaryJson, JsonObject.class);
		// System.out.println(jsonObject.getClass().getName());
		String diaryID = jsonObject.get("articleID").getAsString();
		int articleID = Integer.parseInt(diaryID);

		String diaryTitle = jsonObject.get("diaryTitle").getAsString();
		String diaryTypeID = jsonObject.get("diaryType").getAsString();
		String diaryContent = jsonObject.get("diaryContent").getAsString();

		DiaryType type = new DiaryType();
		type.setDiaryTypeID(Integer.parseInt(diaryTypeID));

		diary.setDiaryID(articleID);
		diary.setDiaryTitle(diaryTitle);
		diary.setDiaryType(type);
		;
		diary.setDiaryContent(diaryContent);
		Parent parent = new Parent();
		parent.setParentID(userID);
		diary.setParentID(parent);

		return diary;
	}

	public int updateDiary(String userID, String diaryJson) {
		Diary diary=new Diary();
		diary=dealdiaryJson(userID, diaryJson);
		boolean update =new DiaryDaoImpl().updateDiary(diary);
		if (update) {
			return diary.getDiaryID();
		}else{
			return 0;
		}
		
	}

	public int addDiary(String userID, String diaryJson){
		Diary diary=new Diary();
		diary=dealdiaryJson(userID, diaryJson);
		int addID =new DiaryDaoImpl().addDiaryDao(diary);
		return addID;
		
	}
}
