import java.util.Stack;

public class level2 {
    //next Greater element on the right
    public static int []nextGreater(int []arr){
     int []result=new int[arr.length];
     Stack<Integer>s=new Stack<>();

     for(int i=arr.length-1;i>=0;i--){
        while(!s.empty()&&arr[s.peek()]<=arr[i]){
            s.pop();
        }
        if(s.isEmpty()) result[i]=-1;
        else {
            result[i]=arr[s.peek()];
        }
        s.push(i);
     }
     return result;
   } 

  // stock span
      public static int[] stockSpan(int []price){
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        int []ans=new int[price.length];
        ans[0]=1;
        for(int i=1;i<price.length;i++){
            while(!stack.isEmpty()&&price[stack.peek()]<price[i]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]=i+1;
            else {
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
         return ans;
      }

    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int []ans=nextGreater(arr);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }
        int []price={100,80,60,70,60,85,100,120};
        int[]price1={2,5,9,3,1,12,6,8,7};
        int []spanresult=stockSpan(price);
        for(int i=0;i<spanresult.length;i++){
            System.out.print(spanresult[i]+" ");
        }
        
    }
}
