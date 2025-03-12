import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //create instance of Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Negative sentence: ");
        String userInput = sc.nextLine();

        //create new wordProcessor instance
        WordProcessor positivizer = new WordProcessor(userInput);

        System.out.println(positivizer.positivize());
    }
}

