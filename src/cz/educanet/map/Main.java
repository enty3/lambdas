package cz.educanet.map;

import cz.educanet.utils.NumberUtils;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = NumberUtils.getRandomNumbers();

        System.out.println("X2: " + map(numbers, x -> x * 2));

        System.out.println("+10%: " + map(numbers, x -> (int) (x * 1.1)));
    }

    public static ArrayList<Integer> map(ArrayList<Integer> numbers, Mapper mapper) {
        ArrayList<Integer> mappedNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            mappedNumbers.add(mapper.mapValue(number));
        }
        return mappedNumbers;
    }
}

interface Mapper {
    int mapValue(int value);
}
