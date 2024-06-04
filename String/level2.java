public class level2 {


    public static void compression(String s){
        String st=s.charAt(0)+"";
        for(int i=1;i<s.length();i++){
            char cur=s.charAt(i);
            char prev=s.charAt(i-1);
            if(cur!=prev){
                st+=cur;
            }

        }
        System.out.println(st);
    }
    public static void compression2(String s){
        int count=1;
        String st=s.charAt(0)+"";
        for(int i=1;i<s.length();i++){
            char cur=s.charAt(i);
            char prev=s.charAt(i-1);
            if(cur==prev){
                count++;
            }
            else{
                if(count>1){
                    st+=count;
                count=1;
                }
                st+=cur;
            }
        }
        if(count>1){
            st+=count;
        count=1;
        }
        System.out.println(st);
        
    }
    

    public static void main(String[] args){

        String s="aaabbccddaeef";
        compression(s);
        compression2(s);

    }
}
