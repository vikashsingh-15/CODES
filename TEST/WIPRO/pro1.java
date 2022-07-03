import java.util.*;
class pro1 {

  static int operationCount(String word, int input1, int input2) {

    
    //  int total=word.length();
    //  int x=input1+input2;

    //  if(total%x == 0){
    //       return (total/x<<1);
    //   }
    //   else{
    //       return ( (total/x<<1)+1);
    //  }

    int total = word.length();
    String begin = "";
    String end = "";
    String dummy = word;
    // Boolean will=true;
    int count = 0;

    for (int i = 0; i < word.length(); i++) {
      begin = dummy.substring(0, total - input1);
      end = dummy.substring(total - input1);
      dummy = end + begin;
      count++;
      if (dummy.equals(word)) {
        return count;
      } else {
        begin = dummy.substring(0, total - input2);
        end = dummy.substring(total - input2);
        dummy = end + begin;
        count++;
        if (dummy.equals(word)) {
          return count;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String word = s.next();
    int input1 = s.nextInt();
    int input2 = s.nextInt();
    int result = operationCount(word, input1, input2);
    System.out.println(result);
    s.close();
  }
}
