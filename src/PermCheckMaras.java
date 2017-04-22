import java.util.Arrays;

public class PermCheckMaras {

    public static int solution(int[] a) {
        Arrays.sort(a);
        if(a[0] != 1) return 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i+1] - 1) {
                return 0;
            }
        }
        return 1;
    }
}
