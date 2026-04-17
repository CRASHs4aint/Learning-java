package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Baisc {
    static void main(String[] args) {
        //syntax
        HashMap<String, Integer> mp = new HashMap<>();
        //adding element
        mp.put("samrat", 22);
        mp.put("akash", 21);
        mp.put("parinda", 24);
        mp.put("alisn", 20);


        //getting value of a key from hashmap

        System.out.println(mp.get("samrat"));//22
        System.out.println(mp.get("rohit"));//null


        //changing /upadting value of a key in the hasmap

        mp.put("akash", 25); //insertion and updating
        System.out.println(mp.get("akash")); //25

        //removing the pair from the hashmap
        System.out.println(mp.remove("akash"));
        System.out.println(mp.remove("riya"));

        //checking if a key is in the hashmap
        System.out.println(mp.containsKey("akash"));

        //Adding a new entery only if the new key dosen't exist already
        mp.putIfAbsent("alina", 25);//will enter
        mp.putIfAbsent("alina", 25);//will not enter

        //get all key in the hashmap
        System.out.println(mp.keySet());

        //get all the value in the hashmap
        System.out.println(mp.values());

        //get all entries
        System.out.println(mp.entrySet());


        //Traversing all enteries of hashmap -multiple methods
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d \n", key, mp.get(key));
        }
        System.out.println();


        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
        }

        System.out.println();
        for (var e : mp.entrySet()) {
            System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
        }
    }
}
