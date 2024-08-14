
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        if (i % 3 == 0) {
            System.out.println("parne");
        } else {
            System.out.println("ne parne");
        }

        Main main = new Main();
        main.checkDaysOfWeek("Monday");
        main.checkDaysOfWeek("Tuesday");
        main.checkDaysOfWeek("Wednesday");

       main.checkDaysOfWeek1("Thursday");
        main.checkDaysOfWeek1("Friday");
        main.checkDaysOfWeek1("yyy");

    }
        public void checkDaysOfWeek (String day1){

            DaysOfWeek myDaysOfWeek = new DaysOfWeek();

            if (myDaysOfWeek.isDaysOfWeek(day1)) {
                switch (day1.toLowerCase()) {
                    case "monday":
                        System.out.println("Monday is the first");
                        break;
                    case "tuesday":
                        System.out.println("Tuesday is the second");
                        break;
                    case "wednesday":
                        System.out.println("Wednesday is the third");
                        break;
                    default:
                        System.out.println("No other days found");
                        break;
                }
            } else {
                System.out.println("No other days found");
            }
        }
    public void checkDaysOfWeek1(String day1){
        DaysOfWeek mydaysOfWeek1 = new DaysOfWeek();

       if (mydaysOfWeek1.isDaysOfWeek(day1)){System.out.println("Checking day: " + day1);}

        else {
           System.out.println( "No other days found with updates");
        }
    }
}

