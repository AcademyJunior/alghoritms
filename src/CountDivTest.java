import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {

    @Test
    public void testCodility(){
        assertEquals("Codility test",1,new CountDiv().solution(11,13,2));
    }

    @Test
    public void testOfZero(){
        assertEquals("Zero test",1,new CountDiv().solution(0,0,11));
    }

}
