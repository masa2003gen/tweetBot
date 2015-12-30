package twiBot;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class tweetBot {
	private static String tweet = "Java tweet test.";

	public static void main(String args[]) {
		Twitter twitter = new TwitterFactory().getInstance();

		try {
			twitter.updateStatus(tweet);
			System.out.println("ツイート完了.");
		} catch(TwitterException e) {
			System.err.println("ツイート失敗."+e.getMessage());
		}
	}
}
