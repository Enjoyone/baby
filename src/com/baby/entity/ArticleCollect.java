package com.baby.entity;

public class ArticleCollect {
	private int articleCollectID;
	private Parent parentID;
	private Article articleID;
	private String articleCollectTime;

	public int getArticleCollectID() {
		return articleCollectID;
	}

	public void setArticleCollectID(int articleCollectID) {
		this.articleCollectID = articleCollectID;
	}

	public Parent getParentID() {
		return parentID;
	}

	public void setParentID(Parent parentID) {
		this.parentID = parentID;
	}

	public Article getArticleID() {
		return articleID;
	}

	public void setArticleID(Article articleID) {
		this.articleID = articleID;
	}

	public String getArticleCollectTime() {
		return articleCollectTime;
	}

	public void setArticleCollectTime(String articleCollectTime) {
		this.articleCollectTime = articleCollectTime;
	}

}
