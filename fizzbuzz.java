import java.util.*;
class fizzbuzz
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++)								
		{
			if (i%15==0)												
				System.out.println("FizzBuzz.");
			else if (i%5==0)	
				System.out.println("Buzz.");
			else if (i%3==0)	
				System.out.println("Fizz.");
				
			else 
				System.out.println(i);						
		}
	}
}
