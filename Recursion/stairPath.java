
import java.util.ArrayList;
import java.util.Scanner;
//maximum jump 3
public class stairPath {
    public static ArrayList<String>generatePath(int n){
           
        if(n==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String>bres=new ArrayList<>();
            return bres;
        }

        ArrayList<String>Path1=generatePath(n-1);
        ArrayList<String>Path2=generatePath(n-2);
        ArrayList<String>Path3=generatePath(n-3);
        ArrayList<String>myres=new ArrayList<>();
        for(String path:Path1){
            myres.add(1+path);
        }
        for(String path:Path2){
            myres.add(2+path);
        }
        for(String path:Path3){
            myres.add(3+path);
        }
        return myres;
    }



    public static void main(String[] args){

        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the current stair");
        int n=sn.nextInt();
        ArrayList<String>path=generatePath(n);
        System.out.println(path);

    }
}
