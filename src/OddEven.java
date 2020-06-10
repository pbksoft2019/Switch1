import java.util.Scanner;

public class OddEven
{
    //created class to find out the number is odd or even
    public static void main (String[]args){//main method

        System.out.println("Enter any number :");//Reading a number from user
        Scanner scanner = new Scanner(System.in);//created object to store user's input
        int number = scanner.nextInt();//storing user's input
        switch (number % 2){//using switch statement to find out the number is odd or evan

            case 0 : //if number%2 ==0
                System.out.println("Number is even");//printing statement the number is even
                break;
            case 1 ://if number%2 ==1
                System.out.println("Number is odd");//printing statement the number is odd
                break;

        }
    }
}
