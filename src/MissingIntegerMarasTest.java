import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerMarasTest {
    @Test
    public void shouldPass() {
        int[] a = {2, 3, -3, -4, -1010101};
        Assert.assertEquals(1, MissingIntegerMaras.solution(a, 5));
    }

}