package com.loginapp.modelo;

public class Login {
	
	private String username;
	private String password;
	
	public Login(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public Login()
	{
		
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}
}
