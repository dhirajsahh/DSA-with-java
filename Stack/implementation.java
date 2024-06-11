

import java.util.ArrayList;

public class implementation {
    
    static class Stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public static boolean isEmpty(){
           return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
           int data=list.get(list.size()-1);
           list.remove(list.size()-1);
           return data;
        }
        public static int peek(){
            int data=list.get(list.size()-1);
            return data;
         }
         
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
