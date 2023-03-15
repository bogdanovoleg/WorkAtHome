package acodemy.lv;

import lombok.*;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

@Getter

public class Me {
    private String name;
    private String lastName;
    @Setter
    private int age;
    private double birthdayDate;
    @Setter
    private double height;
    @Setter
    private double weight;
    @Setter
    private String jobPosition;


    public Me(String name, String lastName, int age, double birthdayDate, double height, double weight, String jobPosition) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.birthdayDate = birthdayDate;
        this.height = height;
        this.weight = weight;
        this.jobPosition = jobPosition;
    }

    public Me(String name, String lastName, int age, double birthdayDate, String jobPosition) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.birthdayDate = birthdayDate;
        this.jobPosition = jobPosition;
    }

    @Override
    public String toString() {
        return "Me{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthdayDate=" + birthdayDate +
                ", height=" + height +
                ", weight=" + weight +
                ", jobPosition='" + jobPosition + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(c.getTime());
        c.set(1993,07,28);
    }

    public void display() {
        if (name != null) {
            System.out.print(name + " ");
        }
        if (lastName != null) {
            System.out.print(lastName + " ");
        }
        if (age > 0) {
            System.out.print(age + " years old ");
        }
        if (birthdayDate > 0) {
            System.out.print(birthdayDate + " ");
     //       if (birthdayDate == null) {
      //      System.out.print(birthdayDate + " ");
        }
        if (height > 0 && height % 1 != 0) {
            System.out.print(height + " metres ");
        } else if (height == 2) {
            System.out.print(height + " meters ");
        }
        if (weight > 0) {
            System.out.print(weight + " kg ");
        }
        if (jobPosition != null) {
            System.out.println(jobPosition);
        }

        //   System.out.println(name + " " + lastName + " " + age + " " + birthDay + " " + height + " " + weight + " " + jobPosition);
    }
}

