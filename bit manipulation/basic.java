import java.util.ArrayList;
import java.util.Scanner;

public class basic {
    public static int numberofOnebits(int n){
        int count=0;
       
        while(n!=0){
            int rsmb=(n&-n);
            n=n-rsmb;
            count++;
        }
        return count;
    }

    public static int highof2(int n){
           int i=1;
        while(i*2<=n){
          i=i*2;
        }
        return i;
    }
    //Alternate kill 
    public static int lastRemaining(int n){
        int highpowerof2=highof2(n);
        int l=n-highpowerof2;
        int ans=2*l+1;
        return ans;
    }

    


    

    public static void main(String []args){
        int n;
          System.out.println("Enter the number");
          Scanner scn=new Scanner(System.in);
          n=scn.nextInt();
          System.out.println(lastRemaining(n));
          
         // System.out.println("The binary of the given number is"+Integer.toBinaryString(n));
         // int rmsb=(n&-n);
         // System.out.println("right most set bit is "+Integer.toBinaryString(rmsb));
         // System.out.println(numberofOnebits(128));


    }
}
