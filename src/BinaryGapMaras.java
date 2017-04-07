import java.util.ArrayList;

public class BinaryGapMaras {

    public static int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        String[] ss = binaryString.split("");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < ss.length; i++) {
            list.add(Integer.parseInt(ss[i]));
        }

        while (list.get(list.size() - 1) == 0) {
            list.remove(list.size() - 1);
        }
        for (int x = 1; x < list.size() - 1; x++) {
            if(list.get(x) == 1 && (list.get(x-1) == 1 || list.get(x+1) ==1)){
                list.remove(x);
                x--;
            }
        }
        binaryString = "";
        for(int i: list){
            binaryString += i;
        }
        ss = binaryString.split("1");
        int result = 0;
        for(String string: ss){
            if(string.length()>result){
                result = string.length();
            }
        }

        return result;
    }
}
