package agh.cs.lab9;

public class Chapter {

	int numberOfChapter;
	String textOfChapter;
	
	
	public Chapter(int number){
		numberOfChapter=number;
		textOfChapter="";
		
	}
	public void appendText(String line){
		textOfChapter = textOfChapter + line + System.lineSeparator();
	}
	
	public int getNumber(){
		return numberOfChapter;		
	}
	
	public String getText(){
		return textOfChapter;
	}
	
	
	
}
