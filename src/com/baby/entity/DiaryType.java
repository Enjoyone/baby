package com.baby.entity;

public class DiaryType {
	private int diaryTypeID;
	private Parent parentID;
	private String diaryTypeName;
	private String createTime;
	private boolean diaryTypeStatus;
	public int getDiaryTypeID() {
		return diaryTypeID;
	}
	public void setDiaryTypeID(int diaryTypeID) {
		this.diaryTypeID = diaryTypeID;
	}
	
	public Parent getParentID() {
		return parentID;
	}
	public void setParentID(Parent parentID) {
		this.parentID = parentID;
	}
	public String getDiaryTypeName() {
		return diaryTypeName;
	}
	public void setDiaryTypeName(String diaryTypeName) {
		this.diaryTypeName = diaryTypeName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public boolean isDiaryTypeStatus() {
		return diaryTypeStatus;
	}
	public void setDiaryTypeStatus(boolean diaryTypeStatus) {
		this.diaryTypeStatus = diaryTypeStatus;
	}
	
	
	
}
