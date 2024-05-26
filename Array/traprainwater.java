public class traprainwater {
    
    static int Amountofwater(int heights[]){
        int n=heights.length;
        int sum=0;
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        while (left<right) {
            if(heights[left]<=heights[right]){
                if(heights[left]>leftmax) leftmax=heights[left];
                else {
                    sum+=leftmax-heights[left];
                }
                left++;
            } 
            else{
                if(heights[right]>rightmax) rightmax=heights[right];
                else{
                    sum+=rightmax-heights[right];
                }
                right--;
            }
        }
        return sum;
        
    }

    

    public static void main(String[] args) {
        int []arr={4,2,0,3,2,5};
        int trapwater=Amountofwater(arr);
        System.out.println(trapwater);

    }
}
