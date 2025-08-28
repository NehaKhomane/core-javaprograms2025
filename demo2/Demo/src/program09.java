public class program09 {
    public static void main(String[] args) {
        int n1=10; //primitive
        //Integer i1 =new Integer(n1); //boxing
        Integer i1=n1; //auto unboxing
        System.out.println(i1);

        Integer i2=new Integer(20);//unboxing
        //int n2=i2.intValue();//unboxing
        int n2=i2; //auto unboxing
        System.out.println(n2);


    }

}
