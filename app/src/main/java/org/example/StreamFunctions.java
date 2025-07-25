package org.example;

import java.util.stream.IntStream;

public class StreamFunctions {

    // max using stream's max method
    public int maximum(int[] nums) {
        return IntStream.of(nums)
                .max()
                .orElse(Integer.MIN_VALUE); // in case of empty array use MIN_VALUE
    }

    // min using stream's min method
    public int minimum(int[] nums) {
        return IntStream.of(nums)
                .min()
                .orElse(Integer.MAX_VALUE); // in case of empty array use MAX_VALUE
    }

    // sum using stream's sum method
    public int sum(int[] nums) {
        return IntStream.of(nums)
                .sum();
    }

    // takes avg using stream's avg method; cast double to int
    public int average(int[] nums) {
        return (int) IntStream.of(nums)
                .average()
                .orElse(0); // in case of empty array
    }
}
