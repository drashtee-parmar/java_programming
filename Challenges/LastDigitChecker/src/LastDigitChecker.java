public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        boolean range = (((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000))
                && ((num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num3 % 10 == num1 % 10))) ? true : false;
        return range;
    }
}
