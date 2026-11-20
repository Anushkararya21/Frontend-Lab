import java.util.*;
public class basic {
    public static void main(String[] args) {
        // country(key) and population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        System.out.println(map); //it gives output in random order

        map.put("India", 130); //it will update the value of India
        System.out.println(map);

        //Search
        if(map.containsKey("India")){
            System.out.println("key is present in map");
        }
        else{
            System.out.println("key is not present in map");
        }

        System.out.println(map.get("India")); //key exists , return value  
        System.out.println(map.get("Uganda")); //key does not exist , return null 

        //for(int val:arr)
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }     
    }
}