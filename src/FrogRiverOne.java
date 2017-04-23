
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        List<Integer>listOfLeaf=IntStream.of(A).boxed().distinct().filter(x->x<=X).collect(toList());
        if(listOfLeaf.size()!=X)
            return -1;
        int lastLeaf = listOfLeaf.get(listOfLeaf.size() - 1);
        return IntStream.of(A).boxed().collect(toList()).indexOf(lastLeaf);
    }
}
