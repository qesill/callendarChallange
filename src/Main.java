import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        1. Stwórz datę w przyszłści korzystając z Calendar,
        dodaj do aktualnej daty 10 lat, 3 dni, 10 godzin, 25 minut, 6 sekund
         */
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,10);
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.add(Calendar.HOUR,10);
        calendar.add(Calendar.MINUTE,25);
        calendar.add(Calendar.SECOND,6);

        Date newDate = calendar.getTime();
        System.out.println(newDate);
    }
}
