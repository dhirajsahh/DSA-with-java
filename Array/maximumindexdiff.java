public class maximumindexdiff {
    
    //Given an arrray arr[] find the maximum j-i such that arr[j]>arr[i]
    public static int maxdiff(int arr[]){
        int diff=0;
        int n=arr.length;
        int []leftmin=new int [n];
        int []rightmax=new int [n];
        leftmin[0]=arr[0];
        rightmax[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            leftmin[i]=Math.min(leftmin[i-1], arr[i]);

        }
        for (int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int i=0;
        int j=0;
        while(i<n&&j<n){
             if(leftmin[i]<rightmax[j]){
                diff=Math.max(diff, j-i);
                j++;
             }
             else {
                i++;
             }
        }


        return diff;
       
    }     


    public static void main(String[] args) {
        // int []arr={5,4,1,7,2,8,6,3,4};
        int []arr={3,4,5,1,7,2,6,5,4,1};
       int result= maxdiff(arr);
       System.out.println(result);




   }
}
