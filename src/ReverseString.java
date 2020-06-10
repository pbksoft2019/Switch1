import java.util.Scanner;

public class ReverseString
{
    //created class to reverse string
    public static void main (String[]args) {//main method
        System.out.println( "Enter a String" );//printing statement asking user to enter a string
        Scanner scanner = new Scanner( System.in );//created object to store user's input
        String str = scanner.nextLine();//storing user's input
        StringBuilder str1 = new StringBuilder();//using in build method to revers a string
        str1.append( str );
        str1 = str1.reverse();//

        System.out.println( "result of reverse string will be " + str1 );
    }
}
