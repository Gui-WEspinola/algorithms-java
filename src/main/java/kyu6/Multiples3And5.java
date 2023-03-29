package kyu6;

import java.util.ArrayList;
import java.util.List;

public class Multiples3And5 {
    public static int solution(int number) {
        List<Integer> solution = new ArrayList<>();
        List<Integer> multiples = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            solution.add(i);
        }

        solution.forEach(num -> {
            if (num % 5 == 0 && num % 3 == 0) multiples.add(num);
            else if (num % 5 == 0) multiples.add(num);
            else if (num % 3 == 0) multiples.add(num);
        });
        return multiples.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(solution(21));
    }
}
