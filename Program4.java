import java.util.stream.Stream;

public class Program4 {
    public static void main(String[] args) {
        int sum = Stream.of(2, 3, 4, 5)
                .reduce((a, b) -> a + b).get();
        System.out.println(sum);
    }
}
