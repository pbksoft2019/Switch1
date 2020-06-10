import java.util.Scanner;

public class GreatestLargestNumber
{
    //main method
    public static void main(String[] args) {
        //created object to store user's input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");//print statement asking user input first number
        int num1 = scanner.nextInt();//storing user's input
        System.out.println("Enter second number");//print statement asking user input second number
        int num2 = scanner.nextInt();//storing user's input
        System.out.println("Enter third number");//print statement asking user input third number
        int num3 = scanner.nextInt();//storing user's input
//using if else statement to get the result
        if (num1 > num2 && num1 > num3)//if num1 is bigger then number num2 and num1 is bigger then num3
        {
            System.out.println("Largest number is . " + num1);//printing result largest number is num1
        } else if (num2 > num3)//if num2 is bigger then num3
        {
            System.out.println("Largest number is . " + num2);//printing result largest number is num2
        } else//else num3 is bigger
        {
            System.out.println("largest number is . " + num3);//printing result largest number is num3
        }
    }
}
