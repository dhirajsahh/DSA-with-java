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




    public static void main(String[] args) {
        
         //int []arr={1,2,3,1,1,4,1,1};
         int []arr={3,3,4};
         int majorityelement=majorityelementNumber(arr);
         System.out.println(majorityelement);
       
       
    }


}
