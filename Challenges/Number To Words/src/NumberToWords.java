public class NumberToWords {
    public static void numberToWords(int number) {
        int num = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= getDigitCount(number); i++) {
            int digit = num % 10;
            num /= 10;

//        int count = getDigitCount(number);
//        number = reverse(number);
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
    }

//        for (int i = 1; i /= 10; i++)
//        System.out.println("Invalid Value");


    public static int reverse(int number) {
        int reverseNumber = 0;
        int digit = 0;
        for (int i = number; number != 0; number /= 10) {
            digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
        }
        return reverseNumber;
    }


    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
//        for (int i = 0; number > 0; i++) {
        while (number > 0) {
            number /= 10;
//        for (int i = number; i != 0; i /= 10) {
            count++;
        }
        return count;
    }
}