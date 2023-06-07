package cz.educanet.reduce;

import cz.educanet.utils.NumberUtils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = NumberUtils.getRandomNumbers();


        System.out.println("Součet: " + reduce(numbers, (result, number) -> result + number));
        System.out.println("Min: " + reduce(numbers, (result, number) -> Math.min(result, number)));
        System.out.println("Max: " + reduce(numbers, (result, number) -> Math.max(result, number)));
    }

    public static int reduce(ArrayList<Integer> numbers, reducerr reducer) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("list nemuze byt prazdny");
        }

        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = reducer.reduce(result, numbers.get(i));
        }
        return result;
    }


}

interface reducerr {
    int reduce(int result, int number);
}
