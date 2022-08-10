public class Main {
    public static void main(String[] args) {

        String month = "JuNe";
        switch (month.toUpperCase()){
            case "January":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
            case "March":
                System.out.println("March");
                break;
            case "April":
                System.out.println("April");
                break;
            case "May":
                System.out.println("May");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            case "July":
                System.out.println("July");
                break;
            case "August":
                System.out.println("Aug");
                break;
            case "September":
                System.out.println("Sep");
                break;
            case "October":
                System.out.println("Oct");
                break;
            case "November":
                System.out.println("Nov");
                break;
            case "December":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }

    }
}