import java.util.ArrayList;
import java.util.Scanner;



public class keypad {
       static ArrayList<String> kpc(String str){
    if(str.length()==0){
        ArrayList<String>bstr=new ArrayList<>();
        bstr.add("");
        return bstr;
    }
    char ch=str.charAt(0);
    System.out.println(ch);
    String ros=str.substring(1);
    ArrayList<String>rres=kpc(ros);
    ArrayList<String>mres=new ArrayList<>();
    String codesforch=codes[ch-'0'];
    System.out.println(codesforch);
    for(int i=0;i<codesforch.length();i++){
        char chcode=codesforch.charAt(i);
        for(String rstr:rres){
            mres.add(chcode+rstr);
        }
    }
    return mres;
   }

    //keypad combination
   
    static String[]codes={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String [] args){
       Scanner sn=new Scanner(System.in);
       String str=sn.nextLine();
       ArrayList<String>res=new ArrayList<>();
       res=kpc(str);
       System.out.println(res);

    }
}
