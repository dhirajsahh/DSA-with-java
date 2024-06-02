public class level2 {

    public static int singleNumber(int a[]) {
        int ans = a[0];
        for (int i = 1; i < a.length; i++) {
            ans = (ans ^ a[i]);
        }
        return ans;
    }

    public static void singleNumber2(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = (ans ^ nums[i]);
        }
        int rmsb = (ans & -ans);
        int ans1 = 0;
        int ans2 = 0;
        for (int val : nums) {
            if ((val & rmsb) == 0) {
                ans1 = (ans1 ^ val);
            } else {
                ans2 = (ans2 ^ val);
            }
        }
        System.out.println(ans1 + " " + ans2);
    }

    public static void duplicateandmissingnumber(int arr[]) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans ^= i;
        }
        for (int val : arr) {
            ans ^= val;
        }
        int rmsb = (ans & -ans);
        int ans1 = 0;
        int ans2 = 0;
        for (int val : arr) {
            if ((val & rmsb) == 0) {
                ans1 ^= val;

            } else {
                ans2 ^= val;
            }
        }
        for(int val:arr){
            if(ans1==val){
                System.out.println("The duplicate number is "+ans1);
                System.out.println("missing is "+ans2);
            }
            else {
                System.out.println("The duplicate number is "+ans2);
                System.out.println("missing is "+ans1);
                break;
            }
        }
    }
    public static void main(String[] args) {

        // int arr[]={4,1,2,1,2};
        int a[] = { 1, 2, 1, 3, 2, 5 };
        // singleNumber2(a);
        int[] b = { 3, 6, 2, 5, 1, 6, 7 };
        duplicateandmissingnumber(b);
        // int result=singleNumber(arr);
        // System.out.println("The single non repeating number is "+result);
    }
}
