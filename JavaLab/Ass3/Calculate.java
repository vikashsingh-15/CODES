import java.util.Scanner;

public class Calculate
{
    private int a;
    private int b;
    private int sum;
    private int diff;

    public void inputdata() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();
    }
    
    public void calculate() {
        sum = a + b;
        diff = a - b;
    }
    
    public void outputdata() {
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }
    
    public static void main(String args[]) {
        Calculate obj = new Calculate();
        obj.inputdata();
        obj.calculate();
        obj.outputdata();
    }
}