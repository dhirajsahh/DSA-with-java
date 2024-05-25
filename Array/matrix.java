public class matrix {
    static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
 
    }

    public static void transpose(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<a[i].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void rotateMatrix(int a[][]){
        transpose(a);
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }
        }
    }
    public static boolean search(int a[][],int target){
     int row=0;
     int col=a.length-1;
     int result=0;
     while(row<a.length&&col>=0){
          if(a[row][col]==target){
            System.out.print(row+" "+col);
            return true;
            
          }
          else if(target>a[row][col]){
            row++;
          }
          else{
            col--;
          }
          
         
     }
     return false;
             
    }



    public static void main(String[] args) {
        int [][]arr={
            {1,4,5,7},
            {2,5,6,9},
            {6,10,11,13},
            {8,12,15,19}
        };
        int target=14;
        // printMatrix(arr); 
        // rotateMatrix(arr);
        // printMatrix(arr); 
        boolean result=search(arr,target) ;
        System.out.println(result);   
     }
}
