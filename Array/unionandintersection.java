import java.util.ArrayList;

public class unionandintersection {
    public static ArrayList<Integer> unionOfArray(int arr1[],int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
       // int arr1[]={1,1,2,3,4,5};
        //int arr2[]={2,3,4,4,5,6};
        while(i<m&&j<n){          
            if(arr1[i]<arr2[j]){
             if(!list.contains(arr1[i])){
                list.add(arr1[i]);
               i++;
             }else {
                i++;
             }
            }else {
              if(!list.contains(arr2[j])){
                list.add(arr2[j]);
                j++;
              }else {
                j++;
              }
            }
        }
        if(i<m){
            while(i<m){
                list.add(arr1[i]);
                i++;
            }
        }else if(j<n){
            while(j<n){
                list.add(arr2[j]);
                j++;
            }
        }
        
        return list;
    }
    public static ArrayList<Integer>intersectionOfArray(int arr1[],int arr2[]){
        ArrayList<Integer>list=new ArrayList<>();
        int m=arr1.length;
        int n=arr2.length;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if (arr1[i]==arr2[j]) {
                if(!list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }else j++;
        }
        return list;
    }
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,4,5};
        int arr2[]={2,3,4,4,5,6,7};
       ArrayList<Integer> union=unionOfArray(arr1,arr2);
       System.out.println(union);
       ArrayList<Integer> intersection=intersectionOfArray(arr1,arr2);
       System.out.println(intersection);
        
    }
}
