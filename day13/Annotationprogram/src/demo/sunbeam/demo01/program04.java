package demo.sunbeam.demo01;
//multi-value annnotation

import java.lang.annotation.*;
import java.util.Scanner;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Development {
    String name();
    String description();
}
@MyAnnotation()
class Employee{
    int id;
    String name;
    String desription;

    @Development(name="Mukesh",description = "Sr dev")
    void accept(Scanner scanner){

    }
    @Development(name="Ramesh",description = "jr.developement")
    void accept2(){
    }
}


public class program04 {
    public static void main(String[] args) {

    }

}
