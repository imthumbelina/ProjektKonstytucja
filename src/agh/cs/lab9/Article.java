package agh.cs.lab9;

public class Article {

	int numberOfArticle;
	String textOfArticle;
	
	public Article(int number){
		numberOfArticle=number;
		textOfArticle="";
	}
	
	public int getNumberOfArticle(){
		return numberOfArticle;
	}
	
	public String textOfArticle(){
		return textOfArticle;
	}
	
	public void appendText(String line){
		textOfArticle = textOfArticle + line + System.lineSeparator();
	}
	
}
