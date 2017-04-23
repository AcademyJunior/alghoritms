import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FrogRiverOneMarasTest {
    @Test
    public void solution() {
        int[] a = {1, 2, 3, 2, 1,};
        assertEquals(2, FrogRiverOneMaras.solution(3, a));
    }
}

