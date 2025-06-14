package lr8.Task3;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args){
        String url = "https://itlearn.ru/first-steps";
        int maxRetries = 3;
        int attempt = 0;
        Document data = TryConnect(url,maxRetries,attempt);
        if(data == null)
        {
            System.out.println("Data is null");
            return;
        }
        WriteFile(data);
    }

    public static void WriteFile(Document data){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            org.w3c.dom.Document doc =  docBuilder.newDocument();
            org.w3c.dom.Element rootElement = doc.createElement( "links");
            doc.appendChild(rootElement);
            Elements links = data.select( "a[href]");
            for (Element element : links) {
                String link = element.attr( "abs:href");
                org.w3c.dom.Element linkEl = doc.createElement( "link");
                linkEl.appendChild(doc.createTextNode(link));
                rootElement.appendChild(linkEl);
            }
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File( "src/lr8/Task3/task3.xml"));
            transformer.transform(source, result);
            System.out.println("Файл записан!");
        } catch (Exception pce) {
            System.out.println("Ошибка при записи файла!");
            pce.printStackTrace();
        }
    }

    public static Document TryConnect(String url,
            int maxRetries,int attempt){
        while (attempt < maxRetries) {
            try {
                System.out.println("Попытка подключения ...");
                Document data = Jsoup.connect(url).get();
                System.out.println("Успешно!");
                return data;
            } catch (IOException e) {
                attempt++;
                System.err.println("Ошибка подключения к сайту: " + e.getMessage());
                if (attempt < maxRetries) {
                    System.out.println("Попытка переподключения (" + attempt + "/" + maxRetries + ")...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        System.err.println("Операция прервана.");
                        return null;
                    }
                } else {
                    System.out.println("Не удалось подключиться к сайту после " + maxRetries + " попыток.");
                    return null;
                }
            }
        }
        return null;
    }
}
