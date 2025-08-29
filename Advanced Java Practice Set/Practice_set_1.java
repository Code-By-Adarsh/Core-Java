import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
public class Practice_set_1 {
    public static void main(String[] args) {
        //1)
        /*
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Student 1");
        a1.add("Student 2");
        a1.add("Student 3");
        a1.add("Student 4");
        a1.add("Student 5");
        a1.add("Student 6");
        a1.add("Student 7");
        a1.add("Student 8");
        a1.add("Student 9");
        a1.add("Student 10");
        for (String ob:a1){
            System.out.println(ob);
        }
         */

        //2)
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //3)
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //4)
        LocalTime t = LocalTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:s");
        String myTime = t.format(dt);
        System.out.println(myTime);

        //5)
        /*
        HashSet<Integer> h = new HashSet<>();
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(8);
        h.add(9);
        h.add(10);
        h.add(5);
        System.out.println(h);
         */
    }
}