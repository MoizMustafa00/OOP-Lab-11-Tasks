package Lab11_Tasks;

import java.util.*;

public class Task4 {
    public static <T extends Number & Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static <T extends Number> double sumList(List<T> list) {
        double sum = 0;
        for (T n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static <T extends Number & Comparable<T>> T maxList(List<T> list) {
        T max = list.get(0);
        for (T n : list) {
            if (n.compareTo(max) > 0) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(20);
        intList.add(15);
        intList.add(7);

        sortList(intList);
        System.out.println("Sorted Integer List: " + intList);
        System.out.println("Sum: " + sumList(intList));
        System.out.println("Max: " + maxList(intList));

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(7.8);
        doubleList.add(1.2);
        doubleList.add(9.4);

        sortList(doubleList);
        System.out.println();
        System.out.println("Sorted Double List: " + doubleList);
        System.out.println("Sum: " + sumList(doubleList));
        System.out.println("Max: " + maxList(doubleList));
    }
}