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
      String emotion1 = input.nextLine(); // REPLACED literal value
      System.out.println("Enter a pet: ");
      String pet = input.nextLine();
      System.out.println("Enter a verb in past tense: ");
      String verbPastTense1 = input.nextLine();
      System.out.println("Enter an adverb to describe how this pet did the action: ");
      String adverb1 = input.nextLine();
      System.out.println("Enter a verb to describe what that person did with his/her breakfast: ");
      String verbPastTense2 = input.nextLine();
      System.out.println("Enter an adverb to describe how this person did the action with their breakfast:");
      String adverb2 = input.nextLine();
      System.out.println("Enter a verb to describe what the person did with the dishwasher:");
      String verbPastTense3 = input.nextLine();
      System.out.println("Enter a verb to describe what that person did with their teeth and hair:");
      String verbPastTense4 = input.nextLine();
      System.out.println("Enter a verb to describe what that person did with the scooter:");
      String verbPastTense5 = input.nextLine();
      System.out.println("Enter a verb to describe what the person did for school:");
      String verbPastTense6 = input.nextLine();
      System.out.println("Enter an infinitive describing what the person was going to do:");
      String infinitive1 = input.nextLine();
      System.out.println("Enter a prepositional phrase to describe where that person was going to be:");
      String prepositionalphrase1 = input.nextLine();


      // Print your story line by line
      System.out.println("I woke up feeling " + emotion1 + " today.");
      System.out.println("My " + pet + " " + verbPastTense1 + " my face " + adverb1);
      System.out.println( " I " + adverb2 + verbPastTense2 + " my breakfast," + verbPastTense3 + " the dishwasher and put everything back to where they belong.");
      System.out.println("I got dressed,"  + verbPastTense4 + " my teeth and hair, put my backpack on, " + verbPastTense5 + " my scooter, and " + verbPastTense6 + " for school.");
      System.out.println(" I was going " + infinitive1 + prepositionalphrase1 + " on time, but there was too much traffic!");
   }
}
