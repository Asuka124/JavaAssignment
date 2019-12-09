package hz222bp_assign4.newsagency;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2017-01-13*/
public class NewsMain {
	public static void main(String args[]) {
		NewsAgency ag = new NewsAgency();

		// initial the branch medias
		Newspaper reuters = new Newspaper("Reuters");
		Newspaper star = new Newspaper("Star");
		Newspaper dailynews = new Newspaper("The Daily News");

		// not register
		Newspaper Cat = new Newspaper("Cat");

		// registered
		Newspaper[] newspapers = { reuters, star, dailynews };
		for (Newspaper eaNewspaper : newspapers) {
			ag.registerNewspaper(eaNewspaper);
		}

		// Case 1:send all news to agency
		NewsArticle reArticle = new NewsArticle(reuters, "war");
		NewsArticle re2Article = new NewsArticle(reuters, "fire");
		reuters.sendAllNewsToAgency(ag);

		// Case 2: just send one of news to agency
		NewsArticle stArticle = new NewsArticle(star, "festival");//send
		NewsArticle st2Article = new NewsArticle(star, "market");// not send
		star.sendNewsArticleToAgency(ag, stArticle);

		// Case 3: receive but do not send news to agency
		NewsArticle daArticle = new NewsArticle(dailynews, "snow");

		// case 4: the unregistered media can not send or receive news from agency
		NewsArticle caArticle = new NewsArticle(Cat, "competition");
		Cat.sendNewsArticleToAgency(ag, caArticle);

		// show the news from registered medias after transforming by the agency
		for (Newspaper eaNewspaper : newspapers) {
			eaNewspaper.printArticles();
		}
	}
}
