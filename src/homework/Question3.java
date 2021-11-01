package homework;
/**
 * 3. Write a Java program to reverse an array of integer values.
 */

import java.util.ArrayList;

public class Question3 {

    public static void main(String[] args) {


    // Arraylist object declaration
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);


        System.out.print("Correct order :");
        // for loop to print arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();

        System.out.print("Reverse order :");
        //for loop to print reverse order of arraylist
        for (int j = list.size()-1; j > -1; j--) {
            System.out.print(list.get(j)+"\t");
        }

        }
    }


