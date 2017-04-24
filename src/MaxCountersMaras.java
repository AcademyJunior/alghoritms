import java.util.Arrays;

public class MaxCountersMaras {
    public static int[] solution(int n, int[] a) {
        int maxCounter = 0;
        int[] counters = new int[n];
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && a[i] == n + 1 && a[i - 1] == n + 1) continue;
            if (a[i] <= n) {
                counters[a[i] - 1]++;
                if (counters[a[i] - 1] > maxCounter) {
                    maxCounter = counters[a[i] - 1];
                }
            } else {
                Arrays.fill(counters, maxCounter);
            }
        }
        return counters;
    }
}
