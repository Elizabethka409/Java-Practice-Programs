/*
   Chapter 2
   Prompt: "Name and Initials"
      
   Summary: This program will display your first, middle (if applicable), and last names.
   It will also use char variables to store your initials of each respective name,
   and display them to the screen.
*/

public class YourName
{
   public static void main(String[] args)
   {
      // declaring and intializing variables.
      String firstName = "Elizabeth", middleName = "", lastName = "Ka";
      char firstInitial = 'E', middleInitial = '\u0000', lastInitial = 'K';
      // note: \u0000 stands for null character (often displayed as nothing), useful for char characters
      // since they cannot actually be empty like with String variables (""). Alternatively, you can use ' '.
      
      // displaying our variables.
      System.out.println("First Name: " + firstName);  
      System.out.println("Middle Name: " + middleName);
      System.out.println("Last Name: " + lastName);
      System.out.println(firstName + " " + middleName + " " + lastName);
      System.out.println("First Initial: " + firstInitial);
      System.out.println("Middle Initial: " + middleInitial); 
      System.out.println("Last Initial: " + lastInitial);
      
      /*
      note: "", an empty String, is added at the beginning so char variables
      can be printed together as a 'String' instead of as unicode numbers,
      forcing Java to treat the expression as a String concatenation rather that ASCII values.
      */
      System.out.println("" + firstInitial + middleInitial + lastInitial);  
   }
}