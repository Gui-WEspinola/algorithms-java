package kyu5;

import org.junit.jupiter.api.Test;

import static java.lang.Long.*;
import static java.lang.String.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringIncrementer {
    public static String incrementString(String str) {
        int i = str.length() - 1;

        while (i >= 0 && Character.isDigit(str.charAt(i))) {
            i--;
        }

        if (i > 0) {
            String word = str.substring(0, i + 1);
            String numberStr = str.substring(i + 1);
            int length = numberStr.length();
            Long number = parseLong(numberStr) + 1;
            String newNumber = format("%0" + length + "d", number);
            return word + newNumber;
        } else {
            return str + "1";
        }
    }


    public static void main(String[] args) {
        String str = "foobar123";
        str = str.substring(6);
        System.out.println(str);
        System.out.println(incrementString("foobar123"));
        System.out.println(incrementString(""));
    }

    @Test
    void incrementStringTest() {
        assertEquals("foobar124", incrementString("foobar123"));
        assertEquals("foobar100", incrementString("foobar99"));
        assertEquals("1", incrementString(""));
    }
}