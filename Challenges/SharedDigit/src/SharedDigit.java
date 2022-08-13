public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        boolean range = (((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99))
                && ((num1 / 10 == num2 / 10)
                || (num1 % 10== num2 % 10)
                || (num1 / 10 == num2 % 10)
                || (num1 % 10 == num2 / 10)))? true : false;
        return range;
    }
}
