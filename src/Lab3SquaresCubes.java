//*****Jayme Peoples developed this on 6/28/17 ****
import java.util.Scanner;

public class Lab3SquaresCubes {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = 1;
        String num = "";
        String userChoice = "y";

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.print("Please enter an integer: ");
            userNum = scnr.nextInt();

            System.out.println("Number\t\t" + "Squared\t\t" + " Cubed");
            System.out.println("=======\t\t" + "========\t" + "=======");
            for (int i = 0; i <= userNum; ++i) {//will increase userNum by 1
                int numSq = (int) (Math.pow(i, 2));//Math pow class i = num 2 = squared
                int numCu = (int) (Math.pow(i, 3));//Math pow class i = num 3 = cubed
                num = i + "\t\t\t\t" + numSq + "\t\t\t" + numCu; //\t is a preset tab
                System.out.println(num);
            }

            System.out.println("Continue? (y/n)");
            userChoice = scnr.next();
        }
        System.out.println("Have a great day!");
    }
}


