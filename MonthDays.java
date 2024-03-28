import java.time.Month;

public class MonthDays {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month.toString() + ": " + month.length(false) + " days");
        }
    }
}
