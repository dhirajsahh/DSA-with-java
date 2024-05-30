
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
    //Displaying array using recursion
    static void displayarray(int arr[],int n){
       
        
        if(n==0){
            return ;
        }
        System.out.println(arr[n-1]);
        displayarray(arr,n-1);

    }

    public static void main(String[] args) {
      // printNaturalNumber(5);
       //System.out.println(sumofnaturalNumber(15));
       //System.out.println(pow(4,3));
       int arr[]={1,2,4,5,6};
       int n=5;
       displayarray(arr,n);
    }
}
