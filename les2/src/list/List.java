package list;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("введите слово");
            list.add(i, in.next());
        }
        ArrayList<String> doubledList = doubleValues(list);
        for (String tmp : doubledList) {
            System.out.println(tmp);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubledList = new ArrayList<>();
        for (String word : list) {
            doubledList.add(word);
            doubledList.add(word);

        }
        return doubledList;
    }
}



