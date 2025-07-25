package org.example;

import java.util.stream.IntStream;

public class ArrayOperations {

    // returns only even no.s from the array
    public int[] evensOnly(int[] nums) {
        return IntStream.of(nums)
                .filter(n -> n % 2 == 0) // keeping if divisible by 2
                .toArray();
    }

    // returns only odd no.s from the array
    public int[] oddsOnly(int[] nums) {
        return IntStream.of(nums)
                .filter(n -> n % 2 != 0) // keeping if not divisible by 2
                .toArray();
    }

    // adding 5 to each num and returns new array
    public int[] addFive(int[] nums) {
        return IntStream.of(nums)
                .map(n -> n + 5) // add 5 to each element
                .toArray();
    }

    // squares each number and returns new array
    public int[] squareNumbers(int[] nums) {
        return IntStream.of(nums)
                .map(n -> n * n) // multiply element by itself
                .toArray();
    }
}
