
import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {
    @org.junit.Test
    public void test() {
        int[]array={3,1,2,4,3};
        assertEquals("Test",1,new TapeEquilibrium().solution(array));
    }
}
