import java.util.*;
public class largestRectangleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=largestRectangleArea(arr);
        System.out.println("Largest Rectangle Area is "+ans);


    }
    public static int largestRectangleArea(int[] arr) {
		int n = arr.length;
		int maxAns = 0;
		int ps[] = prevSmaller(arr,n);
		int ns[] = nextSmaller(arr,n);
		for(int i = 0; i < n; i++)
		{
			maxAns = Math.max(maxAns, (ns[i] - ps[i] - 1) * arr[i]);
		}
		return maxAns;
    }
    

    public static int[] prevSmaller(int arr[], int n){
		int[] ps = new int[n];
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<n;i++)
		{
			while(s.size()>0 && arr[i]<=arr[s.peek()])
			{
				s.pop();
			}
			if( s.isEmpty())
			{
				ps[i]=-1;
			}
			else
			{
				ps[i]=s.peek();
			}
			s.push(i);
		}
		return ps;
	}

    public static int[] nextSmaller(int[] arr, int n) {
		Stack<Integer> stack = new Stack<>();
		int[] next = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			while (stack.size() > 0 && arr[i] <= arr[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				next[i] = n;
			} else {
				next[i] = stack.peek();
			}
			stack.push(i);
		}
		return next;
	}


 }
    

