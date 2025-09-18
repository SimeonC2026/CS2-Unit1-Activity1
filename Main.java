// 1. IMPORT Scanner CLASS
import java.util.Scanner;

public class Main {
   public static void main(String []args) {
      System.out.println("Let's play MadLibs!");
      
      // 2. Set up a Scanner OBJECT
      Scanner input = new Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter:");
      String player = input.nextLine();
      System.out.println("Welcome, " + player);
      
      // Create variables for each placeholder word
      String emotion1 = "happy";
      String pet = "dog";
      String verbPastTense = "kissed";
      String adverb = "excitedly";

      // Print your story line by line
      System.out.println("I woke up feeling " + emotion + " today.");
      System.out.println("My " + pet + " " + verbPastTense + " my face");
      System.out.println()

   }
}
