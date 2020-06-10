import java.util.Scanner;

public class VowelCon
{
    //created class to find out number is vowel or consonant

    public static void main (String[]args){//main method
        System.out.println("Enter any alphabet");//printing statement asking user to input any alphabet
        Scanner scanner= new Scanner(System.in);//created object to store user's input
        char ch = scanner.next().charAt(0);//storing user's input

        switch (ch){//using switch statement to check the number is vowel or consonant
            case 'a'://when user input 'a'
                System.out.println("The alphabet you entered is Vowel");//printing statement the number you have entered is vowel
                break;
            case 'e'://when user input 'e'
                System.out.println("The alphabet you entered is Vowel");//printing statement the number you have entered is vowel
                break;
            case 'i'://when user input 'i'
                System.out.println("The alphabet you entered is Vowel");//printing statement the number you have entered is vowel
                break;
            case 'o'://when user input 'o'
                System.out.println("The alphabet you entered is Vowel");//printing statement the number you have entered is vowel
                break;
            case 'u'://when user input 'u'
                System.out.println("The alphabet you entered is Vowel");//printing statement the number you have entered is vowel
            default :
                System.out.println("The alphabet you entered is consonant");//printing statement the number you have entered is consonantH



        }

    }
}
