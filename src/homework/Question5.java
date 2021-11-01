package homework;
/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question5 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("BMW");
        set.add("Audi");
        set.add("Skoda");
        set.add("Seat");
        set.add("VW");


        Iterator i = set.iterator();

        while (i.hasNext()) {

            System.out.println(i.next());
        }

    }
}