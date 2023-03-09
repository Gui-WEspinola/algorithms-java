package kyu8;

import java.util.Arrays;

public class ReduceButGrow {
    public static void main(String[] args) {
        System.out.println(ReduceButGrow.grow(new int[]{2,2,2,2,2,2}));
        System.out.println(ReduceButGrow.grow(new int[]{4,1,1,1,4}));
    }

    public static int grow(int[] x){
        Arrays.sort(x);
        Integer cont = 1;
        for (int number : x) {
            cont *= number;
        }
        return cont;
    }
}
