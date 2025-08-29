import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {
        //Date → ek class hai (old, java.util.Date)
        //Calendar → ek abstract class hai (java.util.Calendar)
        //GregorianCalendar → ek concrete class hai jo Calendar ko extend karti hai
        //java.util → ye ek package hai jisme ye sab purane classes the.

        //Later Java 8 ne ek naya package introduce kiya:
        //👉 java.time package (isme LocalDate, LocalTime, LocalDateTime etc. aate hain)

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df);
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df2);
        String myDate = dt.format(df);
        System.out.println(myDate);
        //For expert in java.time package only visit java 24 docs.
    }
}