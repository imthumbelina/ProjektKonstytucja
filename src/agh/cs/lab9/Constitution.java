package agh.cs.lab9;
import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Constitution {
	
	List<Chapter> chapters;
	List<Article> articles;
	
	
	public Constitution(List<Chapter> chapters,List<Article> articles) {	
		this.chapters = chapters;	
		this.articles = articles;
	}
	
	public Chapter getChapter(int chapterNo) {
		for(Chapter chapter : chapters) {
			if(chapter.getNumber() == chapterNo){
				return chapter;
			}
		}
		return null;
	}
	
	public Article getArticle(int articleNo) {
		for(Article article : articles){
			if(article.getNumberOfArticle() == articleNo){
				return article;
			}
		}
		return null;
		
	}
	
	
	public List<Chapter> getChapters(int from, int to){
		
		List<Chapter> chapters=new ArrayList<Chapter>();
		for(int i=from; i<=to; i++){
			chapters.add(getChapter(i));
		}
		return chapters;
				
	}
	
	public List<Article> getArticles(int from, int to){
		List<Article> articles = new ArrayList<Article>();
		for(int i=from;i<=to;i++){
			articles.add(getArticle(i));
		}
		return articles;
	}
}