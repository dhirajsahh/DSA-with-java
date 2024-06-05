import java.util.HashSet;



public class hashset {
    

    public static void main(String [] args){
        int arr[]={1,2,3,4,3};
        HashSet<Integer>set=new HashSet<>();
        for (int val:arr){
            set.add(val);
        }
        System.out.println(set);
        set.remove(3);
        System.out.println(set);
       

    }
}
