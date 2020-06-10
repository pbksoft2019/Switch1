import java.util.Scanner;

public class PositiveNegative
{
    //main method
    public static void main(String[] args) {
        //created object to store user's input
        Scanner scanner = new Scanner(System.in);
        //print statement asking user to input any number
        System.out.println("Enter any number");
        //storing user's input
        int number = scanner.nextInt();
        //using in build method to store user's input
        int sigNum = Long.signum((long) number);
//using switch statement to find out the number user have input is positive ,negative or zero
        switch (sigNum) {
            //if user input any - number
            case -1:
                //printing statement the number is negative
                System.out.println("The number you have entered is negative ");
                break;
            //if user input any + number
            case 1:
                //printing statement the number is positive
                System.out.println("the number you have entered is positive ");
                break;
            //if anything else
            default:
                //printing statement the number is zero
                System.out.println("The number you have entered is zero");


        }

    }
}
