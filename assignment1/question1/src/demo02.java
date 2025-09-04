import java.util.InputMismatchException;
import java.util.Scanner;

/********************************
 *  ---------- Author= Neha khomane(w3-93236)
 *Accept 2 double values from User (using Scanner). Check data type. If arguments are not
 * doubles, supply suitable error message & terminate.
 * If numbers are double values, print its average.*******************/

public class demo02 {
    public static  double question( double num1 ,double num2){
     double   result=(num1+num2)/2;
        return result;
    }
    public static void main(String[] args) {
       try {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter  first number");
           double num1=sc.nextDouble();
           System.out.println("Enter second number");
           double num2=sc.nextDouble();
           System.out.println("average is" +question(num1,num2));
       } catch (InputMismatchException e) {
           e.printStackTrace();
           System.out.println("Invalid input");
       }

    }
}
