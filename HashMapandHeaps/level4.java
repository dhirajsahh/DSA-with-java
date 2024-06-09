import java.util.HashMap;
public class level4 {

    public static void itineraryFromTickets(HashMap<String, String> map1){
        HashMap<String, String> map2 = new HashMap<>();
        for(String str:map1.keySet()){
            map2.put(map1.get(str),str);
        }
        String strpoint="";
        for(String str:map1.keySet()){
            if(map1.containsKey(str)!=map2.containsKey(str)){
                strpoint=str;
                break;
            }
        }
        System.out.print(strpoint);
        for(String str:map1.keySet()){
            System.out.print("->"+map1.get(strpoint));
            strpoint=map1.get(strpoint);
        }
    }
 
    public static void main(String []args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        itineraryFromTickets(map);

    }
}


