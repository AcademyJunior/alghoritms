public class TapeEquilibrium {
    public int solution(int[]A){
        int lowestDifferential= Integer.MAX_VALUE;
        int[]B=new int[A.length];
        int[]C=new int[A.length];
        B[0]=0;
        C[0]=0;
        for(int i=0,j=C.length-1;i<B.length-1;i++,j--){
            B[i+1]=B[i]+A[i];
            C[i+1]=C[i]+A[j];
        }
        for(int i=1,j=B.length-i;i<B.length;i++,j--){
            if(Math.abs(B[i]-C[j])<lowestDifferential){
                lowestDifferential=Math.abs(B[i]-C[j]);
            }
        }
        return lowestDifferential;
    }
}
