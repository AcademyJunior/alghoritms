import java.util.Arrays;
import java.util.stream.IntStream;

public class FrogRiverOneMaras {
    public static int solution(int x, int[] a) {
        int sumNeeded = IntStream.iterate(1, z -> z + 1).limit(x).sum();
        int[] b = IntStream.of(a).distinct().toArray();
        if (Arrays.stream(b).sum() != sumNeeded) {
            return -1;
        } else for (int i = 0; i < a.length; i++) {
            if (a[i] == b[b.length - 1]) {
                x = i;
                break;
            }
        }
        return x;
    }
}
