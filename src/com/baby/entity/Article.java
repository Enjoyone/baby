package com.baby.entity;

public class Article {
	private int articleID;
	private ArticleType articleTypeID;
	private String articleTitle;
	private String articleContent;
	private String articleCreateTime;
	private boolean articleStatus;

	public int getArticleID() {
		return articleID;
	}

	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}

	public ArticleType getArticleTypeID() {
		return articleTypeID;
	}

	public void setArticleTypeID(ArticleType articleTypeID) {
		this.articleTypeID = articleTypeID;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleCreateTime() {
		return articleCreateTime;
	}

	public void setArticleCreateTime(String articleCreateTime) {
		this.articleCreateTime = articleCreateTime;
	}

	public boolean isArticleStatus() {
		return articleStatus;
	}

	public void setArticleStatus(boolean articleStatus) {
		this.articleStatus = articleStatus;
	}

}
