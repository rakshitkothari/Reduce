import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        String length = Arrays.asList("Rahul", "Raj","Ramesh")
                .stream()
                .reduce("", (a, b) -> a + b.length());
        System.out.println(length);
    }
}
