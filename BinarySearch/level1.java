public class level1 {
    public static int firstOccurence(int arr[],int key){
        int firstIndex=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                firstIndex=mid;
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else {
                end=start-1;
            }
        }
        return firstIndex;
    }
     
    public static int lastOccurence(int arr[],int key){
        int lastIndex=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                lastIndex=mid;
                start=mid+1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else {
                end=start-1;
            }
        }
        return lastIndex;
    }






    public static void main(String[] args) {
        int nums[]={1,2,5,5,5,7,7,8,9};
        int firstindex=firstOccurence(nums, 5);
        int lastIndex=lastOccurence(nums, 5);
        System.out.println(firstindex+" "+lastIndex);
        int count=lastIndex-firstindex+1;
        System.out.println("number of occurence of key is "+count);
    }
}
