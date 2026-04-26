package com.softserve.academy.module5.pracTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayTaskMediumTest {

    @Test
    public void testBiggestNumber() {
        int[] arr = {1, 5, -2, -10, 7};
        assertEquals(7, ArrayTaskMedium.biggestNumber(arr));
    }

    @Test
    public void testSumOfPositive() {
        int[] arr = {6, 4, -2, -10, 3};
        assertEquals(13, ArrayTaskMedium.sumOfPositive(arr));
    }

    @Test
    public void testCountNegative() {
        int[] arr = {1, 5, -2, -10, -7};
        assertEquals(3, ArrayTaskMedium.countNegative(arr));
    }

    @Test
    public void testComparePositionNegMoreThanPos() {
        int[] arr = {1, 5, -2, -10, -7};
        assertEquals("There are more negative values in the array.", ArrayTaskMedium.comparePositions(arr));
    }

    @Test
    public void testComparePositionPosMoreThanNeg() {
        int[] arr = {2, 6, -2, -10, 3};
        assertEquals("There are more positive values in the array.", ArrayTaskMedium.comparePositions(arr));
    }

    @Test
    public void testComparePositionPosAndNegEqual() {
        int[] arr = {1, 5, -2, -10, -7, 8};
        assertEquals("There are an equal number of positive and negative values in the array.", ArrayTaskMedium.comparePositions(arr));
    }

}
