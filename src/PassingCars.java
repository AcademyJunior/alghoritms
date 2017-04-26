import java.util.stream.IntStream;

public class PassingCars {
    public int solution(int []A){
        int passingCars=0;
        long zeroAmount=IntStream.of(A).filter(n->n==0).count();
        for(int i=0;i<A.length;i++){
            if(passingCars>1000000000) return -1;
            if(A[i]!=0) continue;
            passingCars += A.length - i - (int) zeroAmount;
            zeroAmount--;
        }
        return passingCars;
    }
}
