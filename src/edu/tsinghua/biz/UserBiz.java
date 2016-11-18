package edu.tsinghua.biz;

import edu.tsinghua.dao.UserDao;
import edu.tsinghua.entity.User;

public class UserBiz {

	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * µÇÂ¼
	 * */
	public User login(User user){
		return userDao.login(user);
	}
	/**
	 * ×¢²á
	 * **/
	
	public void insert(User user){
		userDao.insert(user);
	}
}
