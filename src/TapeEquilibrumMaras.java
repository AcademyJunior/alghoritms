import java.util.stream.IntStream;
import static java.lang.Math.*;

public class TapeEquilibrumMaras {
    public static int solution(int[] a) {
        int sum1 = 0;
        int sum2 = IntStream.of(a).sum();
        int smallestDiffrence = 2000;
        for (int i = 0; i < a.length -1; i++) {
            sum1 += a[i];
            sum2 -= a[i];
            if (abs(sum2 - sum1) < smallestDiffrence) {
                smallestDiffrence = abs(sum2 - sum1);
            }
        }
        return smallestDiffrence;
    }
}
