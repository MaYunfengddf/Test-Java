package com.hello01kuaixue;

public class Job {
	private String jobName;
	public String getJob(String jobName) {
		return "找到工作" + jobName;
	}
	
	public void findJavaJob() {
		System.out.println("边学习Java边找工作");
	}
}
