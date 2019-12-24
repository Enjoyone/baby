package com.baby.entity;

public class ArticleComment {
	private int articleCommentID;
	private Article articleID;
	private Parent parentID;
	private String articleCommentContent;
	private String articleCommentTime;
	private boolean articleCommentStatus;

	public int getArticleCommentID() {
		return articleCommentID;
	}

	public void setArticleCommentID(int articleCommentID) {
		this.articleCommentID = articleCommentID;
	}

	public Article getArticleID() {
		return articleID;
	}

	public void setArticleID(Article articleID) {
		this.articleID = articleID;
	}

	public Parent getParentID() {
		return parentID;
	}

	public void setParentID(Parent parentID) {
		this.parentID = parentID;
	}

	public String getArticleCommentContent() {
		return articleCommentContent;
	}

	public void setArticleCommentContent(String articleCommentContent) {
		this.articleCommentContent = articleCommentContent;
	}

	public String getArticleCommentTime() {
		return articleCommentTime;
	}

	public void setArticleCommentTime(String articleCommentTime) {
		this.articleCommentTime = articleCommentTime;
	}

	public boolean isArticleCommentStatus() {
		return articleCommentStatus;
	}

	public void setArticleCommentStatus(boolean articleCommentStatus) {
		this.articleCommentStatus = articleCommentStatus;
	}

}
