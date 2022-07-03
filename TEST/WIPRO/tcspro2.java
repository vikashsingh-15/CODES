import java.util.*;

public class tcspro2 {
    public static int levelCount(String word) {

        int currentMax = 0;
        int max = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == '{') {
                currentMax++;
                if (currentMax > max) {
                    max = currentMax;
                }
            } else if (word.charAt(i) == '}') {
                if (currentMax > 0) {
                    currentMax--;
                } else {
                    return -1;
                }
            }
        }

        if (currentMax != 0) {
            return -1;
        } else {
            return max+1;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int result = levelCount(word);
        System.out.println(result);
        s.close();
    }

  }

    }

    public static void main(String[] args) {

    }
}
