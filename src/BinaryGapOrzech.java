public class BinaryGapOrzech {
    public int solutionOrzech(int N) {
        String binaryAsString = Integer.toBinaryString(N);
        int binaryGap = 0;
        int biggestGap = 0;

        for (int i = 0; i < binaryAsString.length(); i++) {
            if (binaryAsString.charAt(i) == '0') {
                binaryGap++;
            }
            else {
                if (binaryGap > 0 && binaryGap > biggestGap) {
                    biggestGap = binaryGap;
                }
                binaryGap = 0;
            }
        }
        return biggestGap;
    }
}
