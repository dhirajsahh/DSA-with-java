public class mergeArray {
    public static int[]mergeSortedArray(int []nums1,int []nums2){
        int []ans=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length){
           if(nums1[i]<nums2[j]){
            ans[k]=nums1[i];
            k++;
            i++;
           }
           else {
            ans[k]=nums2[j];
            k++;
            j++;
           }
        }
        while(i<nums1.length){
            ans[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            ans[k]=nums2[j];
            k++;
            j++; 
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int []nums1={1,2,12,13,14};
        int []nums2={2,5,12,15};
        int []sortedArray=mergeSortedArray(nums1,nums2);
        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
    }
}
