package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreamFunctionsTest {

    StreamFunctions streamFuncs = new StreamFunctions();

    @Test
    void testMaximum() {
        // max normal array
        assertEquals(7, streamFuncs.maximum(new int[]{3, -2, 7, 0, 5}));
        // max all same
        assertEquals(4, streamFuncs.maximum(new int[]{4, 4, 4, 4}));
        // max negatives
        assertEquals(-1, streamFuncs.maximum(new int[]{-5, -1, -10, -3}));
        // max empty array returns Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, streamFuncs.maximum(new int[]{}));
    }

    @Test
    void testMinimum() {
        // min normal array
        assertEquals(-2, streamFuncs.minimum(new int[]{3, -2, 7, 0, 5}));
        // min all same
        assertEquals(4, streamFuncs.minimum(new int[]{4, 4, 4, 4}));
        // min negative
        assertEquals(-10, streamFuncs.minimum(new int[]{-5, -1, -10, -3}));
        // min empty array returns Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, streamFuncs.minimum(new int[]{}));
    }

    @Test
    void testSum() {
        // sum normal
        assertEquals(13, streamFuncs.sum(new int[]{3, -2, 7, 0, 5}));
        // sum all same
        assertEquals(16, streamFuncs.sum(new int[]{4, 4, 4, 4}));
        // sum negatives
        assertEquals(-19, streamFuncs.sum(new int[]{-5, -1, -10, -3}));
        // sum empty array returns 0
        assertEquals(0, streamFuncs.sum(new int[]{}));
    }

    @Test
    void testAverage() {
        // avg normal 
        assertEquals(2, streamFuncs.average(new int[]{3, -2, 7, 0, 5}));
        // avg all same
        assertEquals(4, streamFuncs.average(new int[]{4, 4, 4, 4}));
        // avg negatives
        assertEquals(-4, streamFuncs.average(new int[]{-5, -1, -10, -3}));
        // avg empty array returns 0
        assertEquals(0, streamFuncs.average(new int[]{}));
    }
}
