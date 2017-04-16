public class FrogJump {
    private long MAX_VALUE=1000000000;
    public int solution(int X, int Y, int D){
        if(((X < 1) || (Y < 1) || (D < 1))){
            return 0;
        }
        else if(X>Y){
            return 0;
        }
        else if(X>MAX_VALUE || Y>MAX_VALUE || D>MAX_VALUE){
            return 0;
        }
        return (int)Math.ceil((double)(Y-X)/(double) D) ;
    }
}
