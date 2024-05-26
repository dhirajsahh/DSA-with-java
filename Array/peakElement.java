public class peakElement {
    
    static int peakElementIndex(int a[]){
        int n=a.length;
        int index=-1;
         if(a[0]>a[1]) return 0;
         if(a[n-1]>a[n-2]) return n-2;
//3,5,6,4
        for(int i=1;i<=n-2;i++){
            
            if(a[i]>a[i+1]&&a[i]>a[i-1]){
              index=i;
              
              break;  
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
       int []arr={1,2,1,3,5,6,4};
       int peakIndex=peakElementIndex(arr);
       System.out.println(peakIndex);
      
       
       

    }
    

}
