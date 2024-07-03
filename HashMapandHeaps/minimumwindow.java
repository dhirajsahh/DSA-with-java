import java.util.HashMap;
import java.util.HashSet;


public class minimumwindow {
    // minimum window substring

    public static String minimumWindowSubstring(String s,String t){

        String ans="";
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>map1=new HashMap<>();
        int mct=0;
        int dmct=t.length();
        int i=-1;
        int j=-1;
        while(true){
                boolean f1=false;
                boolean f2=false;
            while(i<s.length()-1&&mct<dmct){
                 i++;
                 char ch=s.charAt(i);
                 map1.put(ch, map1.getOrDefault(ch,0)+1);
                 if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch, 0)){
                    mct++;
                 }
                 f1=true;
            }
            while(j<i&&mct==dmct){
               String pans=s.substring(j+1, i+1);
               if(ans.length()==0||pans.length()<ans.length()){
                ans=pans;
               }
               j++;
               char ch=s.charAt(j);
               int tfr=map1.get(ch);
               if(tfr==1) map1.remove(ch);
                else map1.put(ch,tfr-1);
                if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                    mct--;
                }
                f2=true;
            }
            if(f1==false&&f2==false) break;
        }
        

        return ans;
    }
     
    //smallest substring of a string containing all unique character of itself
     
    public static String uniqueCharacter(String s1){
          HashSet<Character>set=new HashSet<>();
          for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            set.add(ch);
          }
          //
        

    }
    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";
        String result = minimumWindowSubstring(s1, s2);
        System.out.println(result);
        String ans=uniqueCharacter(s1);

    }
}
