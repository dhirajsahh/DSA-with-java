public class sortedArray {
    //find two number with given sum in sorted array;
    public static void twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int []arr=new int[2];
        
        int i=0;
        int j=n-1;
        while(i<j){
           int sum=numbers[i]+numbers[j];
           if(sum>target){
            j--;
           }
           else if(sum<target){
            i++;
           }
           else {
           System.out.println(i+" "+j);
           break;
           }
        }

    }

    public static void main(String[] args) {
        
        // int []arr={2,7,11,15};
       int []a={2,3,4};
       int target=6;
        twoSum(a,target);
    }
}
