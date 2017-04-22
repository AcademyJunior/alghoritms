import java.util.Arrays;


public class PermCheck {
    public int solution(int[]A){
        if(A.length==1 && A[0]!=1)
            return 0;
        A=Arrays.stream(A).sorted().toArray();
        for(int i=1;i<A.length;i++){
            if(i==A[i] || (A[i]>i+1) || A[0]!=1)
                return 0;
        }
        return 1;
    }
}
