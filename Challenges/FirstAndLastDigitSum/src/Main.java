public class Main {
    public static void main(String[] args) {
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));// 2+2 = 4
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257)); // 2 + 7 = 9
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0)); // 0 + 0 = 0
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5)); // 5 + 5 = 10
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));// negative value should return false i.e -1
    }
}