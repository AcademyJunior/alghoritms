import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OddOccurencesMaras {

    public static int solution(int a[]) {
        int number;
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] != a[i + 1]) {
                number = a[i];
                return number;
            } else {
                i++;
            }
        }
        number = a[a.length - 1];
        return number;
    }
}
