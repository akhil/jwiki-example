import okhttp3.HttpUrl;
import org.fastily.jwiki.core.Wiki;

public class Example {

    public static void main(String[] s) {
        Wiki wiki = new Wiki.Builder()
                .withApiEndpoint(
                        HttpUrl.parse("https://test.hinduismpedia.org/api.php")
                )
                .withLogin("", "")
                .build();

        wiki.edit("title", "text", "reason");
    }
}
