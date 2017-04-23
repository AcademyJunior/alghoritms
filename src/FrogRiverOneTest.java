import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {

    @org.junit.Test
    public void testCodility(){
        int []array={1,3,1,4,2,3,5,4};
        int x=5;
        assertEquals("CodilityTest",6,new FrogRiverOne().solution(x,array));
    }

    @org.junit.Test
    public void testBoundaryCond(){
        int []array={1,3,1,4,2,3,5,4};
        int x=1;
        assertEquals("testBoundaryCond",0,new FrogRiverOne().solution(x,array));
    }

    @org.junit.Test
    public void testNotMatching(){
        int []array={6,3,4,4,2,2,6,1,3,6,3,2,1};
        int x=6;
        assertEquals("testNotMatching",-1,new FrogRiverOne().solution(x,array));
    }

    @org.junit.Test
    public void testOfEqualLeafs(){
        int []array={5,5,5,5,5,5,5,5,5};
        int x=5;
        assertEquals("testOfEqualLeafs",-1,new FrogRiverOne().solution(x,array));
    }
}