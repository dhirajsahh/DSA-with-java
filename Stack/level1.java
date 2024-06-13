
import java.util.Stack;

public class level1 {
     //Duplicate brackets
    public static boolean DuplicateBrackets(String str){

        Stack<Character>s=new Stack<>();
        int i=-1;
        while(i<str.length()-1){
            i++;
            char ch=str.charAt(i);
            if(ch!=')'){
                s.push(ch);
            } 
            else {
                if(s.peek()=='(') return false;
                else {
                    while(s.peek()!='('){
                        s.pop();
                    }
                }
                s.pop();
            }
        }
        return true;
    }
    public static boolean isValid(String s){
  // valid parentheses
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) return false;
                else {
                    if((stack.peek()=='('&&ch==')')||(stack.peek()=='{'&&ch=='}')||(stack.peek()=='['&&ch==']')){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        String s="((a+b)+(c+d))";
        String st="(a+b)+((c+d))";
        boolean result=DuplicateBrackets(st);
        System.out.println(result);
        System.out.println(isValid("()[]{}"));
    }
}
