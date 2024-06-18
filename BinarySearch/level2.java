public class level2 {
    //No of times sorted array is rotated
    public static int arrayRotated(int []arr){
        int noOfTimes=-1;
        int start=0;
        int n=arr.length;
        int end=n-1;
        while (start<=end) {
              int mid=start+(end-start)/2;
              int next=(mid+1)%n;
              int prev=(mid+n-1)%n;
              if(arr[mid]<=arr[next]&&arr[mid]<=arr[prev]){
                noOfTimes=mid;
                break;
              }  
              else if(arr[mid]<=arr[end]){
                end=mid-1;
              } 
             else if(arr[start]<=arr[mid]){
                start=mid+1;
              }  
              
        }
        return noOfTimes;
    }
    //search in sorted rotated array
    public static int searchInRotatedArray(int[] nums,int start,int end,int key){
        int elementIndex=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
                    
            if(nums[mid]==key){
                return mid;
            }
            else if(nums[mid]<key){
                start=mid+1;
            }
            else end=mid-1;
        }
        return elementIndex;
    }
    //search in sorted array  method2
    public static int searchInSortedRotated(int arr[],int key){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key) return mid;
            if(arr[start]<=arr[mid]){
              if(arr[start]<=key&&key<arr[mid]){
                end=mid-1;
              }else {
                start=mid+1;
              }
            }else {
            
                if(arr[mid]<key&&key<=arr[end]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int []nums={3,4,5,1,2};
        int noOfTimes=arrayRotated(nums);
        System.out.println(noOfTimes);
        //for minimum element in sorted array
        System.out.println(nums[noOfTimes]);
        int key=2;
        int indexOnfirstPart=searchInRotatedArray(nums, 0, noOfTimes-1, key);
        int indexOnsecondPart=searchInRotatedArray(nums, noOfTimes-1,nums.length-1, key);
        System.out.println(indexOnfirstPart);
        System.out.println(indexOnsecondPart);
        System.out.println(searchInSortedRotated(nums, key));
       

    }
}
