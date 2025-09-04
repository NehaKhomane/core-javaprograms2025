package demo.sunbeam.demo01;

import java.util.Arrays;
import java.util.Comparator;

class Product{
     int pid;
     String name;
     Double price;

     Product(){

     }
     Product(int pid, String name, Double price) {
         this.pid = pid;
         this.name = name;
         this.price = price;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "pid=" + pid +
                 ", name='" + name + '\'' +
                 ", price=" + price +
                 '}';
     }
 }

public class program01 {
   public static void displayProduct(Product [] p,String message){
       System.out.println("--------------------------------");
       System.out.println(message);
       System.out.println("--------------------------------");
       for(int i=0;i<p.length;i++){
           System.out.println(p[i]);
           System.out.println("--------------------------------");
       }
   }
    public static void main(String[] args) {
       Product[] p = new Product[5];
       p[0]=new Product(5,"pen",10.5);
       p[1]=new Product(1,"pen",10.5);
       p[2]=new Product(4,"pen",10.5);
        p[3]=new Product(3,"pen",10.5);
        p[4]=new Product(2,"pen",10.5);

        displayProduct( p,"All the product in unsorted manner");
//        class ProductIdComparator implements Comparator<Product> {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.pid - o2.pid;
//            }
//        }

        //ProductIdComparator idComparator = new ProductIdComparator();
        //Arrays.sort(arr, idComparator);

        //Arrays.sort(arr, new ProductIdComparator()); // Anonymous Object

        // Anonymous class
//        Comparator<Product> idComprator = new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.pid - o2.pid;
//            }
//        };

        //Arrays.sort(arr, idComprator);


        /*********** Anonymous Object of Anonymous class*********/
        Arrays.sort(p,new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o1.pid-o2.pid;
            }
        });
        displayProduct(p,"All the product in sorted manner on productID...");




    }
}
