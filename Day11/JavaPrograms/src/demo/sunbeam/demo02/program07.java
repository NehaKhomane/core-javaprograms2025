package demo.sunbeam.demo02;

import java.util.function.BinaryOperator;

public class program07 {
    public static void doArithmatic(BinaryOperator<Double> op){
        System.out.println( "result" + op.apply(10.2,10.2));
    }

    public static void main(String[] args) {
       // doArithmatic((a,b)->a+b);

        //method refrence
        doArithmatic(Double::sum);

    }
}
