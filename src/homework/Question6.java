package homework;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Question6 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        int i = 3;

        System.out.println("value at index "+i+" = " +a.get(3));

    }

}
