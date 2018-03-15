package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		//fixed redundant if statement using simplify tool
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20);
	}

	@Override
	public String toString() {
//		Log.i("importantLonelyTweet", return getTweetDate() + " | " + getTweetBody());
		return getTweetDate() + " | " + getTweetBody() ;
	}

	////only used by this class so made method private
	private String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}