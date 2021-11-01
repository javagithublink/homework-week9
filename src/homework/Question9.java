package homework;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Question9 {


    public static void main(String[] args) {


        Map<String, Integer> people = new HashMap<>();

        people.put("Jimil",1);
        people.put("Mehul",2);
        people.put("Chetan",3);
        people.put("Kinjal",4);
        people.put("Dhara",5);
        people.put("Shama",6);


         // getKey() and getValue() methods to print names and associated numbers
        for(Map.Entry<String, Integer > names: people.entrySet()){
            System.out.println(names.getKey()+", "+names.getValue());
        }



    }

}
