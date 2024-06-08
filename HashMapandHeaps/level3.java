import java.util.HashMap;

public class level3 {

    public static boolean consquective(int arr[], int k) {
        boolean ans;
        if (arr.length % k != 0)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int val : arr) {
           int  tsp=val;
            int t1=1;
            while (map.containsKey(tsp - t1)) {
                int fr = map.get(val);
                if (fr == 0) {
                    map.remove(val);
                }
                t1++;
                map.put(val, fr - 1);
            }

        }
        System.out.println(map);
        ans = true;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11 };
        int k = 3;
        boolean ans = consquective(arr, k);
        System.out.println(ans);
    }
}
