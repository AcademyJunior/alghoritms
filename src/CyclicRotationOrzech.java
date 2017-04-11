
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Łukasz on 2017-04-11.
 */
public class CyclicRotationOrzech {
    public int[] solution(int[] A,int K){
        //converting int[] to List, then returning Stream boxed to Integers, then making from it new collection rewriting to our list
        List<Integer>list= Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.rotate(list,K);
        //getting stream<integer>, maping(unboxing) int from Integer, then making it as an array of int
        A=list.stream().mapToInt(i->i).toArray();
        return A;
    }
}
