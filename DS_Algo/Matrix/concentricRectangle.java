import java.util.*;
public class concentricRectangle {


public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   // int temp=n;
    int arr[][]=new int[n*2-1][n*2-1];
/*
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4  
*/

  for(int i=n;i>0;i--){
    for(int j=n;j>0;j--){
      if(i==n || j==n){
        arr[n-i][n-j]=n;
      }
      else if(j>=i){
        arr[n-i][n-j]=j;
      }
      else if(j<i){
        arr[n-i][n-j]=i;
      }

    }
  }

for(int i=0;i<n;i++){
  for(int j=0;j<arr.length;j++){
    if(j>n-1){
      arr[i][j]=arr[i][n*2-1-1-j];
    }   
  }
}

for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr.length;j++){
    if(i>n-1){
      arr[i][j]=arr[n*2-1-1-i][j];
    }   
  }
}

//  for(int i=n;i>0;i--){
//     for(int j=n;j>0;j--){
//       if(i==n || j==n){
//         arr[i-1][j-1]=n;
//       }
//       else if(j>=i){
//         arr[i-1][j-1]=j;
//       }
//       else if(j<i){
//         arr[i-1][j-1]=i;
//       }

//     }
//   }


  System.out.println("Vkash print");
  print(arr);  
}


static void print(int[][] arr){
  for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[i][j]+" ");
    }
    System.out.println();
  }
}
    
}
