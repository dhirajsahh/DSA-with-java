
public class ReverseArray {
    
    static void reverseArray(int a[]){
        int n=a.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []a={10,3,2,52,3};
        reverseArray(a);
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
