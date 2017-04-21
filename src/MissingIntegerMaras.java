import java.util.Arrays;

public class MissingIntegerMaras {
    public static int solution(int A[], int N) {
       A = Arrays.stream(A).sorted().distinct().filter(x -> x > 0).toArray();
        for (int i = 0; i < A.length; i++) {
            if(A[i] != i+1){
                return i+1;
            }
        }
        return A.length+1;
    }
}