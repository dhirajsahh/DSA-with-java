
public class prefixsum {
    
    static void prefixsum1(int arr[]){
        int n=arr.length;
        int sum=0;
        int []a=new int[n];    // 2,3,1,-4,3,-2  
        for(int i=0;i<n;i++){
            sum+=arr[i];
            a[i]=sum;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
       int []arr={2,3,1,-4,3,-2};
       prefixsum1(arr);

    }
}
