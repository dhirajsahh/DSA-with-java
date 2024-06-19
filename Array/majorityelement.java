import java.util.ArrayList;

public class majorityelement {
       

    public static int majorityelementNumber(int a[]){
        int n=a.length;
        int count=1;
        int element=a[0];
        for(int i=1;i<n;i++){
           if(a[i]==element){
            count++;
           }
           else count--;
           if(count==0){
            count=1;
            element=a[i];
           }
        }
       
        int frequency=0;
        for(int i=0;i<n;i++){
            if(a[i]==element) frequency++;
            
        }
        
        if(frequency>n/2) return element;
        else return -1;

    }

    public static ArrayList<Integer> majorityElement2(int arr[]){
        ArrayList<Integer>list=new ArrayList<>();
         int n=arr.length;
         int element1=arr[0];
         int freq1=1;
         int element2=arr[0];
         int freq2=0;
         for(int i=1;i<n;i++){
            if(freq1>0&&freq2>0){
                if(arr[i]==element1){
                    freq1++;
                }
                else if(arr[i]==element2){
                    freq2++;
                } else {
                    freq1--;
                    freq2--;
                }
            }
            else if(freq1==0){
                 element1=arr[i];
                 freq1=1;
            }
            else {
                element2=arr[i];
                freq2=1;
            }
         }
        if(freq1>0) list.add(element1);
        if(freq2>0) list.add(element2);
        return list;
    }


    public static void main(String[] args) {
        
         //int []arr={1,2,3,1,1,4,1,1};
         int []arr={1,2};
         int majorityelement=majorityelementNumber(arr);
         ArrayList<Integer>majority=new ArrayList<>();
          majority=majorityElement2(arr);
          System.out.println(majority);
         
         //System.out.println(majorityelement);
       
       
    }


}
