public class subset {
  
     public static void GenerateSubstring(String s){
        utilsGeneratesubString(s,0,"");
     }
     static void utilsGeneratesubString(String s,int i,String cur){
        
        if(i==s.length()){
            System.out.println(cur);
            return ;
        }
        utilsGeneratesubString(s, i+1, cur);
        utilsGeneratesubString(s, i+1, cur+s.charAt(i));

     }
       


    public static void main(String[] args){
        String str="abcd";
        GenerateSubstring(str);


    }


}