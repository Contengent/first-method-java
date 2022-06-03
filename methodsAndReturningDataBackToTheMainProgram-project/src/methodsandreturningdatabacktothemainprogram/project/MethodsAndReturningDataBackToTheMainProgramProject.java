/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */

package methodsandreturningdatabacktothemainprogram.project;
import java.math.BigInteger;
import java.util.Scanner;

public class MethodsAndReturningDataBackToTheMainProgramProject {
    public static void main(String[] args) {
        
        int choice;
        int number = 0;
        
        do{
            mainMenu();
            choice = acceptInput();
            number = choiceFilter(choice, number);
            calculatorSwitch(choice, number);
            
        } while (true);
        
    }
    
    public static int acceptInput(){
        Scanner stringInput = new Scanner(System.in);
        int output;
        
        output = stringInput.nextInt();
        return output;
    }

    private static void mainMenu(){
        print("What would you like to do?:");
        print("[1] calculate the factorial of a number ");
        print("[2] calculate if a number is prime");
        print("[0] exit");
    }
    
    private static void factorialAndOut(int input) {
        BigInteger fact = new BigInteger("1");
        
        for (int i = 1; i <= input; i = i + 1) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        
        System.out.println(fact);
    }
    
    private static void primeAndOut(int input) {
        long num = input;
        boolean isPrime = true;
        
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            print(num + " is a prime number.\n");
        } else{
            print(num + " is not a prime number.\n");
        }
    }
    
    private static void calculatorSwitch(int userChoice, int userNumber){
        switch (userChoice) {
            case 1:
                factorialAndOut(userNumber);
                break;
            case 2:
                primeAndOut(userNumber);
                break;
            case 0:
                print("exiting...");
                System.exit(0);
            default:
                print("Error: Invalid 'choice' input.");
                break;
        }
    }
    
    public static int choiceFilter(int userChoice, int userNumber){
        if (userChoice <= 2 && userChoice > 0){
            print("\nYou have selected " + userChoice + ".");
            print("Please enter a number to use: ");
            userNumber = acceptInput();
        }
        return userNumber;
    }
    
    private static void print(String toPrint){
        System.out.println(toPrint);
    }
}

