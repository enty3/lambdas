package cz.educanet.foreach;

import java.util.ArrayList;
import java.util.Arrays;

import static cz.educanet.utils.NumberUtils.getRandomNumbers;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getRandomNumbers();
        forEach(numbers, System.out::println);



        ArrayList<Integer> evenNumbers = new ArrayList<>();
        numbers.forEach((i) -> {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        });
        System.out.println("Even num: " + Arrays.toString(evenNumbers.toArray()));
    }

    public static void forEach(ArrayList<Integer> list, IntFunction fn) {
        for (Integer i : list) {
            fn.invoke(i);
        }
    }
}

@FunctionalInterface
interface IntFunction {
    void invoke(int i);
}
