import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Time{
    int hr;
    int min;
    int sec;
    void acceptTime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hrs");
        hr = sc.nextInt();
        System.out.println("Enter min");
        min = sc.nextInt();
        System.out.println("Enter sec");
        sec = sc.nextInt();
    }
    void displayTime(){
        System.out.println("hr:"+hr+" min:"+min+" sec:"+sec);

    }
}

public class Main {


    public static void main(String[] args) {
        System.out.println("Enter hrs");

        Time t = new Time();
        t.acceptTime();
        t.displayTime();

        Time t1 = new Time();

        t1.acceptTime();
        t1.displayTime();

         Time t2 = new Time();
         t2.acceptTime();
         t2.displayTime();


    }
}