package end;

import java.util.ArrayList;
import java.util.Scanner;

public class End {
    public static void main(String[] args) {
        ArrayList<String> list = Scan();
        System.out.println(list);
    }

    public static ArrayList<String> Scan() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("введите строку: ");
            String input = in.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        return list;
    }
}