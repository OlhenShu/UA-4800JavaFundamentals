package com.softserve.academy.module5.pracTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTaskTest {

    @Test
    public void testSortStrings() {
        String[] arr = {"Two", "Apple", "Win", "First"};
        String[] sorted = ArrayTask.sortStrings(arr);
        assertArrayEquals(new String[]{"Apple", "First", "Two", "Win"}, sorted);
    }

    @Test
    public void testAverage() {
        int[] arr = {1, 3, 2, 4, 5};
        assertEquals(3.0, ArrayTask.average(arr));
    }

    @Test
    public void testCheckValueExistsInBoth() {
        String[] strings = {"Array", "Task", "Sort", "String", "First", "12"};
        int[] numbers = {1, 3, 5, 4, 12};
        assertEquals("Value exists in both arrays.", ArrayTask.checkValue("12", numbers, strings));
    }

    @Test
    public void testCheckValueExistsInNumberArray() {
        String[] strings = {"Array", "Task", "Sort", "String", "First", "12"};
        int[] numbers = {1, 3, 5, 4, 12};
        assertEquals("Value exists in one of the arrays.", ArrayTask.checkValue("5", numbers, strings));
    }

    @Test
    public void testCheckValueExistsInStringArrayWithNumber() {
        String[] strings = {"Array", "Task", "Sort", "String", "First", "12"};
        int[] numbers = {1, 3, 5, 4, 122};
        assertEquals("Value exists in one of the arrays.", ArrayTask.checkValue("12", numbers, strings));
    }

    @Test
    public void testCheckValueExistsInStringArrayWithString() {
        String[] strings = {"Array", "Task", "Sort", "String", "First", "12"};
        int[] numbers = {1, 3, 5, 4, 122};
        assertEquals("Value exists in one of the arrays.", ArrayTask.checkValue("Task", numbers, strings));
    }

}
