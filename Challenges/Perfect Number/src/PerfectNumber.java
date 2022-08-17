public class PerfectNumber {
    public static boolean isPerfectNumber (int number){
        if (number < 1){
            return false;
        }else {
            int perfectNumber = 0;
            for (int i = 1; i < number; i++){
                if (number % i == 0){
                    perfectNumber += i;
                }
            }
            return (perfectNumber == number);
        }
    }
}
