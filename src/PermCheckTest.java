
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PermCheckTest {

    @org.junit.Test
    public void testPositive(){
        int[]array={4,6,3,7,1,2,5};
        assertEquals("testPositive",1,new PermCheck().solution(array));
    }

    @Test
    public void testMissingElem(){
        int []array4={1,4,3};
        assertEquals("testMissingElem",0,new PermCheck().solution(array4));
    }

    @Test
    public void testOneElement(){
        int []array5={2};
        assertEquals("testOneElement",0,new PermCheck().solution(array5));
    }

    @Test
    public void testOnlyEqualElemens(){
        int[]array6={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertEquals("testOnlyEqualElemens",0,new PermCheck().solution(array6));
    }

    @Test
    public void testEqualEleentsPlusOneDiffrent(){
        int[]array1={1,1,1,1,2};
        assertEquals("testEqualEleentsPlusOneDiffrent",0,new PermCheck().solution(array1));
    }

    @Test
    public void testTwoEqualElementsAsLastOnes(){
        int[]array2={4,1,3,2,5,5};
        assertEquals("testTwoEqualElementsAsLastOnes",0,new PermCheck().solution(array2));
    }

    @Test
    public void testTwoEqualElements(){
        int[]array3={1,1};
        assertEquals("testTwoEqualElements",0,new PermCheck().solution(array3));
    }
}

