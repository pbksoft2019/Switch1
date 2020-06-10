import java.util.Scanner;

public class DayOfWeek {
    //created class to find out day's of the week
    public static void main(String[] args) {//main method

        System.out.println( "Enter any number between 1 to 7 :" );//printing statement asking user to enter any number between 1 to 7
        Scanner scanner = new Scanner( System.in );//created object to store user's input
        int number = scanner.nextInt();//storing user's input
        switch (number) {//using switch statement to find out the number user have input is which day of the week
            case 1:
                System.out.println( "Sunday" );
                break;
            case 2:
                System.out.println( "Monday" );
                break;
            case 3:
                System.out.println( "Tuesday" );
                break;
            case 4:
                System.out.println( "Wednesday" );
                break;
            case 5:
                System.out.println( "Thursday" );
                break;
            case 6:
                System.out.println( "Friday" );
                break;
            case 7:
                System.out.println( "Saturday" );
                break;
            default:
                System.out.println( "The number you have entered is invalid choice" );

        }

    }
}