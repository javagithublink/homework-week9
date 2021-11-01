package homework.calculate;

import java.util.Scanner;
// Calculator class has been extended to Main class
public class Main extends Calculator {

    public static void main(String[] args) {

        int a,b;
        char choose;
        char c;

        // do while loop used, as it will run once anyway before checking if user wants to do more calculations
        do {
            // didn't close scanner as this loop needs to run again if user choose to do more calculations
            Scanner input1 = new Scanner(System.in);
            System.out.println("Choose '+' for Addition, '-' for Subtraction, '*' for Multiplication or '/' for Division");
            c = input1.nextLine().charAt(0);


            Scanner input = new Scanner(System.in);
            System.out.print("Enter First Number: ");
            a = input.nextInt();
            System.out.print("Enter Second Number: ");
            b = input.nextInt();
            // calculateResult method has been called from Calculator class using Main class object
            new Main().calculateResult(a,b,c);

            Scanner input2= new Scanner(System.in);
            System.out.print("Would you like to do more calculation Please enter “Y” or “N”: ");
            choose = input2.nextLine().charAt(0);

        // while loop condition will be checked after above scanner input

        }while(choose == 'Y' || choose == 'y');


    }


}
