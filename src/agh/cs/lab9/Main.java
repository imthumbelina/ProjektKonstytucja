package agh.cs.lab9;

import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws Exception {
		//Constitution myConstitution = new ConstitutionBuilder(Paths.get("konstytucja.txt")).build();
		
		//Article szukany=myConstitution.getArticle(10);
		//System.out.println(szukany.textOfArticle());
		
		
		
		//for(Chapter chapter : myConstitution.getChapters(1,5)) {
			//System.out.println(chapter.getText());
		//}
		
		//for(Article article : myConstitution.getArticles(1, 5)){
			//System.out.println(article.textOfArticle());
		//}
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]); 
		}
	}
}
