package edu.tsinghua.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.UserBiz;
import edu.tsinghua.entity.User;

public class RegAction extends ActionSupport implements ModelDriven<User>{

	/**
	 *  Ù–‘
	 * */
	User user=new User();
	UserBiz userBiz;
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public UserBiz getUserBiz() {
		return userBiz;
	}



	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}



	public String reg(){
		userBiz.insert(user);
		return SUCCESS;
	}
	
	
	
	@Override
	public User getModel() {
		return user;
	}
	
}
