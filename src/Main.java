import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome ot the Guess Number Game");
        Scanner sc = new Scanner(System.in);

        int myNum = (int)(Math.random()*100);

        int num;
        int attempts = 0;
        do{
            System.out.println("Guess a number between 0-100: ");
            num = sc.nextInt();

            if(num == myNum){
                System.out.println("Wohoo!...Correct Guess..you won in " + attempts + " attempts!");
                break;
            }else if(num > myNum){
                System.out.println("Oops!, Too large. Guess a smaller number");
                attempts++;
            }else{
                System.out.println("Oops!, Too small. Guess a larger number");
                attempts++;
            }
        }while(num >= 0);

        System.out.println("Game Ended. Hope you enjoyed!");
        System.out.println("The correct number was: " + myNum);

    }
}