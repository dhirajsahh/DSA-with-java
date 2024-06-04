import java.util.Scanner;

public class level {
    public static boolean isPalindrome(String st){
        int i=0;
        int j=st.length()-1;
        while(i<=j){
          char c1=st.charAt(i);
          char c2=st.charAt(j);
          if(c1==c2){
            i++;
            j--;
          }
          else{
            return false;
          }
        }
        return true;
      }

public static void main(String [] args){
  String s="racecar";
   Scanner scn=new Scanner(System.in);
   //String s1=scn.nextLine();
  // String s2=scn.nextLine();
  // System.out.println(s1+s2);
   int len=s.length();
   //System.out.println(len);
   //String ch=s.substring(1);
   //System.out.println(ch);
//    for(int i=0;i<len;i++){
//     String st=s.substring(i);
//     System.out.println(st);
//    }
  
   for(int i=0;i<len;i++){
    for(int j=i+1;j<=len;j++){
        String st=s.substring(i, j);
        if(isPalindrome(st)==true){
            System.out.println(st);
        }
    }
   }

     
}

}