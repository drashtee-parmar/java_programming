public class Main {
    public static void main(String[] args) {
        String numberAsString = "2020.125";
        System.out.println("numberAsString = " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
//        System.out.println("number = " + number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("doubleNumber = " + doubleNumber);

        numberAsString += 1;
//        number += 1;
        doubleNumber += 1;

        System.out.println("numberAsString = " + numberAsString);
//        System.out.println("number = " + number);
        System.out.println("doubleNumber = " + doubleNumber);

    }
}