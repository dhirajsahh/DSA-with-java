
public class Numbersystem {
    
    static double decimaltoOther(int n,int target){
        double convertedNumber=0;
        double power=0;
        while(n!=0){
            int rem=n%target;
            convertedNumber=convertedNumber+rem*Math.pow(10,power);
            power++;
            n=n/target;
        }
        return convertedNumber;

    }
    static double binarytodecimal(int n,int target){
        double convertedNumber=0;
        double power=0;
        while(n!=0){
            int rem=n%target;
            convertedNumber=convertedNumber+rem*Math.pow(2,power);
            power++;
            n=n/target;
        }
        return convertedNumber;

    }
   
   

    public static void main(String[] args) {
        int n = 1266;
        int targetbase = 8;
        double requiredNumber=decimaltoOther(n,targetbase);
        System.out.println(requiredNumber);
      

    }



}
