import java.util.Scanner;

public class DetectKeyPress
{
    // main method
    public static void main(String[] args) {
        //created scanner object get input from user
        Scanner scanner = new Scanner(System.in);
        //print statement asking user to press any number from 0 to 9
        System.out.println("Press any number key (from 0 to 9) :");
        //storing user's input
        int numberKey = scanner.nextInt();

        int result;

//Switch expression
        switch (numberKey) {
            //case statements
            case 0 :
                //print statement for result
                System.out.println("you have press number '0' key");
                //code to be executed
                break;
            case 1 :
                //print statement for result
                System.out.println("you have press number '1' key ");
                //code to be executed
                break;
            case 2 :
                //print statement for result
                System.out.println("You have press number '2' key");
                //code to be executed
                break;
            case 3 :
                //print statement for result
                System.out.println("you have press number '3' key");
                //code to be executed
                break;
            case 4 :
                //print statement for result
                System.out.println("you have press number '4' key");
                //code to be executed
                break;
            case 5 :
                //print statement for result
                System.out.println("you have press number '5' key");
                //code to be executed
                break;
            case 6 :
                //print statement for result
                System.out.println("you have press number '6' key");
                //code to be executed
                break;
            case 7 :
                //print statement for result
                System.out.println("you have press number '7' key");
                //code to be executed
                break;
            case 8 :
                //print statement for result
                System.out.println("you have press number '8' key");
                //code to be executed
                break;
            case 9 :
                //print statement for result
                System.out.println("you have press number '9' key");
                //code to be executed
                break;
            //default case statement
            default:
                //print statement for result
                System.out.println( "The number you have press is not allowed");




        }

    }
}
