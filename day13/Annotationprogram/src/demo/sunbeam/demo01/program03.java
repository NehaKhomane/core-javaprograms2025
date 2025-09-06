package demo.sunbeam.demo01;
//Single Value Annotation
//single value annnotation
import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD,ElementType.METHOD})
@interface MyAnnotation1{
    String value();
}
@MyAnnotation1("unused")
class A{
    @MyAnnotation1(value = "rawtype")
    int a;

    @MyAnnotation1("raw type")
    void method1(){

    }
}


public class program03 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
