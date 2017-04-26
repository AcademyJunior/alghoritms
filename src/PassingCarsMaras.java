import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PassingCarsMaras {
    public static int solution(int[] a) {
        int result = 0;
        int sum = IntStream.of(a).sum();
        for (int x : a) {
            if (x == 0) {
                result += sum;
                if (result > 1000000000) return -1;
            } else {
                sum--;
            }
        }
        return result;
    }
}