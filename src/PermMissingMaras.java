import java.util.Arrays;

public class PermMissingMaras {

    public static int solution(int[] A) {
        Arrays.sort(A);
        int number = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                number = i + 1;
                break;
            }
        }
        if (number == 0) {
            number = A.length + 1;
        }
        return number;
    }
}