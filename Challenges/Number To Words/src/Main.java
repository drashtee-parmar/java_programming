public class Main {
    public static void main(String[] args) {
        System.out.println("*****_____ Number to words _____*****");
        NumberToWords.numberToWords(234);
        System.out.println("**********");
        NumberToWords.numberToWords(1010);
        System.out.println("**********");
        NumberToWords.numberToWords(1000);
        System.out.println("**********");
        NumberToWords.numberToWords(-12);
        System.out.println("**********");

        System.out.println("__________ Reverse Method __________");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));

        System.out.println("__________ getDigitCount Method __________");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));


    }
}