import java.util.Scanner;
/****************************************************
*---------- author=Neha Khomane (w3)---------------
*  question-Accept  integer number and when the program is executed print the binary, octal and
* hexadecimal equivalent of the given number.*******/


public class demo01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int n=sc.nextInt();
        System.out.println(" binary conversion is " + Integer.toBinaryString(n));
        System.out.println("octal conversion is" + Integer.toOctalString(n));
        System.out.println("hexadecimal conversion is " + Integer.toHexString(n));
        System.out.println("hexadecimal reverse conversion is " + Integer.toHexString(n));


    }
}
