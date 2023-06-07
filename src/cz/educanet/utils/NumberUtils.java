package cz.educanet.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberUtils {
    public static ArrayList<Integer> getRandomNumbers() {
        return new ArrayList<>(Arrays.asList(1, 100, 10001, 3, 153, 0, 50, 200, -999, 371, -54, 81, 370));
    }
}
