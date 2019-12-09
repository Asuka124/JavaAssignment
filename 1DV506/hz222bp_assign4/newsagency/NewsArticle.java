package hz222bp_assign4.newsagency;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2017-01-13*/
public class NewsArticle {
	// interview a news
	private String author;
	private String title;
	private Newspaper newspaper;

	// local media gets a news(author, title of news)
	NewsArticle(Newspaper a, String t) {
		newspaper = a;
		this.author = a.getName();
		this.title = t;
		a.Interview(this);
	}

	Newspaper getauthor() {
		return newspaper;
	}

	String gettitle() {
		return title;
	}
}
