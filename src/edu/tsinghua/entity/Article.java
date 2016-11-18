package edu.tsinghua.entity;

import java.io.Serializable;

public class Article implements Serializable{
	
	private int artId;
	private String title;
	private String artDate;
	private String artSummary;
	private String content;
	public int getArtId() {
		return artId;
	}
	public void setArtId(int artId) {
		this.artId = artId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtDate() {
		return artDate;
	}
	public void setArtDate(String artDate) {
		this.artDate = artDate;
	}
	public String getArtSummary() {
		return artSummary;
	}
	public void setArtSummary(String artSummary) {
		this.artSummary = artSummary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Article(int artId, String title, String artDate, String artSummary, String content) {
		super();
		this.artId = artId;
		this.title = title;
		this.artDate = artDate;
		this.artSummary = artSummary;
		this.content = content;
	}
	public Article(String title, String artDate, String artSummary, String content) {
		super();
		this.title = title;
		this.artDate = artDate;
		this.artSummary = artSummary;
		this.content = content;
	}
	public Article() {
		super();
	}
	
	


}
