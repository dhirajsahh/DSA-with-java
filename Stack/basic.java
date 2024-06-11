
import java.util.Stack;

public class basic {
    public static void pushAtbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static String reverseString(String str){
          
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            s.push(ch);
        }
        StringBuilder st=new StringBuilder();
        while(!s.empty()){
           char ch=s.pop();
           st.append(ch);
        }
     return st.toString();

    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtbottom(s, top);

    }
             
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(6);
        s.push(9);
       // pushAtbottom(s, 4);
        
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }
        String ans=reverseString("ram");
        //System.out.println(ans);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
