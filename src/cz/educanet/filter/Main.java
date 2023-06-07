package cz.educanet.filter;

import cz.educanet.utils.NumberUtils;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = NumberUtils.getRandomNumbers();
        ArrayList<Integer> evenNumbers = filter(numbers, i -> (i) % 3 == 0);
        System.out.println(evenNumbers);
        System.out.println(filter(numbers, i -> i < 0));

// 137= 1mathpow2 3mathpow2 7mathpow2
         // TODO armstrongova čísla - součet třetích mocnin cifer se rovná původnímu číslu
        System.out.println(filter(numbers, i -> isArmstrongNumber(i)));    }

    public static ArrayList<Integer> filter(ArrayList<Integer> list, IntPredicate predicate) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.isValid(i)) {
                result.add(i);
            }
        }
        return result;
    }


    public static boolean isArmstrongNumber(int number) {
        String numberAsString = Integer.toString(number);
        int power = numberAsString.length();
        int sum = 0;
        for (int i = 0; i < power; i++) {
            sum += Math.pow(Character.getNumericValue(numberAsString.charAt(i)), 3);
        }
        return sum == number;
    }
}

