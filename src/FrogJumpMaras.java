
public class FrogJumpMaras {
    public static int frogJump(int x, int y, int d){
        return (y-x)%d == 0 ? (y-x)/d : ((y-x)/d)+1;
    }
}
