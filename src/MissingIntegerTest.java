import static junit.framework.TestCase.assertEquals;

public class MissingIntegerTest {

    @org.junit.Test
    public void testMixed(){
        int[]array={-1,-2,5,-200,1,4,-7,3,2,6,7};
        assertEquals("Mixed sauce? Yes please ( ͡° ͜ʖ ͡°)",8,new MissingInteger().solution(array));
    }
    public void testNegative(){
        int []array={-1000,-500,-3,-501,-1};
        assertEquals("Test of negative numbers",1,new MissingInteger().solution(array));
    }

    public void testPositive(){
        int[] array={1,3,10,239239,4,2,5,8};
        assertEquals("Test of positive numbers",6,new MissingInteger().solution(array));
    }
}