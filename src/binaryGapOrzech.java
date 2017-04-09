import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Łukasz on 2017-04-04.
 */
public class binaryGapOrzech {



    public int solutionOrzech(int N){
        String nat=Integer.toBinaryString(N);
        String[]binaryArray=nat.split("");
        int binaryGapRow=0;
        int biggestGap=0;

        for(int i=0; i<binaryArray.length && binaryArray.length!=0;i++){
            if(binaryArray[i].equals("0")){
                binaryGapRow++;
            }
            else if(binaryArray[i].equals("1")){
                if(binaryGapRow>0 && binaryGapRow>biggestGap){
                    biggestGap=binaryGapRow;
                    binaryGapRow=0;
                }
                else{
                    binaryGapRow=0;
                }
            }
        }
        return biggestGap;
    }


}
