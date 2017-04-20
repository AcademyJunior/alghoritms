import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class MissingInteger {
    public int solution(int[]A){
        List<Integer> integers= Arrays.stream(A).sorted().boxed().distinct().filter(x->x>0).collect(toList());
        Integer missingValue=1;
        for(Integer i:integers){
            if(!missingValue.equals(i)){
                break;
            }
            missingValue++;
        }
        return missingValue;
    }
}