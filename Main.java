package ControlFlowHW;

import java.util.Scanner;
import java.util.Random;

public class Main 
{
    public static void main(String[] args)
    {
        Random random = new Random();

        System.out.println("Numbers");
        AsciiChars.printNumbers();

        System.out.println("Uppercase letters");
        AsciiChars.printUpperCase();

        System.out.println("Lowercase letters");
        AsciiChars.printLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();

        System.out.println("Hello "+name);

        String prompt;
        System.out.print("Do you wish to continue: ");
        prompt = input.next();
        boolean yes = prompt.equals("y") || prompt.equals("yes") || prompt.equals("Yes");

        if(yes)
        {
            boolean playAgain = false;
            do
            {
                System.out.print("Do you have a red car? ");
                prompt = input.next();
                boolean redCar = prompt.equals("y") || prompt.equals("yes");

                System.out.print("What is the name of your favorite pet? ");
                String petName = input.next();

                System.out.print("What is the age of your favorite pet? ");
                int petAge = input.nextInt();

                System.out.print("What is your lucky number? ");
                int luckyNumber = input.nextInt();

                System.out.print("Do you have a favorite quarterback? ");
                prompt = input.next();
                boolean favoriteQBExists = prompt. equals("y") || prompt.equals("yes");
                int qbJersey = -1;

                if (favoriteQBExists)
                {
                    System.out.print("What is their jersey number? ");
                    qbJersey = input.nextInt();
                }

                System.out.print("What is the two digit model year of your car? ");
                int carYear = input.nextInt();

                System.out.print("What is the first name of your favorite actor or actress? ");
                String actorName = input.next();

                System.out.print("Enter a random number between 1 and 50: ");
                int userRandomNumber = input.nextInt();

                int generateRandomA = random.nextInt(100)+1;
                int generateRandomB = random.nextInt(100)+1;
                int generateRandomC = random.nextInt(100)+1;

                //Here, this code will generate some correct nunmbers.//
                int magicBall;
                if (favoriteQBExists)
                {
                    magicBall = generateRandomA * qbJersey;
                }
                else
                {
                    magicBall = generateRandomA * luckyNumber;
                }
                while( magicBall > 75)
                {
                    magicBall -= 75;
                }
                int ballA;
                if( petName.length() >= 3)
                {
                    ballA = (int)(petName.charAt(2));
                }
                else
                {
                    ballA = carYear + luckyNumber;
                }
                while( ballA > 65)
                {
                    ballA -= 65;
                }

                int ballB = userRandomNumber - generateRandomB;
                while( ballB < 1)
                {
                    ballB += 65;
                }

                int ballC = (int)actorName.charAt(0);
                while( ballC > 65)
                {
                    ballC -= 65;
                }

                int ballD = (int)actorName.charAt(actorName.length()-1);
                while( ballD > 65)
                {
                    ballD -= 65;
                }

                int ballE = petAge + carYear;
                while( ballE > 65)
                {
                    ballE -= 65;
                }
                System.out.printf("Lottery numbers: %d, %d, %d, %d, %d Magic ball: %d\n",
                                    ballA, ballB, ballC, ballD, ballE, magicBall);
                //I will now store the balls into an array to perform the bonus section//
                
                System.out.print("Do you want to play again: ");
                prompt = input.next();
                playAgain = prompt.equals("y") || prompt.equals("yes");
            } while(playAgain);
            System.out.println("Thanks for playing!");
        }
        else
        {
            System.out.println("Pleaase return later to complete the survey. ");
        }
    }    
}
