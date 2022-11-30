public class CodeWordChecker {
    private int minLen;
    private int maxLen;
    private String cantContain;

    public CodeWordChecker(int min, int max, String cantContain) {
        minLen = min;
        maxLen = max;
        this.cantContain = cantContain;
    }

    public CodeWordChecker(String cantContain) {
        minLen = 6;
        maxLen = 20;
        this.cantContain = cantContain;
    }

    public boolean isValid(String word) {
        int stringLen = word.length();

        boolean isInRange = inRange(minLen, maxLen, stringLen);
        boolean isContained = word.contains(cantContain);

        return (!isContained && isInRange);
    }

    private boolean inRange(int minNum, int maxNum, int checkNum) {
        return (checkNum >= minNum && checkNum <= maxNum);
    }
}
