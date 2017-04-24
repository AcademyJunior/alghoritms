import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxCountersTest {

    @Test
    public void testCodility(){
        int N=5;
        int [] array={3,4,4,6,1,4,4};
        assertEquals("Codility test",Arrays.toString(new int[]{3,2,2,4,2}), Arrays.toString(new MaxCounters().solution(N,array)));
    }

    @Test
    public void testEqualsHigherThenN(){
        int N=5;
        int[]array={6,6,6,6,6,6,6};
        assertEquals("Equal numbers higher then N", Arrays.toString(new int[]{0,0,0,0,0}),Arrays.toString(new MaxCounters().solution(N,array)));
    }


}
