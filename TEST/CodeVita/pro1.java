class A{
   // static int a=10;
    static final int AB=20;
    {
        System.out.println("IB");
    }
    static{
        System.out.println("static");
    }
}

public class pro1 {
    public static void main(String []args){
    System.out.println(A.AB);
    }
}
