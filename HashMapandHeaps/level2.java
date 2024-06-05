import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class level2 {

    public static void  getcommonElement(int []a1,int []a2){

        ArrayList<Integer>list=new ArrayList<>();
            
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:a1){
            if(hm.containsKey(val)){
                 int oldval=hm.get(val);
                 hm.put(val, oldval+1);
            }
            else {
                hm.put(val,1);
            }
        }
        for(int val:a2){
            if(hm.containsKey(val)){
              list.add(val);
              hm.remove(val);
            }
        }
        
          System.out.println(list);
    }
    public static void  getcommonElement2(int []a1,int []a2){

        ArrayList<Integer>list=new ArrayList<>();
            
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:a1){
            if(hm.containsKey(val)){
                 int oldval=hm.get(val);
                 hm.put(val, oldval+1);
            }
            else {
                hm.put(val,1);
            }
        }
        for(int val:a2){
            if(hm.containsKey(val)){
                int fr=hm.get(val);
                    if(fr>0){
                        list.add(val);
                    }
                hm.put(val, fr-1);
            }
        }
        
          System.out.println(list);
    }

    public static void main(String [] args){
        int n;
        Scanner sn=new Scanner(System.in);
        n=sn.nextInt();
        int []arr1=new int [n];
        int []arr2=new int [n];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sn.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sn.nextInt();
        }

        
   
        //getcommonElement(arr1,arr2);
        getcommonElement2(arr1,arr2);
    }
}