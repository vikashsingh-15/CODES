import java.util.Scanner;

public class triplet
{
    private int a;
    private int b;
    private int c;
    
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();
    }
    
    public void findprint() {
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)
                || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)
                || (Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2))
            System.out.print("Pythagorean Triplets");
        else
            System.out.print("Not Pythagorean Triplets");
    }
    
    public static void main(String args[]) {
        triplet obj = new triplet();
        obj.getdata();
        obj.findprint();
    }
}
