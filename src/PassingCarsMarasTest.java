import org.junit.Test;
import static org.junit.Assert.*;

public class PassingCarsMarasTest {
    @Test
    public void  shouldPass(){
        assertEquals("Basic test", 5, PassingCarsMaras.solution(new int[]{0,1,0,1,1}));
        assertEquals("All 0", 0, PassingCarsMaras.solution(new int[]{0,0,0,0,0}));
        assertEquals("All 1,  0 at the end", 0, PassingCarsMaras.solution(new int[]{1,1,1,1,0}));
        assertEquals("One element", 0, PassingCarsMaras.solution(new int[]{1}));
        assertEquals("Two elements", 0, PassingCarsMaras.solution(new int[]{1,0}));
        assertEquals("Two elements", 1, PassingCarsMaras.solution(new int[]{0,1}));
    }



}