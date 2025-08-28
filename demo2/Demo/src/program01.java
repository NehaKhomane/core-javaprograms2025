 class Arithmatic{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b, int c){
        System.out.println(a-b-c);
    }
    void square(int a){
        System.out.println(a);
    }
     void multiply(int a,int b){
        System.out.println(a*b);
     }
     void divide(double a,int b){
        System.out.println(a/b);
     }
 }


public class program01 {
    public static void main(String[] args) {
        Arithmatic a = new Arithmatic();
        a.add(10,20);
        a.divide(10,20);
        a.multiply(10,20);
        a.square(10);
        a.sub(10,20,30);
        System.out.println();

    }

}
