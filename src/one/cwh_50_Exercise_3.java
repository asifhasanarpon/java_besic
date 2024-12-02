/*create a class game ,which allows a user to play "guess the number"
    game once .Game should have the following methods:
     1.Constructor to generate the random number
     2.TakeUserInput() to take aa user input of number
     3.isCorrectNumber() to detect whether the number entered by the user is true
     4.Getter and setter for noOfGuesses
     Use properties such as noOfGuesses(int) ,etc to get this task done!
 */
package one;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    void Game(){
        Random rand = new Random();

        this.number = rand.nextInt();
    }
    void TakeUserInput(){
        System.out.println("Guess the number ");
        Scanner se = new Scanner(System.in);
        inputNumber = se.nextInt();
    }
    boolean isCorrectNumber() {
        if (inputNumber== number) {
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class cwh_50_Exercise_3 {
    public static void main(String[] args) {
        Game g = new Game();
        g.TakeUserInput();
        boolean b = g.isCorrectNumber();
        System.out.println(b);
    }
}
