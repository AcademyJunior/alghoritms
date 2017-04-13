import java.util.*;

public class PermMissingOrzech {
    int solution(int [] A) {
        LinkedList<Integer> listA=new LinkedList<>();
        for(int i:A){
            listA.add(i);
        }
        Collections.sort(listA);
        Integer missingElement = 1;
        for (Integer i : listA) {
            if (!missingElement.equals(i)) {
                break;
            } else
                missingElement++;
        }
        return missingElement;
    }
}
