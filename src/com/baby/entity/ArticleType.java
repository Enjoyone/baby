package com.baby.entity;

public class ArticleType {
	private int articleTypeID;
	private String articleTypeName;
	private String articleTypeCreateTime;
	private boolean articleTypeStatus;

	public int getArticleTypeID() {
		return articleTypeID;
	}

	public void setArticleTypeID(int articleTypeID) {
		this.articleTypeID = articleTypeID;
	}

	public String getArticleTypeName() {
		return articleTypeName;
	}

	public void setArticleTypeName(String articleTypeName) {
		this.articleTypeName = articleTypeName;
	}

	public String getArticleTypeCreateTime() {
		return articleTypeCreateTime;
	}

	public void setArticleTypeCreateTime(String articleTypeCreateTime) {
		this.articleTypeCreateTime = articleTypeCreateTime;
	}

	public boolean isArticleTypeStatus() {
		return articleTypeStatus;
	}

	public void setArticleTypeStatus(boolean articleTypeStatus) {
		this.articleTypeStatus = articleTypeStatus;
	}
}
