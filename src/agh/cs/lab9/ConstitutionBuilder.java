package agh.cs.lab9;
import java.nio.file.Files;
import java.nio.file.Path;
import java.lang.Object;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Paths;


public class ConstitutionBuilder {	
	Path constitutionPath;

	
	public ConstitutionBuilder(Path path){
		constitutionPath = path;
	}
	
	public List<String> lines() throws IOException {
		List<String> lines = Files
				.lines(constitutionPath)
				.collect(Collectors.toList())
				.subList(47, 2014)
				.stream()
				.filter(l -> !l.equals("2009-11-16") )
				.filter(l -> !l.equals("©Kancelaria Sejmu"))
				.collect(Collectors.toList());
		
		return lines;
		
	}	
		
		
		
		

		
		
		public List<Chapter> divideIntoChapters() throws IOException{
		
					
			List<Chapter> chapters = new ArrayList<Chapter>();
		
			int chapterNumber = 1;

			for(String line : lines()){
				if(line.startsWith("Rozdział")){
					chapters.add(new Chapter(chapterNumber));
					chapterNumber = chapterNumber+1;
					
				}				
				chapters.get(chapters.size() - 1).appendText(line);

			}
		
			return chapters;
		
		}
		
		public List<Article> divideIntoArticles() throws IOException{
			
			List<Article> articles = new ArrayList<Article>();
			
			//System.out.println("foo");
			
			int articleNumber = 1;
			
			for(String linia : lines()){
				
				if(linia.startsWith("Art")){
					articles.add(new Article(articleNumber));
					articleNumber=articleNumber+1;
					
				}
					
				if(!articles.isEmpty() && !linia.startsWith("Rozdział") ){
					articles.get(articles.size() -1).appendText(linia);
				}
			}
			return articles;
			
		}
	
		
		public Constitution build() throws IOException {
			 return new Constitution(divideIntoChapters(),divideIntoArticles());
			 }
}
