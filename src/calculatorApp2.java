import java.util.Scanner;
public class calculatorApp2{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Good day, please enter your name");

        String name = sc .nextLine();

        System.out.println("Welcome" + " " + name);

        int choice;

        int firstNumber = 0, secondNumber = 0;

            System.out.println("Please select the operation you want to perform");

            System.out.println("1. Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Division");
            System.out.println("4.Multiplication");
            System.out.println("5.Remainder");
            System.out.println("6.Quit");

            System.out.println("Enter your choice (1-6)");

            choice = sc.nextInt();

            if(choice == 6 ){

                System.out.println("Goodbye!" + name );

                System.exit(0);

            } else if (choice >= 1 && choice <= 5) {

                    System.out.println("Enter first number :");

                    firstNumber = sc.nextInt();

                    System.out.println("Enter second number :");

                    secondNumber = sc.nextInt();
            } else {
                System.out.println("Error : Invalid input,try to select another choice");
            }

            switch (choice) {
                case 1:
                    System.out.println("Result:" + (firstNumber + secondNumber));
                    break;

                case 2:
                    System.out.println("Result:" + (firstNumber - secondNumber));
                    break;

                case 3:
                    if (secondNumber != 0) {
                        System.out.println("Result:" + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Error : Division by zero!,input a valid second number");
                    }
                    break;

                case 4:
                    System.out.println("Result:" + (firstNumber * secondNumber));
                    break;
                case 5:
                    if (secondNumber != 0) {
                        System.out.println("Result:" + (firstNumber % secondNumber));
                    } else {
                        System.out.println("Error : Division by zero!");
                    }
                    break;


            }





    }
}
