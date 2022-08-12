public class Main {
    public static void main(String[] args) {

//        int num = 4;
//        int finishNum = 20;
//        while (num <= finishNum){
//            num++;
//            if (!isEvenNumber(num)){
//                continue;
//            }
//            System.out.println("Even number " + num);
//        }



//- make it also record the total number of even numbers it has found and at the end
//- display the total number of even numbers found

        int num = 4;
        int finishNum = 20;
        int evenNumFound = 0;

        while (num <= finishNum){
            num++;
            if (!isEvenNumber(num)){
                continue;
            }
            System.out.println("Even number " + num);
            evenNumFound++;
            if (evenNumFound >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found " + evenNumFound );
    }
//    - create a method called isEvenNumber that takes a parameter of type int
//- its purpose is to determine if the argument passwd to the method is an even or not
//- return true if an even number, otherwise return false.
    public static boolean isEvenNumber(int num){
        if ((num % 2) == 0){
            return true;
        }else {
            return false;
        }
    }


}