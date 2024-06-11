
import java.util.HashMap;

public class ArrayPair {
    //check array pair are divisible by k
    public static boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            int rem = val % k;
            if (rem < 0) {
                map.put(rem + k, map.getOrDefault(rem + k, 0) + 1);
            } else {
                map.put(rem, map.getOrDefault(rem, 0) + 1);
            }
        }
        for (int val : arr) {
            int rem = val % k;
            int fr = map.getOrDefault(rem,0);
            if (rem % k == 0) {
                if (fr % 2 != 0)
                    return false;
            } else if (2 * rem == k) {
                if (fr % 2 != 0)
                    return false;
            } else {
                int x = map.getOrDefault(rem,0);
                int y = map.getOrDefault(k - rem, 0);
                if (x != y)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int arr[] = {-1,1,-2,2,-3,3,-4,4};
        int k = 3;
        boolean result = canArrange(arr, k);
        System.out.println(result);
    }

}
