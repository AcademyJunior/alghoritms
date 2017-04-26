import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {

    @Test
    public void testCodility(){
        assertEquals("Codility test",1,new CountDiv().solution(11,13,2));
        assertEquals("Codility test",19,new CountDiv().solution(18,345,17));
        assertEquals("Codility test",3,new CountDiv().solution(6,11,2));
        assertEquals("Codility test",2,new CountDiv().solution(0,200000,200000));
    }

    @Test
    public void testOfZero(){
        assertEquals("Zero test",1,new CountDiv().solution(0,0,11));
    }

}
