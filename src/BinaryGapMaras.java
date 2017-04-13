import static java.lang.Integer.toBinaryString;
import static java.util.Arrays.*;

public class BinaryGapMaras {

    public static int solution(int n) {
        int result = 0;
        String binaryString = toBinaryString(n);
        String[] stringArray = stringArray = binaryString.split("1");
        if (binaryString.charAt(binaryString.length() - 1) == '0') {
            stringArray = copyOf(stringArray, stringArray.length - 1);
        }
        for (String string : stringArray) {
            if (string.length() > result) {
                result = string.length();
            }
        }
        return result;
    }
}
