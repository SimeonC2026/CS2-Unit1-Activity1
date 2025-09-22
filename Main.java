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
      System.out.println("Enter an emotion: ");
      String emotion1 = "happy"; // REPLACED literal value
      String pet = "dog";
      String verbPastTense1 = "kissed";
      String adverb1 = "excitedly";
      String verbPastTense2 = "ate";
      String adverb2 = "quickly";
      String verbPastTense3 = "unloaded";


      // Print your story line by line
      System.out.println("I woke up feeling " + emotion1 + " today.");
      System.out.println("My " + pet + " " + verbPastTense1 + " my face" + adverb1);
      System.out.println("I " + adverb2 + verbPastTense2 + "my breakfast and" + verbPastTense3 + " the dishwasher");


   }
}
