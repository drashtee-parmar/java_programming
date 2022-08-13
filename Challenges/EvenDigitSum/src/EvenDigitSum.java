public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sumEven = 0;
        while(number > 0){
            if (((number %10)%2) ==0){
                sumEven += (number % 10);

            }
            number /= 10;
        }
        return sumEven;
    }
}
