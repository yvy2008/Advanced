package min_number;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        LinkedList<Integer> list = getIntegerList();
        int min = getMinimum(list);
        System.out.println("минимальное число = " + min);

    }

    public static LinkedList<Integer> getIntegerList() {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("введите число");
            list.add(i, in.nextInt());
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        int min = list.getFirst();  //вариант 1
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
//        return Collections.min(list); // вариант 2
    }
}

