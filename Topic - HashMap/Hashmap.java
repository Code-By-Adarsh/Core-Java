//import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
public class Hashmap {
    public static void main(String[] args) {
        /*
        HashMap is like dictionary in python in which there is key and their value present.
        In which key is always unique and value may be same.
        For Ex: Fuel    Price
                CNG      $70
                LPG      $50
                Petrol   $110
                Diesel   $70
         */

        //Country(key) -- Population(value):
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion:
        map.put("India",100);
        map.put("USA",50);
        map.put("China",110);
        //If key exist-->update and if key does not exist-->doesn't update.

        //Search:
        System.out.println(map.containsKey("India")); //key exist return true.
        System.out.println(map.containsKey("Brazil")); //key doesn't exist return false.

        //get:
        System.out.println(map.get("USA"));  //key exist return value.
        System.out.println(map.get("Nepal"));  //key not exist return null.

        //Iterator:
        //for(Map.Entry<String, Integer> e: map.entrySet())
        for(Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove:
        System.out.println(map.remove("China")); //key exist return value.
        System.out.println(map.remove("England")); //key doesn't exist return null.
        System.out.println(map);
    }
}
