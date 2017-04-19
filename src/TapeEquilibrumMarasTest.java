import org.junit.Test;
import static org.junit.Assert.*;

public class TapeEquilibrumMarasTest {
    @Test
    public void shouldPass() {
        int[] a = {3, 1, 2,4, 3, -20, -999};
        assertEquals(992, TapeEquilibrumMaras.solution(a));
    }

}