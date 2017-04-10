/**
 * Created by Łukasz on 2017-04-09.
 */
public class BinaryGapOrzech {
    public int solutionOrzech(int N){
        String nat=Integer.toBinaryString(N);
        List<String> myList = new ArrayList<String>(Arrays.asList(nat.split("")));
        int binaryGap=0;
        int biggestGap=0;

        for(int i=0;i<myList.size() && myList.size()!=0;i++){
            if(myList.get(i).equals("0")){
                binaryGap++;
            }
            else{
                if(binaryGap>0 && binaryGap>biggestGap){
                    biggestGap=binaryGap;
                    binaryGap=0;
                }
                else
                    binaryGap=0;
            }
        }
        return biggestGap;
    }
}
