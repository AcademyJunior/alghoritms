/**
 * Created by Łukasz on 2017-04-10.
 * Done.
 */

import java.util.*;

public class OddOccurrencesInArray {
    public int solutionOrzech2(int[] A) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : A) {
            list.add(i);
        }
        if (list.size() % 2 == 0) {
            return 0;
        } else {
            Collections.sort(list);
            int i = 0;
            while (list.size() != 1) {
                if (list.get(i).equals(list.get(i + 1))) {
                    list.remove(i);
                    list.remove(i);
                } else
                    i++;

            }
            return list.get(0);
        }
    }
}