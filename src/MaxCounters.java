import java.util.Arrays;
public class MaxCounters {
    public int [] solution(int N, int []A){
        int []counters=new int[N];
        int maxCounter=0;
        for(int i=0;i<A.length;i++){
            if(i>0 && A[i]==N+1 && A[i-1]==N+1) continue;
            if(A[i]>N)
                Arrays.fill(counters,maxCounter);
            else if(A[i]>=1 && A[i]<=N) {
                counters[A[i] - 1] += 1;
                if (counters[A[i] - 1] > maxCounter) {
                    maxCounter = counters[A[i] - 1];
                }
            }
        }
        return counters;
    }
}