public class DaysOfWeek {
    private String [] sevenDaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public boolean isDaysOfWeek (String day1) {
        for (String d : sevenDaysOfWeek) {
            if (d.equalsIgnoreCase(day1)) {
                return true;
            }
        }
        return false;

    }
    }
