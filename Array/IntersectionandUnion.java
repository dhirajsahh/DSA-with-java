import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionandUnion {
    public static int union(int []arr1,int []arr2){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        return set.size();
       
    }
    public static int intersection(int []arr1,int []arr2){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(list);
        return count;
    }


    public static void main(String []args){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        int noofunion=union(arr1,arr2);
        int noofis=intersection(arr1,arr2);
        System.out.println(noofunion+","+noofis);
    }
}
