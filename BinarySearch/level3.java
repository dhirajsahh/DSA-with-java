public class level3 {
    //search in nearly sorted array
    public static int searchIn(int []nums,int key){
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key){
                return mid;
            }else if(nums[mid-1]==key){
                return mid-1;
            }else if(nums[mid+1]==key){
                return mid+1;
            }else if(nums[mid]>key&&end<=n-1){
                 start=mid+1;
            }else if(start>=mid-1&&nums[mid]<key){
                 end=mid-1;
            }
        }
        return -1;
    }
     //floor of an element in sorted array
     public static int findFloor(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int floor=0;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return nums[mid];
            }
            else if(nums[mid]>target){
              
              end=mid-1;

            }else {
                floor=nums[mid];
                start=mid+1;
            }
        }
        return floor;
     }
     //find ceil
     public static int findCeil(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int ceil=0;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return target;
            }
            else if(nums[mid]>target){
                ceil=nums[mid];
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }   
        return ceil;
        
     }

    public static void main(String[] args) {
        int arr[]={5,10,30,20,40};
        int key=20;
        System.out.println(searchIn(arr, key));
        int nums[]={1,2,3,4,8,10,10,12,19};
        int target=5;
        System.out.println(findFloor(nums,target));
        System.out.println(findCeil(nums, target));
    }
}
