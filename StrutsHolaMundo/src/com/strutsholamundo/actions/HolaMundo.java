package com.strutsholamundo.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HolaMundo extends ActionSupport{
	private String msg;
	
	public String execute()
	{
		System.out.println("Sí entró a execute");
		if(msg.equals("holo"))
		{
			msg="HolaMundo";
		}
		else if(msg.equals("hola"))
		{
			msg="success";
		}
		else if(msg.equals("error"))
		{
			msg="error";
		}
		return msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
