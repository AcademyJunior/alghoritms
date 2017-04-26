import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {
    @Test
    public void testCodility(){
        int []array={0,1,0,1,1,1,0,1};
        assertEquals("Codility test",10,new PassingCars().solution(array));
    }
}
