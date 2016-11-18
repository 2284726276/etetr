package edu.tsinghua.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.biz.ArticleBiz;
import edu.tsinghua.dao.UserDao;
import edu.tsinghua.entity.Article;
import edu.tsinghua.helper.DateHelper;

public class ArticleAction extends ActionSupport implements SessionAware,ModelDriven<Article>{
	ArticleBiz articleBiz;
	Map<String, Object> session;
	Article art=new Article();
	Article artGet;
	int op=0;
	
	
	
	
	
	/**
	 * getall
	 * */
	
	public String getall(){
		List<Article> arts=articleBiz.getAll();
		session.put("arts", arts);
		return SUCCESS;
	}
	/**
	 * getpart
	 * */
	
	public String getpart(){
		List<Article> arts=articleBiz.getPart(artGet);
		session.put("arts", arts);
		return SUCCESS;
	}

	/**
	 * delete
	 * */
	public String deleteOne(){
		articleBiz.deleteOne(art);
		return SUCCESS;
	}
	
	/**
	 * delete
	 * */
	public String insertOne(){
		articleBiz.insertOne(art);
		return SUCCESS;
	}
	/**
	 * updateOne
	 * */
	public String updateOne(){
		articleBiz.updateOne(art);
		return SUCCESS;
	}
	/**
	 * getone
	 * */
	public String getOne(){
		Article article=articleBiz.getOne(art);
		session.put("art1", article);
		if(op==1){
			//查看当前文章
			return "show";
		}else{		
			return SUCCESS;
		}
	}
	
	public String insertOrUpdate(){
		art.setArtDate(DateHelper.getDateFormat(new Date()));
		
		if(art.getArtId()==0){
			
			articleBiz.insertOne(art);
			art=new Article();
		}else{
			articleBiz.updateOne(art);
			session.remove("art1");//jsp页面不显现被修改的数据
			art=new Article();
		}
		return SUCCESS;
	}
	
	
	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	public Article getArt() {
		return art;
	}

	public void setArt(Article art) {
		this.art = art;
	}

	public ArticleBiz getArticleBiz() {
		return articleBiz;
	}

	public void setArticleBiz(ArticleBiz articleBiz) {
		this.articleBiz = articleBiz;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public Article getModel() {
		// TODO Auto-generated method stub
		return art;
	}

	public Article getArtGet() {
		return artGet;
	}

	public void setArtGet(Article artGet) {
		this.artGet = artGet;
	}
	

}
