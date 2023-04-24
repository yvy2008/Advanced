package city;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Map<String, String> city = new HashMap<>();
        city.put("Киев", "Янушевские");
        city.put("Харьков", "Хаяровы");
        city.put("Львов", "Кукса");
        Scanner in = new Scanner(System.in);
        System.out.println("введите город");
        System.out.println(city.get(in.next()));
    }
}
