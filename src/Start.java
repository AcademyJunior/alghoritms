import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {
        /*BinaryGapOrzech bgo =new BinaryGapOrzech();
        System.out.println(bgo.solutionOrzech(20));*/

        /*OddOccurrencesInArray ooia = new OddOccurrencesInArray();
        int[]array4=new int[]{9,9,9,3,9,3,9,7,9,1616,1919,1818,1616,1818,1919,7,1000000000};
        System.out.println("Number without pair:"+ooia.solutionMatas(array4));*/

        CyclicRotationOrzech cRo = new CyclicRotationOrzech();
        int[]array=new int[]{3,8,9,7,6};
        for(int i: cRo.solution(array,3)){
            System.out.println(i);
        }
    }
}
