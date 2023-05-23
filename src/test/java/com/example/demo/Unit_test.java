package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Unit_test {
    public static class StringUtils {
        public String reverse(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    }

    @Test
    public void testReverse() {
        StringUtils utils = new StringUtils();

        String input = "Hello";
        String expectedOutput = "olleH";
        String actualOutput = utils.reverse(input);

        assertEquals(expectedOutput, actualOutput);
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main(Unit_test.class.getName());
    }
}
