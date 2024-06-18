
public class binarySearch {
    //for ascending
    public  static int findIndex(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=end+(start-end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return key;
    }
    //for descending one
    public static int findIndexDescending(int []arr,int k){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr={2,4,6,8,10,12,14};
        int index=findIndex(arr,6);
        System.out.println(index);
        int []nums={10,9,7,5,4,3,1,0};
        int key=9;
        System.out.println(findIndexDescending(nums, key));
    }
}
