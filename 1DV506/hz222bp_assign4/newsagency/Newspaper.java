package hz222bp_assign4.newsagency;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2017-01-13*/
import java.util.ArrayList;

public class Newspaper {
	private String name;
	private ArrayList<NewsArticle> articles = new ArrayList<>();

	Newspaper(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public void Interview(NewsArticle newsArticle) {
		articles.add(newsArticle);
	}

	// send one of news to the agency
		public void sendNewsArticleToAgency(NewsAgency agency, NewsArticle newsArticle) {
				agency.collectNews(newsArticle);
		}
	
		//send all news to the agency
	public void sendAllNewsToAgency(NewsAgency agency) {
		for (NewsArticle eaNews : articles) {
			agency.collectNews(eaNews);
		}
	}
	 
	public void receiveNewsFromAgency(NewsArticle newsArticle) {
		articles.add(newsArticle);
	}

	// show the current resource of each registered media
	public void printArticles() {
		System.out.println("\nCurrently, {" + this.name + "} has the following news:");
		for (NewsArticle eaNews : articles) {
			System.out.println(eaNews.gettitle());
		}
	}
}
