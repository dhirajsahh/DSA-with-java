import java.util.Stack;

public class largestArea {
    
     public static int maximumAreainHistogram(int []height){
        int []nls=new int [height.length];
        int []nrs=new int [height.length];
        Stack<Integer>stack=new Stack<>();
        // nls[0]=-1;
        // stack.push(0);
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty()&&height[stack.peek()]>=height[i]){
                 stack.pop();
            }
            if(stack.isEmpty()) nls[i]=-1;
            else {
                nls[i]=stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=height.length-1;i>=0;i--){
            while(!stack.isEmpty()&&height[stack.peek()]>=height[i]){
                stack.pop();
            }
            if(stack.isEmpty()) nrs[i]=height.length;
            else {
                nrs[i]=stack.peek();
            }
            stack.push(i);
        }
        int maxArea=0;
        for(int i=0;i<height.length;i++){
            int h=height[i];
            int b=nrs[i]-nls[i]-1;
            int area=b*h;
            maxArea=Math.max(maxArea,area);
        }
      return maxArea;

     }
     public static void print(int []arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
    public static void main(String[] args) {
        int[]arr={2,1,5,6,2,3};
        int []arr2={2,4};
        int area=maximumAreainHistogram(arr2);
        System.out.println(area);
    }
}
