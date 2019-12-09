package hz222bp_assign4.newsagency;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2017-01-13*/
import java.util.ArrayList;

public class NewsAgency {
	private NewsArticle newsArticle;
	private ArrayList<Newspaper> newspapers = new ArrayList<>(0);
	private ArrayList<NewsArticle> newsArticles = new ArrayList<>(0);

	public void registerNewspaper(Newspaper newspaper) {
		newspapers.add(newspaper);
	}

	private void broadcast(NewsArticle newsArticle) {
		if (newspapers.contains(newsArticle.getauthor())) {
			this.newsArticle = newsArticle;
			for (Newspaper eaNewspaper : newspapers) {
				if (!eaNewspaper.equals(newsArticle.getauthor())) {
					eaNewspaper.receiveNewsFromAgency(newsArticle);
				}
			}
		} else {
			System.out.println("{" + newsArticle.getauthor().getName() + "} is not registered.");
		}
	}

	public void collectNews(NewsArticle news) {
		newsArticles.add(news);
		broadcast(news);
	}
}
