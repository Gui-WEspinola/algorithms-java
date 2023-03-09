package kyu8;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(1));
        System.out.println(makeNegative(10));
        System.out.println(makeNegative(50));
        System.out.println(makeNegative(12));
        System.out.println(makeNegative(332));
    }

    public static int makeNegative(int x) {
        return -Math.abs(x);
    }
}


