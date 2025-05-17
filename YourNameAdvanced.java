/*
   Prompt: "Name and Initials" Advanced version
      
   Summary: It is a more complex version of the "YourName" program made previously.
   [had to do some troubleshooting to figure this out on my own with the textbook, myself, and
   with some AI explanations to guide me on my errors and find new solutions.]
   
   This program asks and displays the first, middle (if applicable), and last names of the user,
   as well as extract and store the first initials of each respective name,
   and display them onto the screen.
*/
import java.util.Scanner;

public class YourNameAdvanced
{
   public static void main(String[] args)
   {
      // Initializing temporary scanner object.
      Scanner input = new Scanner(System.in);
      
      // Asks and declares and initializes name variables.
      System.out.print("First Name: ");
      String firstName = input.nextLine();
      
      System.out.print("Middle Name: ");
      String middleName = input.nextLine();
      
      System.out.print("Last Name: ");
      String lastName = input.nextLine();
      
      
      /*
      Finding initials of each respective name, if applicable.
         
         Declaring initial variables outside of blocks to remain
         in the global scope of main method, not just within the if-else statements.
      */
      char firstInitial, middleInitial, lastInitial;
      
         // first initial
      if(firstName.isEmpty()) {
         firstInitial = ' ';
      }
      else {
         firstInitial = firstName.charAt(0);  
      }
      
         // middle initial
      if(middleName.isEmpty()) {
         middleInitial = ' ';
      }
      else {
         middleInitial = middleName.charAt(0);
      }
      
         // last initial
      if(lastName.isEmpty()) {
         lastInitial = ' ';
      }
      else {
         lastInitial = lastName.charAt(0);
      }


      /*
         Prints names and initials.
         note: makes use of .isEmpty() method for Strings and == '\u0000' for chars 
         to ensure there is a correct number of empty spaces +
         to be robust without any errors for when there is
         or isn't a name/intial in the user's name.
         
         ? and : is compact if-else statement form used to ensure there are
         no errors for both of these cases.
      */ 
      System.out.println("\nFull name: " + firstName + (middleName.isEmpty() ? "" : " " + middleName) + " " + lastName);
      System.out.println("Initials: " + firstInitial + (middleInitial == '\u0000' ? "" : middleInitial) + lastInitial);
   }
}