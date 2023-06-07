package cz.educanet.fold;

import cz.educanet.utils.NumberUtils;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = NumberUtils.getRandomNumbers();

        System.out.println("Součet: " + fold(numbers, (a, b) -> a + b, 0));

        System.out.println("Součin: " + fold(numbers, (a, b) -> a * b, 1));

    }

    public static int fold(ArrayList<Integer> numbers, Operation operation, int initialValue) {
        int result = initialValue;
        for (int i = 1; i < numbers.size(); i++) {
            result= operation.apply(numbers.get(i), result );
        }
        return result;
    }
}
interface Operation {
    int apply(int a, int b);
}
