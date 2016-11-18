package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.dao.ArticleDao;
import edu.tsinghua.entity.Article;

public class ArticleBiz {
	ArticleDao articleDao;
	
	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	/**
	 * 查询所有文章
	 * */
	public List<Article> getAll(){
		return articleDao.getAll();
	} 

	/**
	 * 查询部分文章
	 * */
	public List<Article> getPart(Article art){
		return articleDao.getPart(art);
	}
	/**
	 * 删除
	 * */
	public void deleteOne(Article art){
		articleDao.deleteOne(art);
	}
	/**
	 * 新增
	 * */
	public void insertOne(Article art){
		articleDao.insertOne(art);
	}
	/**
	 * 查询一个文章
	 * */
	public Article getOne(Article art){
		return articleDao.getOne(art);
	}
	/**
	 *更新
	 * */
	public void updateOne(Article art){
		articleDao.updateOne(art);
	}
}
