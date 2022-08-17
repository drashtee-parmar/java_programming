public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisior(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int num = Math.min(first, second);
        while (num > 0) {
            if ((first % num == 0) && (second % num == 0)) {
                break;
            }
            num--;
        }
        return num;
    }
}
