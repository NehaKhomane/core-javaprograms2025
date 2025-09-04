package demo.sunbeam.demo02;
//************** Non capturing lambda ***************//
import java.util.function.BinaryOperator;

public class program05 {
    public static void doArithmaticOperations(BinaryOperator<Double> op1) {
        System.out.println("Result" +op1.apply(10.2,11.2));
    }
    public static void main(String[] args) {
        class MyBinaryOperator implements BinaryOperator<Double> {
            @Override
            public Double apply(Double a, Double b) {
                return a+b;
            }
        }
        MyBinaryOperator myBinaryOperator = new MyBinaryOperator();
        doArithmaticOperations(myBinaryOperator);


        //non capturing lambda
        doArithmaticOperations((a,b)-> a+b);
        doArithmaticOperations((a,b)-> a-b);
        doArithmaticOperations((a,b)-> a*b);
        doArithmaticOperations((a,b)-> a/b);
    }
}
