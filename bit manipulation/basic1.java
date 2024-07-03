public class basic1 {
    
    
    
    public static boolean checkisPowerof(int a,int b){
        if(a==b) return true;
        else return false;
    }

    public static void main(String[] args) {
        
        int a=8;
        for(int i=0;i<a;i++){
            int b=1<<i;
            boolean result=checkisPowerof(a, b);
            if(result) {
                System.out.println("power of 2");
                break;
            };
            System.out.println(~4);
        }
        
       
    }
}
