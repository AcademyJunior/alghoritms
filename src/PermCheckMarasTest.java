import org.junit.Test;

import static org.junit.Assert.*;

public class PermCheckMarasTest {
    @Test
    public void singleElementReturnZero() {
        int[] a = {2};
        assertEquals(0, PermCheckMaras.solution(a));
    }

    @Test
    public void singleElementReturnOne() {
        int[] a = {1};
        assertEquals(1, PermCheckMaras.solution(a));
    }
    @Test
    public void manyElementsShouldFail() {
        int[] a = {2, 3, 4, 5, 6, 7};
        assertEquals(1, PermCheckMaras.solution(a));
    }
}