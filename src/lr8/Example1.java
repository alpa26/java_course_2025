package lr8;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Example1 {
    public static void main(String[] args)  {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement( "library");
            doc.appendChild(rootElement);
            Element book1 = doc.createElement( "book");
            rootElement.appendChild(book1);
            Element title1 = doc.createElement( "title");
            title1.appendChild(doc.createTextNode( "Война и мир"));
            book1.appendChild(title1);
            Element author1 = doc.createElement( "author");
            author1.appendChild(doc.createTextNode( "Лев Толстой"));
            book1.appendChild(author1);
            Element year1 = doc.createElement( "year");
            year1.appendChild(doc.createTextNode( "1869"));
            book1.appendChild(year1);

            // Добавление второй книги
            Element book2 = doc.createElement( "book");
            rootElement.appendChild(book2);
            Element title2 = doc.createElement( "title");
            title2.appendChild(doc.createTextNode( "Мастер и Маргарита"));
            book2.appendChild(title2);
            Element author2 = doc.createElement( "author");
            author2.appendChild(doc.createTextNode("Михаил Булгаков"));
            book2.appendChild(author2);
            Element year2 = doc.createElement(  "year");
            year2.appendChild(doc.createTextNode("1967"));
            book2.appendChild(year2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform. Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING,"UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File( "src/lr8/example.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }


    }
}
