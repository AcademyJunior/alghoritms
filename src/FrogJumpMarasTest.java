import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class FrogJumpMarasTest {
    @Test
    public void shouldFail(){
        assertEquals(4, FrogJumpMaras.frogJump(10,999999999,21));
    }


}