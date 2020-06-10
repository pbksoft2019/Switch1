import java.util.Scanner;

public class Calculator
{

    //main method
    public static void main(String[] args)
    {
        //variable
        double num1,num2;
        //scanner object created and will be used to get input from user
        Scanner scanner = new Scanner(System.in);
        //print statement asking user to enter first number
        System.out.println("Enter First number : ");
        //storing user's input
        num1 = scanner.nextDouble();
        //print statement asking user to enter second number
        System.out.println("Enter second number : ");
        //storing user's input
        num2 = scanner.nextDouble();
        //print statement asking user to enter an any operator
        System.out.println("Enter an operator (+, -, *, /): ");
        //storing user's input
        char operator = scanner.next().charAt(0);
        // double variable
        double result;

// using switch statement to calculate the two numbers
        switch (operator) {

//if user input + operator
            case '+':
                //printing result adding two numbers
                result = num1 + num2;
                break;
            //if user input - operator
            case '-':
                //printing result substrating two numbers
                result = num1 - num2;
                break;
            //if user input * operator
            case '*':
                //printing result times two numbers
                result = num1 * num2;
                break;
            //if user input / operator
            case '/':
                //printing result dividing two number
                result = num1 / num2;
                break;
            //if user input anythig else
            default:
                //printing statement invalid operator
                System.out.println("you have entered invalid operator");
                //asking user to return to next step
                return;

        }
//printing result user input = result
        System.out.println(num1+" "+operator+" "+num2+":  "+ result);
    }
}
