package com.baby.entity;


public class Kid {
	private int kidID;
	private Parent parentID;
	private String kidName;
	private String kidsex;
	private String kidBirth;
	private boolean kidSocialStatus;
	private boolean kidStatus;
	public int getKidID() {
		return kidID;
	}
	public void setKidID(int kidID) {
		this.kidID = kidID;
	}
	public Parent getParentID() {
		return parentID;
	}
	public void setParentID(Parent parentID) {
		this.parentID = parentID;
	}
	public String getKidName() {
		return kidName;
	}
	public void setKidName(String kidName) {
		this.kidName = kidName;
	}
	public String getKidsex() {
		return kidsex;
	}
	public void setKidsex(String kidsex) {
		this.kidsex = kidsex;
	}
	public String getKidBirth() {
		return kidBirth;
	}
	public void setKidBirth(String kidBirth) {
		this.kidBirth = kidBirth;
	}
	public boolean isKidSocialStatus() {
		return kidSocialStatus;
	}
	public void setKidSocialStatus(boolean kidSocialStatus) {
		this.kidSocialStatus = kidSocialStatus;
	}
	public boolean isKidStatus() {
		return kidStatus;
	}
	public void setKidStatus(boolean kidStatus) {
		this.kidStatus = kidStatus;
	}
	
	
	
}
