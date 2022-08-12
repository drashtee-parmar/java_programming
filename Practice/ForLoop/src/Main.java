public class Main {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.00, 2.0));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000.00, 3.0));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000.00, 4.0));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000.00, 5.0));

        // for loop - allows to execute code certain amount of time
        for (int i = 0; i < 6; i++) {
            System.out.println("Loop " + i + " hello");
        }
        System.out.println("*********************************");


        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        /*Increment using for loop*/
        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }
        System.out.println("______________________________________");


        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        /* Decrement using for loop */
        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}