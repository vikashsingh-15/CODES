import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        threeSum(arr, target);
    }

    public static void threeSum(int[] arr, int target) {
        if (arr.length < 3) {
            List<List<Integer>> list = new ArrayList<>();
            System.out.println("No triplets");
        } else {
            // int target=0;
            Map<Integer, Integer> map = new HashMap<>();
            HashSet<List<Integer>> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            for (int i = 0; i < arr.length - 1; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);

                for (int j = i + 1; j < arr.length; j++) {
                    map.put(arr[j], map.getOrDefault(arr[j], 0) - 1);
                    int sum = arr[i] + arr[j];
                    if (map.containsKey(target - sum) && map.get(target - sum) > 0) {

                        List<Integer> list = new ArrayList<>();
                        // System.out.println(arr[i]);
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(target - sum);
                        // System.out.println(list);
                        Collections.sort(list);
                        // System.out.println(list);
                        set.add(list);
                    }
                    map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                }

            }
            if (set.size() > 0) {
                System.out.println(set);
            } else {
                System.out.println("No triplets");
            }
        }

    }

}