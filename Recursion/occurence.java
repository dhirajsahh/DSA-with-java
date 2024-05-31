import java.util.Scanner;

public class occurence {
       public static int firstOccurence(int arr[],int i,int element){
        if(i==arr.length) return -1;
        if(arr[i]==element){
            return i;
        }
        else {
            int foccurence=firstOccurence(arr,i+1,element);
            return foccurence;
        }   
       }
       public static int  lastOccurence(int arr[],int i,int element){
        if(i==0) return -1;
        if(arr[i]==element){
            return i;
        }
        else {
            int loccurence=lastOccurence(arr,i-1,element);
            return loccurence;
        }
       }

    public static void main(String[] args){
        System.out.println("Enter the number of element in array");
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter the  element to be searched");
        int e=scn.nextInt();

        int foccurence=firstOccurence(arr,0,e);
       System.out.println(foccurence);
       int loccurence=lastOccurence(arr,n-1,e);
       System.out.println(loccurence);

    }

}
