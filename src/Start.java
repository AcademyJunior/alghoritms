import static org.junit.Assert.assertEquals;

public class Start {
    public static void main(String[] args) {
        int[]array={3,1,2,4,3};
        assertEquals("Test",1,new TapeEquilibrium().solution(array));
    }
}
