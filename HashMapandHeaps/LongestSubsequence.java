import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubsequence {
    public static ArrayList<Integer>glcs(int arr[]){
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Boolean>hm=new HashMap<>();
        for(int val:arr){
            hm.put(val,true);
        }
        for(int val:arr){
            if(hm.containsKey(val-1)){
                hm.put(val, false);
            }
        }
        int maxlen=0;
        int maxsp=0;
        for(int val:arr){
            if(hm.get(val)==true){
                int tl=1; //temporary length
                int tsp=val; //temp start point
                while(hm.containsKey(tsp+tl)){
                    tl++;
                }
                if(tl>maxlen){
                    maxlen=tl;
                    maxsp=tsp;

                }
            }
        }
        for(int i=0;i<maxlen;i++){
            list.add(maxsp+i);

        }

        return list;

    }


    public static void main(String [] args){
    int arr[]={5,9,1,11,8,6,15,3,12,2,10};
    ArrayList<Integer>sequence=new ArrayList<>();
    sequence=glcs(arr);
    System.out.println(sequence);

    }
}
