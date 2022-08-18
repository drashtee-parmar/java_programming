public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        big count = 5 kilos each
//        smallCount = 1 kilos each
//        goal = bigCount + smallCount
        if ((bigCount < 0) || (smallCount < 0) || goal < 0) {
            return false;
        }
        bigCount = bigCount * 5;
        smallCount = smallCount * 1;
        int sum = bigCount + smallCount;

        boolean flourCalculation = (goal <= sum && smallCount >= goal % 5) ? true : false;
        return flourCalculation;

    }
}
