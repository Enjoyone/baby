package com.baby.entity;

public class Appoint {
	private int appointID;
	private Parent parentID;
	private Parent par_parentID;
	private String appointPlace;
	private String appointTime;
	private String appointCreateTime;
	private String appointLevel;
	private String appointComment;
	private boolean appointStatus;

	public int getAppointID() {
		return appointID;
	}

	public void setAppointID(int appointID) {
		this.appointID = appointID;
	}

	public Parent getParentID() {
		return parentID;
	}

	public void setParentID(Parent parentID) {
		this.parentID = parentID;
	}

	public Parent getPar_parentID() {
		return par_parentID;
	}

	public void setPar_parentID(Parent par_parentID) {
		this.par_parentID = par_parentID;
	}

	public String getAppointPlace() {
		return appointPlace;
	}

	public void setAppointPlace(String appointPlace) {
		this.appointPlace = appointPlace;
	}

	public String getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(String appointTime) {
		this.appointTime = appointTime;
	}

	public String getAppointCreateTime() {
		return appointCreateTime;
	}

	public void setAppointCreateTime(String appointCreateTime) {
		this.appointCreateTime = appointCreateTime;
	}

	public String getAppointLevel() {
		return appointLevel;
	}

	public void setAppointLevel(String appointLevel) {
		this.appointLevel = appointLevel;
	}

	public String getAppointComment() {
		return appointComment;
	}

	public void setAppointComment(String appointComment) {
		this.appointComment = appointComment;
	}

	public boolean isAppointStatus() {
		return appointStatus;
	}

	public void setAppointStatus(boolean appointStatus) {
		this.appointStatus = appointStatus;
	}

}
