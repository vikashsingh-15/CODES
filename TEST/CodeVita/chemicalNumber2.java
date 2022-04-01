package CodeVita;
import java.util.*;
public class chemicalNumber2
{
    public static int number(String Str[])
    {
        ArrayList<Integer> Alist = new ArrayList<>();
        for(int i =0;i<Str.length;i++)
        {
            String check = Str[i];
            if(Str[i].length() == 1)
            {
                Alist.add(check.charAt(0)-55);
            }
            else
            {
                Alist.add(((check.charAt(0)-55)*(check.charAt(1)-60))+(check.charAt(1)-61));
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<Alist.size()-1;i++)
        {
            for(int j =i+1;j<Alist.size();j++)
            {
                max= Math.max(max,affinity(Alist.get(i),Alist.get(j)));
            }
        }
        return max;
    }
    public static int affinity(int h,int c)
    {
        if(c == 0)
        {
            return h;
        }
        return affinity(c,h%c);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String [] inputArray = input.split(" ");
	    int ans = number(inputArray);
	    System.out.println(ans);
	}
}