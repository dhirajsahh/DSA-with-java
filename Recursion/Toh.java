public class Toh {

    public static void generateToh(int n,String src,String helper,String destination){

        if(n==0){
          return ;
        }
        generateToh(n-1, src,destination,helper);
        System.out.println("Move "+n+" disk " +src+"->"+destination);
        generateToh(n-1,helper,src,destination);

    }
    
    public static void main(String[] args){
        generateToh(4, "A", "B", "C");
        
     


    }

}
