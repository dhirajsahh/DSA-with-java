// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
public class RotateArray {
    static void rotateArray(int a[],int target){
           int n=a.length;
           int k=target%n;
           reverseArray(a,0,n-k-1);
           reverseArray(a, n-k, n-1);
           reverseArray(a, 0, n-1);
    }
    static void reverseArray(int []a,int start,int end){
      while(start<end){
        int temp=a[end];
        a[end]=a[start];
        a[start]=temp;
        start++;
        end--;
      } 
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int target=3;
        rotateArray(a, target);
        for(int e:a){
            System.out.print(e+" ");
        }
        
    } 
}
