import static org.junit.Assert.assertEquals;

public class FrogJumpTest {
    @org.junit.Test
    public void sampleTest() {
        assertEquals("Sample test", 3, new FrogJump().solution(10, 85, 30));
    }

    @org.junit.Test
    public void lowerBoundaryTest() {
        assertEquals("Lower boundary condition ", 0, new FrogJump().solution(0, 0, 0));
    }
    @org.junit.Test
    public void upperBoundaryTest() {
        assertEquals("Upper boundary condition ", 0, new FrogJump().solution(1000000001, 1000000002, 1000000001));
    }
    @org.junit.Test
    public void exerciseLogicTest() {
        assertEquals("X>Y condition", 0, new FrogJump().solution(100, 50, 5));

    }
    @org.junit.Test
    public void sampleTest2() {
        assertEquals("Sample test2", 999999999, new FrogJump().solution(1, 1000000000, 1));
    }

}
