public class Main {
    public static void main(String[] args) {

        char switchChar = 'H';
        switch(switchChar){
            case 'A':
//                System.out.println(switchChar + " was found");
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D' : case 'E':
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println("Could not found A,B,C,D or E");
                break;
        }

    }


}