package lr8.Task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task2 {
    public  static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException, ParseException {
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr8/Task2/task2.json"));
            JSONObject jsonObject = (JSONObject) obj;
            Print(jsonObject);
            JSONArray jsonArray = (JSONArray) jsonObject.get("Automobiles");

            System.out.print("\n");
            AddElement(jsonArray);

            System.out.print("\n");
            FindElement(jsonArray);

            System.out.print("\n");
            DeleteElement(jsonArray);

            System.out.print("\n");
            Print(jsonObject);

            try (FileWriter file = new FileWriter("src/lr8/Task2/task2.json")) {
                file.write(jsonObject.toJSONString());
                file.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        in.close();
    }

    public static void AddElement(JSONArray jsonArray){
        while (true)
        {
            System.out.println("Требуется добавить элемент? (Да/Нет)");
            String answer = in.nextLine();
            if(answer.equals("Нет"))
                break;
            if(!answer.equals("Да"))
                continue;
            System.out.println("Введите бренд:");
            String brandline = in.nextLine();
            System.out.println("Введите модель:");
            String modelline = in.nextLine();
            System.out.println("Введите год:");
            String yearline = in.nextLine();
            System.out.println("Введите цвет:");
            String colorline = in.nextLine();
            System.out.println("Введите номерной знак:");
            String plateline = in.nextLine();

            JSONObject newAuto = new JSONObject();
            newAuto.put("Brand", brandline);
            newAuto.put("Model", modelline);
            newAuto.put("Year", yearline);
            newAuto.put("Color", colorline);
            newAuto.put("LicensePlate", plateline);
            jsonArray.add(newAuto);
        }
    }

    public static void FindElement(JSONArray jsonArray){
        while (true) {
            System.out.println("Требуется найти элемент? (Да/Нет)");
            String answer = in.nextLine();
            if (answer.equals("Нет"))
                break;
            if (!answer.equals("Да"))
                continue;

            System.out.println("Введите номер:");
            String searchPlate = in.nextLine();

            Stream<Object> stream = jsonArray.stream().filter(item -> item instanceof JSONObject);
            Stream<JSONObject> objStream = stream.map(item -> (JSONObject) item);
            objStream.filter(car -> searchPlate.equalsIgnoreCase((String) car.get("LicensePlate")))
                    .forEach(car -> {
                        System.out.println("\nНайден автомобиль:");
                        System.out.println("Brand: " + car.get("Brand"));
                        System.out.println("Model: " + car.get("Model"));
                        System.out.println("Year: " + car.get("Year"));
                        System.out.println("Color: " + car.get("Color"));
                        System.out.println("LicensePlate: " + car.get("LicensePlate"));
                    });
        }
    }

    public static void DeleteElement(JSONArray jsonArray){
        while (true){
            System.out.println("Требуется удалить элемент? (Да/Нет)");
            String answer = in.nextLine();
            if(answer.equals("Нет"))
                break;
            if(!answer.equals("Да"))
                continue;

            System.out.println("Введите номер:");
            String brandline = in.nextLine();

            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (brandline.equals(book.get("LicensePlate"))) {
                    iterator.remove();
                }
            }
        }
    }

    public static void Print(JSONObject jsonObject){
        System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
        JSONArray jsonArray = (JSONArray)jsonObject.get("Automobiles");

        for (Object o : jsonArray) {
            JSONObject book = (JSONObject)o;
            System.out.println("\nТекущий злемент: automobile");
            System.out.println("Название бренда: " + book.get("Brand"));
            System.out.println("Модель: "+ book.get("Model"));
            System.out.println("Год выпуска: "+ book.get("Year"));
            System.out.println("Цвет: "+ book.get("Color"));
            System.out.println("Номерной знак: "+ book.get("LicensePlate"));
        }
    }
}
