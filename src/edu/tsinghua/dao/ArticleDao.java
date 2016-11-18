package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.entity.Article;

public class ArticleDao extends BaseDao{

	/**
	 * 查询所有文章
	 * */
	public List<Article> getAll(){
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Article");
		List<Article> arts=query.list();
		return arts;
	}
	/**
	 * 查询部分文章
	 * */
	public List<Article> getPart(Article art){
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Article  a where a.title like :title and a.content like :content");
		query.setString("title", "%"+art.getTitle()+"%");
		query.setString("content", "%"+art.getContent()+"%");
		List<Article> arts=query.list();
		return arts;
	}
	
	/**
	 * 删除
	 * */
	public void deleteOne(Article art){
		Session session=sessionFactory.getCurrentSession();
		session.delete(art);
	}
	
	/**
	 * 新增
	 * */
	public void insertOne(Article art){
		Session session=sessionFactory.getCurrentSession();
		session.save(art);
	}
	/**
	 *更新
	 * */
	public void updateOne(Article art){
		Session session=sessionFactory.getCurrentSession();
		session.update(art);
	}
	/**
	 * 查询一个文章
	 * */
	public Article getOne(Article art){
		Article article=null;
		Session session=sessionFactory.getCurrentSession();
		article=(Article) session.get(Article.class, art.getArtId());
		return article;
	}
}
