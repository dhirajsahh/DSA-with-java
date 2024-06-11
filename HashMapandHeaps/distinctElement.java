import java.util.ArrayList;
import java.util.HashMap;

public class distinctElement {
    //Distinct elements in windows of size k
    public static void distinctElementInWindow(int arr[],int k){
       
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        int j=-1;
        int i=0;
        while(i<k-1){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            i++;

        }
        i--;
        while(i<arr.length-1){
            i++;
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            list.add(map.size());
            j++;
            int tfr=map.get(arr[j]);
            if(tfr==1) map.remove(arr[j]);
            else {
                map.put(arr[j], tfr-1);
            }
        }
      System.out.println(list);
        

    }

    public static void main(String[] args) {
        int arr1[]={2,5,5,6,3,2,3,2,4,5,2,2,2,2,3,6};
        int a=4;
        distinctElementInWindow(arr1,a);
    }
}
