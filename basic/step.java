public class step {
    public static int numSteps(String s) {
        int value=Integer.valueOf(s);
        System.out.println(value);
        int decimalvalue=0;
        int power=0;
        int step=0;
        if(value==1) return 0;
        while(value!=0){
         int rem=value%10;
         decimalvalue+=rem*Math.pow(2,power);
         power++;
         value=value/10;
        } 
        System.out.println(decimalvalue);
        while(decimalvalue!=1){
         if(decimalvalue%2==0){
           decimalvalue=decimalvalue/2;
             step++;
             
         }
         else {
            decimalvalue=decimalvalue+1;
             step++;
         }
        }
        return step;
     }
     public static void main(String[] args) {
        int n=numSteps("1101");
        System.out.println(n);

     }
}
