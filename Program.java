/* Program to multiply the numbers in the list using  T reduce(T identity, BinaryOperator<T> accumulator) */

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        int result = numbers
                .stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }
}
