import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayRotation {

    public static int[] solution(int[] A, int K) {
        if (K == 0) {
            return A;
        }
        int actualRotation = K % (A.length);
        int digitsToMove = A.length - actualRotation;
        List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
        for (int x = 0; x < digitsToMove; x++) {
            list.add(list.get(x));
        }
        return list.stream().skip(digitsToMove).mapToInt(i -> i).toArray();
    }
}
