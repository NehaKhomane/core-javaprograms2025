package demo.sunbeam.demo02;

import java.util.function.BinaryOperator;

public class program06 {
    public static void doArithmaticOperation(BinaryOperator<Integer> op){
        System.out.println("doArithmatic operation" +op.apply(1,2));


    }
    public static void main(String[] args) {
        int a = 5;
       // a=20;
        /*** Should be final or effectively final*********/
        doArithmaticOperation((x,y)->x+y+a);
    }
}
