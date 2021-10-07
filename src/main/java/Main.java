import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        try {
            FileReader reader = new FileReader("src/main/resources/city_ru.csv");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String[] input = scanner.nextLine().split(";");
                if (input.length == 6) {
                    cities.add(new City(Integer.parseInt(input[0]), input[1], input[2], input[3], input[4], input[5]));
                } else {
                    cities.add(new City(Integer.parseInt(input[0]), input[1], input[2], input[3], input[4]));
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось прочитать файл");
            e.printStackTrace();
        }
        for (City c : cities) {
            System.out.println(c);
        }
    }
}