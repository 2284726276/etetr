package edu.tsinghua.entity;

import java.io.Serializable;

public class User implements Serializable{

	private int userId;
	private String userName;
	private String userPwd;
	private int isAdmin=0;//1管理员 0普通用户
	
	private String realName;
	private String phone;
	private String address;
	
	
	
	
	public User(String userName, String userPwd, int isAdmin, String realName, String phone, String address) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.isAdmin = isAdmin;
		this.realName = realName;
		this.phone = phone;
		this.address = address;
	}
	public User(int userId, String userName, String userPwd, int isAdmin, String realName, String phone,
			String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.isAdmin = isAdmin;
		this.realName = realName;
		this.phone = phone;
		this.address = address;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(int userId, String userName, String userPwd, int isAdmin) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.isAdmin = isAdmin;
	}
	public User() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	

}
