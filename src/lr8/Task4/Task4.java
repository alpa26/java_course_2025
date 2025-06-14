package lr8.Task4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String filePath = "src/lr8/Task4/";
        File file;
        while (true) {
            while (true) {
                System.out.println("Введите имя файла");
                String name = in.nextLine();
                file = new File(STR."\{filePath}\{name}.xlsx");
                if (!file.exists()) {
                    System.err.println("Ошибка: Файл не найден по пути: " + filePath);
                    System.err.println("Проверьте правильность пути к файлу и повторите попытку.\n");
                } else break;
            }
            try (FileInputStream inputStream = new FileInputStream(file);
                 XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

                XSSFSheet sheet = workbook.getSheet("Товары");

                if (sheet == null) {
                    System.err.println("Ошибка: Лист с именем 'Товары' не найден в файле.");
                    System.err.println("Проверьте название листа (регистр имеет значение!) и повторите запуск.");
                    return;
                }
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }
                break;
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
                System.err.println("Убедитесь, что файл является корректным ." +
                        "xlsx документом и не открыт в другой программе.");
            } catch (Exception e) {
                System.err.println("Произошла непредвиденная ошибка: " + e.getMessage());
            }
        }
        in.close();
    }
}
