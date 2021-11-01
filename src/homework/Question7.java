package homework;
/**
 * 7. Write a Java program to test an array list is empty or not. Define array list with
 * underground tube names
 */

import java.util.ArrayList;

public class Question7 {


    public static void main(String[] args) {


        ArrayList<String> s = new ArrayList<>();

        s.add("Jubliee line");
        s.add("Bakerloo line");
        s.add("District line");

        boolean a = true;
        // this if condition will be true if arraylist is empty
        if (!(a != s.isEmpty())) {
            System.out.println("is array list empty");
        } else {
            for (int i = 0; i < s.size(); i++) {
                System.out.println(s.get(i));
            }
        }
    }
}