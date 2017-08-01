@Grab('org.twitter4j:twitter4j-core:4.0.6')
import twitter4j.Twitter
import twitter4j.TwitterFactory

def twitter=TwitterFactory.singleton
twitter.updateStatus(['groovy','./karakoro.groovy'].execute().text)

