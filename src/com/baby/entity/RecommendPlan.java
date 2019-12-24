package com.baby.entity;

public class RecommendPlan {

	private int recommendPlanID;
	private Parent parentID;
	private String recommendPlanTitle;
	private String recommendPlanContent;
	private String recommendPlanRemindTime;
	private boolean recommendPlanStatus;

	public int getRecommendPlanID() {
		return recommendPlanID;
	}

	public void setRecommendPlanID(int recommendPlanID) {
		this.recommendPlanID = recommendPlanID;
	}

	public Parent getParentID() {
		return parentID;
	}

	public void setParentID(Parent parentID) {
		this.parentID = parentID;
	}

	public String getRecommendPlanTitle() {
		return recommendPlanTitle;
	}

	public void setRecommendPlanTitle(String recommendPlanTitle) {
		this.recommendPlanTitle = recommendPlanTitle;
	}

	public String getRecommendPlanContent() {
		return recommendPlanContent;
	}

	public void setRecommendPlanContent(String recommendPlanContent) {
		this.recommendPlanContent = recommendPlanContent;
	}

	public String getRecommendPlanRemindTime() {
		return recommendPlanRemindTime;
	}

	public void setRecommendPlanRemindTime(String recommendPlanRemindTime) {
		this.recommendPlanRemindTime = recommendPlanRemindTime;
	}

	public boolean isRecommendPlanStatus() {
		return recommendPlanStatus;
	}

	public void setRecommendPlanStatus(boolean recommendPlanStatus) {
		this.recommendPlanStatus = recommendPlanStatus;
	}

}
