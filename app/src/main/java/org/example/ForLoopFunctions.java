package org.example;

public class ForLoopFunctions {

    // finds max using basic 'for' loop
    public int maximum(int[] nums) {
        // assuming 1st element is max to start
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // updates max if current element is larger
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // finds min using basic 'for' loop
    public int minimum(int[] nums) {
        // assuming 1st element is min to start
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // updates min if current element is smaller
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    // sum of all elements by looping through array
    public int sum(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n; // adds current element to total sum
        }
        return total;
    }

    // avg = sum divided by num of elements
    public int average(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n; // sum up all elements first
        }
        // int division rounds down 
        return total / nums.length;
    }
}
