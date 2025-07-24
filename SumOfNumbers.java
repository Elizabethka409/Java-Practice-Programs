/*
   Chapter 4
   Prompt: "Sum of Numbers"
   
   Summary: Program asks user for a positive nonzero integer value.
   Must use a loop to get the sum of all integers from 1 -- up to the number entered.
   
      Ex: if the user enters 50, the loop will find the sum of 1, 2, 3, 4 . . . 50.

*/
import java.util.Scanner;

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      // declaring Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // ask the user a for positive nonzero integer
      System.out.print("Enter a positive nonzero integer: ");
      int num = keyboard.nextInt();
      
      int sum = 0;
      // for loop to determine sum of numbers (from 1 to num)
      for(int i = 1; i <= num; i++) {
         sum += i;
      }
      
      // display result
      System.out.println("The sum of numbers from 1 to " + num + " is " + sum + ".");
   }
}