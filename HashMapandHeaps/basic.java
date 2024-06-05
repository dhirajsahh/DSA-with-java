
import java.util.HashMap;

public class basic {
    
      public static char mostfrequencychar(String s){

        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
               int val=hm.get(ch);
               
               hm.put(ch,val+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        char mfc=s.charAt(0);
        for(char key:hm.keySet()){
            if(hm.get(key)>hm.get(mfc)){
                mfc=key;
            }
        }
        return mfc;
      }

    public static void main(String [] args){

        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("nepal", 200);
        hm.put("us", 2000);
        hm.put("india", 100);
        hm.put("nepal", 50);
       // System.out.println(hm);
       // System.out.println(hm.get("nepal"));
        //System.out.println(hm.containsKey("india"));

        // for(String st:hm.keySet()){
        //     int val=hm.get(st);
        //     System.out.println(val+st);
        // }
        String s="abbcdaafe";
        char ch=mostfrequencychar(s);
        System.out.println(ch);
    }
   
}
