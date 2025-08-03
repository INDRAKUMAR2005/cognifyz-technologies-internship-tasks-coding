import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class SimpleScraper {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://example.com").get();
            Elements headings = doc.select("h1");
            headings.forEach(h -> System.out.println(h.text()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
