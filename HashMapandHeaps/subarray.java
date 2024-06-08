import java.util.HashMap;

public class subarray {
    
    public static int lsaw0sum(int arr[]){

        int maxlen=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i=-1;
        int sum=0;
        hm.put(sum,i);
        while(i<arr.length-1){
            i++;
            sum+=arr[i];
            if(hm.containsKey(sum)==false){
                hm.put(sum,i);
            }
            else {
              int val=hm.get(sum);
             
              maxlen=Math.max(maxlen, i-val);
            }
        }
        return maxlen;
    }
    public static int noofsubarrayw0sum(int arr[]){
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i=-1;
        int sum=0;
        hm.put(sum,1);
        while(i<arr.length-1){
            i++;
            sum+=arr[i];
            if(hm.containsKey(sum)){
               int oldfr=hm.get(sum);
               count+=oldfr;
               hm.put(sum, oldfr+1);
            }
            else {
                hm.put(sum,1);
            }
        }
        return count;

    }



    //equal no of zero one
       public static void main(String args[]){

        int a[]={2,8,-3,-5,2,-4,6,1,2,1,-3,4};
        int maxlen=lsaw0sum(a);
        System.out.println(maxlen);
        int ans=noofsubarrayw0sum(a);
        System.out.println(ans);
    

        

    }
}
