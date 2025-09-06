package demo.sunbeam.demo01;

import java.lang.annotation.*;

@Documented
@Inherited
// custom annotation
// meta annotations
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD,ElementType.METHOD})
@interface MyAnnotation {

}
@MyAnnotation
class MyClass {
    @MyAnnotation
    String name;
    @MyAnnotation
    void method1(){
        System.out.println("method1");
    }
}
public class program02 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
