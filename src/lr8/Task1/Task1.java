package lr8.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.transform.OutputKeys;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public  static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr8/Task1/task1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            Print(doc);
            NodeList nodeList = doc.getElementsByTagName("Automobile");

            System.out.print("\n");
            AddElement(doc);

            System.out.print("\n");
            FindElement(nodeList);

            System.out.print("\n");
            DeleteElement(nodeList);


            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr8/Task1/task1.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);

            System.out.print("\n");
            Print(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        in.close();
    }

    public static void AddElement(Document doc) throws TransformerConfigurationException {
        Node parkingLot = doc.getElementsByTagName("ParkingLot").item(0);
        while (true)
        {
            System.out.println("Требуется добавить элемент? (Да/Нет)");
            String answer = in.nextLine();
            if(answer.equals("Нет"))
                break;
            if(!answer.equals("Да"))
                continue;
            Element newAuto = doc.createElement("Automobile");
            System.out.println("Введите бренд:");
            String brandline = in.nextLine();
            Element brand = doc.createElement("Brand");
            brand.setTextContent(brandline);
            newAuto.appendChild(brand);
            System.out.println("Введите модель:");
            String modelline = in.nextLine();
            Element model = doc.createElement("Model");
            model.setTextContent(modelline);
            newAuto.appendChild(model);
            System.out.println("Введите год:");
            String yearline = in.nextLine();
            Element year = doc.createElement("Year");
            year.setTextContent(yearline);
            newAuto.appendChild(year);
            System.out.println("Введите цвет:");
            String colorline = in.nextLine();
            Element color = doc.createElement("Color");
            color.setTextContent(colorline);
            newAuto.appendChild(color);
            System.out.println("Введите номерной знак:");
            String plateline = in.nextLine();
            Element plate = doc.createElement("LicensePlate");
            plate.setTextContent(plateline);
            newAuto.appendChild(plate);
            parkingLot.appendChild(newAuto);
        }
    }

    public static void FindElement(NodeList nodeList) {
        while (true){
            System.out.println("Требуется найти элемент? (Да/Нет)");
            String answer = in.nextLine();
            if(answer.equals("Нет"))
                break;
            if(!answer.equals("Да"))
                continue;

            System.out.println("Введите номер:");
            String brandline = in.nextLine();

            List<Element> books = IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element)node)
                    .filter(element -> {
                        String plate = element.getElementsByTagName("LicensePlate").item(0).getTextContent();
                        return plate.equalsIgnoreCase(brandline);
                    })
                    .collect(Collectors.toList());

            for (Element book : books) {
                String brand = book.getElementsByTagName("Brand").item(0).getTextContent();
                String model = book.getElementsByTagName("Model").item(0).getTextContent();
                System.out.println("Найдена машина: " + brand + " " +model);
            }
            System.out.print("\n");
        }
    }
    public static void DeleteElement(NodeList nodeList) {
        while (true){
            System.out.println("Требуется удалить элемент? (Да/Нет)");
            String answer = in.nextLine();
            if(answer.equals("Нет"))
                break;
            if(!answer.equals("Да"))
                continue;

            System.out.println("Введите номер:");
            String brandline = in.nextLine();

            Element element = IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(book -> {
                        Node licensePlate = book.getElementsByTagName("LicensePlate").item(0);
                        return licensePlate != null && brandline.equalsIgnoreCase(licensePlate.getTextContent());
                    })
                    .findFirst().orElse(null);;

            element.getParentNode().removeChild(element);
            System.out.print("\n");
        }
    }
    public static void Print(Document doc) {
        System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("Automobile");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\nТекущий элемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Название бренда: " +
                        element.getElementsByTagName("Brand").item(0).getTextContent());
                System.out.println("Модель:" +
                        element.getElementsByTagName("Model").item(0).getTextContent());
                System.out.println("Год выпуска: " +
                        element.getElementsByTagName("Year").item(0).getTextContent());
                System.out.println("Цвет: " +
                        element.getElementsByTagName("Color").item(0).getTextContent());
                System.out.println("Номерной знак: " +
                        element.getElementsByTagName("LicensePlate").item(0).getTextContent());
            }
        }
    }
}
