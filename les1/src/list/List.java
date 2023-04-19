package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        for (int temp : list) { // вариант 1
            System.out.print(temp + ",");
        }
        System.out.println();
        Iterator<Integer> iterator = list.iterator();// вариант2
        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

    }
}

