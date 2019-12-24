package com.baby.entity;

public class Schedule {
	private int scheduleID;
	private Parent parentID;
	private String scheduleTitle;
	private String scheduleContent;
	private String scheduleCreateTime;
	private String scheduleRemindTime;
	private String location;
	private boolean scheduleStatus;

	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}

	public Parent getParentID() {
		return parentID;
	}

	public void setParentID(Parent parentID) {
		this.parentID = parentID;
	}

	public String getScheduleTitle() {
		return scheduleTitle;
	}

	public void setScheduleTitle(String scheduleTitle) {
		this.scheduleTitle = scheduleTitle;
	}

	public String getScheduleContent() {
		return scheduleContent;
	}

	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}

	public String getScheduleCreateTime() {
		return scheduleCreateTime;
	}

	public void setScheduleCreateTime(String scheduleCreateTime) {
		this.scheduleCreateTime = scheduleCreateTime;
	}

	public String getScheduleRemindTime() {
		return scheduleRemindTime;
	}

	public void setScheduleRemindTime(String scheduleRemindTime) {
		this.scheduleRemindTime = scheduleRemindTime;
	}

	public boolean isScheduleStatus() {
		return scheduleStatus;
	}

	public void setScheduleStatus(boolean scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

}
