package homework;
/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Question4 {

    public static void main(String[] args) {


        ArrayList<String> colour = new ArrayList<>();



        colour.add("White");
        colour.add("Black");
        colour.add("Red");
        colour.add("Orange");
        colour.add("Brown");

        //for loop to print arraylist
        for (int i = 0; i < colour.size(); i++) {
            System.out.println(colour.get(i));
        }

    }

}
