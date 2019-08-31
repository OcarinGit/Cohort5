package com.struts2project.actions;

import com.opensymphony.xwork2.ActionSupport;

public class TutorialAction extends ActionSupport {
	
	public String execute()
	{
		System.out.println("Hola Mundo desde el execute del POJO TutorialAction");
		return "success";
	}
}
