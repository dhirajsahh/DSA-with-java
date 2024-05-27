
public class basic {

    static void printNaturalNumber(int n){
        if(n==0) return;
        printNaturalNumber(n-1);
        System.out.println(n);
    }
    static int sumofnaturalNumber(int n){
        if(n==1) return 1;
        int sum=sumofnaturalNumber(n-1)+n;
        return sum;
    }
    static int pow(int a,int b){
        if(b==0) return 1;
        int ans=pow(a,b-1)*a;
        return ans;
    }
   

    public static void main(String[] args) {
      // printNaturalNumber(5);
       //System.out.println(sumofnaturalNumber(15));
       System.out.println(pow(4,3));
    }
}
