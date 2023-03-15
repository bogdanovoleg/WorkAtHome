package acodemy.lv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {

    Calendar c = Calendar.getInstance();     //вводим дату
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    String formatted = format1.format(c.getTime());
    c.set(1993,06,28);


    }
}