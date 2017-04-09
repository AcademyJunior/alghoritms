import com.sun.deploy.util.ArrayUtil;
import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryGapMaras {

    public static int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        int length;
        int result = 0;

        String[] ss = binaryString.split("");
        while (ss[ss.length - 1].equals("0")) {
            length = ss.length;
            ss = Arrays.copyOf(ss, length - 1);
        }
        binaryString = Arrays.toString(ss);
        binaryString = binaryString.substring(1, binaryString.length() - 1)
                .replace(", ", "");

        ss = binaryString.split("1");
        for (String string : ss) {
            if (string.length() > result) {
                result = string.length();
            }
        }
        return result;
    }
}
