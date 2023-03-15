package acodemy.lv;


public class AboutMe {
    public static void main(String[] args) {
        Me Oleg = new Me("Oleg","Bogdanov",29, 19930728,2,63.5,"QA Engineer");
        System.out.println(Oleg);

        Oleg.display();

        Me Viktorija = new Me("Viktorija","Bogdanova",28,1994.0602,"Customer Service Representative");

        Viktorija.display();
        }
    }
