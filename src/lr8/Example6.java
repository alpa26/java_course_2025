package lr8;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.List;

public class Example6 {
    public static void main(String[] args){
        try{
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParent = doc.select( "body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                    "tr > td:nth-child(1)");
            for (int i = 3; i < 20; i++)
            {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(8).childNodes();
                    System.out.println("Тема : " +
                            ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                                    .get(8).childNodes().get(8));
                    System.out.println("Дата : " + ((Element)nodes.get(i))
                            .getElementsByClass(  "blockdate")
                            .get(0).childNodes()
                            .get(8) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Не удалось найти данные на странице");
        }
    }
}
