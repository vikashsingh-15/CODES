import java.util.*;

public class solution {
  public static int solution(String str, int k) {
    HashMap<Character, Integer> hmap = new HashMap<>();
    int apoint = 0;
    int bpoint = 0;
    int l = str.length();
    int max = Integer.MIN_VALUE;

    while (bpoint < l) {
      char c = str.charAt(bpoint);
      bpoint++;
      hmap.put(c, hmap.getOrDefault(c, 0) + 1);
      if (hmap.size() == k) {
        int length = bpoint - apoint;
        max = Math.max(length, max);
      }
      else if (hmap.size() > k) {
        while (hmap.size() != k) {
          char d = str.charAt(apoint);
          hmap.put(d, hmap.get(d) - 1);
          apoint++;
          if (hmap.get(d) == 0) {
            hmap.remove(d);
          }
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    int k = scn.nextInt();
    System.out.println(solution(str, k));
  }

}
