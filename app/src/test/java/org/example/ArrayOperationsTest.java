package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    ArrayOperations arrayOps = new ArrayOperations();

    @Test
    void testEvensOnly() {
        int[] input = {3, -2, 7, 0, 5};
        int[] expected = {-2, 0};
        // tests if only evens are returned
        assertArrayEquals(expected, arrayOps.evensOnly(input));

        // edge case: empty array should return empty
        assertArrayEquals(new int[]{}, arrayOps.evensOnly(new int[]{}));
    }

    @Test
    void testOddsOnly() {
        int[] input = {3, -2, 7, 0, 5};
        int[] expected = {3, 7, 5};
        // tests if only odds are returned
        assertArrayEquals(expected, arrayOps.oddsOnly(input));

        // edge case : empty array returns empty
        assertArrayEquals(new int[]{}, arrayOps.oddsOnly(new int[]{}));
    }

    @Test
    void testAddFive() {
        int[] input = {3, -2, 7, 0, 5};
        int[] expected = {8, 3, 12, 5, 10};
        // tests if 5 is added to every element
        assertArrayEquals(expected, arrayOps.addFive(input));

        // edge case : empty array returns empty
        assertArrayEquals(new int[]{}, arrayOps.addFive(new int[]{}));
    }

    @Test
    void testSquareNumbers() {
        int[] input = {3, -2, 7, 0, 5};
        int[] expected = {9, 4, 49, 0, 25};
        // tests if all elements are squared
        assertArrayEquals(expected, arrayOps.squareNumbers(input));

        // edge case: empty array returns empty
        assertArrayEquals(new int[]{}, arrayOps.squareNumbers(new int[]{}));
    }
}
