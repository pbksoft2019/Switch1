import java.util.Scanner;

public class CityName
{
    //created class to find out city name by alphabet
    public static void main (String[]args){//main method
        Scanner scanner = new Scanner(System.in);//created object to store user's input
        System.out.println("Enter any alphabet from a to f");//printing statement asking user to enter any alphabet from a to f
        char city = scanner.next().charAt(0);//storing user's input

        switch (city){//using switch statement
            case 'a' :
                System.out.println(city + "= America");
                break;
            case'b' :
                System.out.println(city + "= Bangladesh");
                break;
            case 'c' :
                System.out.println(city + "= china");
                break;
            case 'd' :
                System.out.println(city + "= Denmark ");
                break;
            case 'e' :
                System.out.println(city + "= egypt");
                break;
            case'f' :
                System.out.println(city + "= France");
                break;
            default:
                System.out.println("You have entered invalid entry");
        }


    }
}
