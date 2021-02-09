package com.worklog.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="projectinfo")
class ProjectInfo {
	String date;
	String projectInfo;
	String taskInfo;
	String timeSpent;
	public ProjectInfo() {
		super();
	}
	public ProjectInfo(String date, String projectInfo, String taskInfo, String timeSpent) {
		super();
		this.date = date;
		this.projectInfo = projectInfo;
		this.taskInfo = taskInfo;
		this.timeSpent = timeSpent;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProjectInfo() {
		return projectInfo;
	}
	public void setProjectInfo(String projectInfo) {
		this.projectInfo = projectInfo;
	}
	public String getTaskInfo() {
		return taskInfo;
	}
	public void setTaskInfo(String taskInfo) {
		this.taskInfo = taskInfo;
	}
	public String getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(String timeSpent) {
		this.timeSpent = timeSpent;
	}
}
