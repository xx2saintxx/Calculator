/**
 * This is a very basic Calculator Class. It only takes in two inputs and can only do the 4 arithmetic operations.
 * @Author Toussaint Turnier
 * @Date 7/23/2019
 */
import java.util.Scanner; // For user input

public class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //Take in user input
        int select, firstinput, secondinput, answer; // Selector, Variables, Result

        System.out.println("Select Operation \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division"); // Menu
        select = input.nextInt(); // Menu selector

        if (select == 1) { // if is 1, do Addition
            System.out.println("Enter First Number");
            firstinput = input.nextInt();
            System.out.println("Enter Second Number");
            secondinput = input.nextInt();
            answer = firstinput + secondinput;
            System.out.println(answer);
        }
        if (select == 2) { // if is 2 do Subtraction
            System.out.println("Enter First Number");
            firstinput = input.nextInt();
            System.out.println("Enter Second Number");
            secondinput = input.nextInt();
            answer = firstinput - secondinput;
            System.out.println(answer);
        }
        if (select == 3) { // if is 3 do Multiplication
            System.out.println("Enter First Number");
            firstinput = input.nextInt();
            System.out.println("Enter Second Number");
            secondinput = input.nextInt();
            answer = firstinput * secondinput;
            System.out.println(answer);
        }
        if (select == 4) { // if is 4 do Division
            System.out.println("Enter First Number");
            firstinput = input.nextInt();
            System.out.println("Enter Second Number");
            secondinput = input.nextInt();
            answer = firstinput / secondinput;
            System.out.println(answer);
        }
    }
}// End of Calculator class
