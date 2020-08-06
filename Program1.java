/* Program to find the longest String in array using  T reduce(T identity, BinaryOperator<T> accumulator) */

import java.util.Arrays;
import java.util.Optional;

public class Program1 {
    public static void main(String[] args) {
        String[] array = {"Ram", "Ramesh", "Raj", "Rahul", "Sita"};
        Optional<String> longestStream = Arrays.stream(array)
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);
        longestStream.ifPresent(System.out::println);
    }
}

