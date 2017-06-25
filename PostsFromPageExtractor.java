import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("248319019020969", "7d983ee5052e578fd00bd7676155b7bf");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAADh2EbrcqkBALJVytOhh8oUxbdYQHlSh39HFukC5OoWefvZBwm1L7ZAJo2tD9YRoROYKgKwS0XVn2EEMbbzzDoZAoHkv6CoD396eBa5jG1KAbn9uOGfv90UnhEnAPsfcxW7oZA9evzd0BxXApZCQAhyNTuHvV0ZAeD4csJChZB0ZCaAvIlW85KNtMStcQrVk4sZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
   facebook.postStatusMessage("Hello World from Facebook4J.");
    }
}