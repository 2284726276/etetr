package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.tsinghua.entity.User;

public class UserDao extends BaseDao{
	/**
	 * µÇÂ¼
	 * */
	public User login(User user){
		Session session=getSession();
		String hql="from User u where u.userName=:uname and u.userPwd=:upwd";
		Query query=session.createQuery(hql);
		query.setString("uname", user.getUserName());
		query.setString("upwd", user.getUserPwd());
		List<User> users=query.list();
		if(users.size()==1){
			user=users.get(0);
		}else{
			user=null;
		}
		return user;
		
	}
	
	/**
	 * ×¢²á
	 * **/
	
	public void insert(User user){
		/*Session session=getSession();
		Transaction tx=session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
		session.close();
		*/
		Session session=sessionFactory.getCurrentSession();
		if(session==null){
			session=sessionFactory.openSession();
		}
		session.save(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
