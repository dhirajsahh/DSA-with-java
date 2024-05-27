public class path {
    // number of path in n*m matrix
        public static int numberofpath(int row,int col){
            if(row==1 || col==1) return 1;
            int rightpath=numberofpath(row, col-1);
            int downpath=numberofpath(row-1, col);
            int totalpath=rightpath+downpath;
            return totalpath;
        }



    public static void main(String[] args) {
         int n=2;
         int m=3;
         int ans=numberofpath(n, m);
         System.out.println(ans);
      }
}
