package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ForLoopFunctionsTest {

    ForLoopFunctions flFuncs = new ForLoopFunctions();

    @Test
    void testMaximum() {
        // checks max for normal array
        assertEquals(7, flFuncs.maximum(new int[]{3, -2, 7, 0, 5}));
        // max when all elements same
        assertEquals(4, flFuncs.maximum(new int[]{4, 4, 4, 4}));
        // max with negatives
        assertEquals(-1, flFuncs.maximum(new int[]{-5, -1, -10, -3}));
        // single element array
        assertEquals(42, flFuncs.maximum(new int[]{42}));
    }

    @Test
    void testMinimum() {
        // min for normal array
        assertEquals(-2, flFuncs.minimum(new int[]{3, -2, 7, 0, 5}));
        // min when all elements same
        assertEquals(4, flFuncs.minimum(new int[]{4, 4, 4, 4}));
        // min with negatives
        assertEquals(-10, flFuncs.minimum(new int[]{-5, -1, -10, -3}));
        // single element array
        assertEquals(42, flFuncs.minimum(new int[]{42}));
    }

    @Test
    void testSum() {
        // sum normal
        assertEquals(13, flFuncs.sum(new int[]{3, -2, 7, 0, 5}));
        // sum all same
        assertEquals(16, flFuncs.sum(new int[]{4, 4, 4, 4}));
        // sum negatives
        assertEquals(-19, flFuncs.sum(new int[]{-5, -1, -10, -3}));
        // single element
        assertEquals(42, flFuncs.sum(new int[]{42}));
    }

    @Test
    void testAverage() {
        // avg normal (integer division)
        assertEquals(2, flFuncs.average(new int[]{3, -2, 7, 0, 5}));
        // avg all same
        assertEquals(4, flFuncs.average(new int[]{4, 4, 4, 4}));
        // avg negatives
        assertEquals(-4, flFuncs.average(new int[]{-5, -1, -10, -3}));
        // single element
        assertEquals(42, flFuncs.average(new int[]{42}));
    }
}
