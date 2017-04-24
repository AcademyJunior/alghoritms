import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class MaxCountersMarasTest {
    @Test
    public void shouldPass() {
        int[] a = {1, 4, 5, 6, 5, 4, 3, 1, 2, 2};
        int[] result = {2, 3, 2, 2, 2};
        assertEquals("Standard test", Arrays.toString(result), Arrays.toString(MaxCountersMaras.solution(5, a)));
    }
}