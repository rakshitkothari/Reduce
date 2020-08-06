import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        int length = Arrays.asList("Rahul", "Raj", "Ramesh")
                .stream()
                .reduce(0, (a, b) -> a + b.length(), null);
        System.out.println(length);
    }
}
