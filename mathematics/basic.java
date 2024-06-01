public class basic {
    
      public static int GCD(int a,int b){
        if(a%b==0) return b;
        if(a<b) return GCD(b,a);
        int result=GCD(a%b,b);
        return result;
      }
      //Trailing zero in fact
      public static int trailingZero(int n){
         int result=0;
        while(n>0){
           result+=n/5;
           n=n/5;
        }
        return result;
      }



    public static void main(String [] args){

        int a=5;
        int b=3;
        int result=GCD(a,b);
        System.out.println(result);
        System.out.println("The lcm of tho number is");
        System.out.println((a*b)/result);
        System.out.println("The number of trailing zero is "+trailingZero(125));
    }
}
