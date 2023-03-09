package kyu8;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        int[] input = new int[] {-1,-2,-3,-4,-5};
        InvertValues.invert(input);
    }
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(obj -> obj * -1).toArray();
    }
}
