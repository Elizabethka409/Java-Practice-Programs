/*
   Chapter 6
   Author: Elizabeth Ka
   Prompt: The Cost of Painting a Series of Rooms, Practice Exam
   
   Sumamry: This program calculates and displays the cost of painting multiple rooms,
   asking for dimensions and showing costs per room before displaying the total.
   
   Calculation Info:
   The company you work for charges $35 per hour for labor
   and a flat rate of $60 a gallon for paint.
   It has determined that for every 250 square feet of wall space,
   one gallon of paint and four hours of labor will be required. 
   
   NOTE: This program only practices older concepts, methodologies, and techniques.
   Mostly demonstrating the use of methods (modularization), for loops, and data validation,
   and show of readable, robust, and proper use of code and conventions.
*/

import java.util.Scanner;

public class PaintCost
{
   public static void main(String[] args)
   {
      // scanner object
      Scanner input = new Scanner(System.in);
      
      // declaring variables 
      double length, width, height, totalCost = 0.00;
      int rooms;
      
      // asks user for the number of rooms
      System.out.print("Enter the number of rooms to be painted: ");
      rooms = input.nextInt();

   // For-loop iterates to calculate costs for the specified number of rooms
      for(int i = rooms; i > 0; i--)
      {
         // asks user for dimensions of one room
         System.out.print("\nEnter the length of the room: ");
         length = input.nextDouble();
         
         // validates user input for length
         while(length <= 0)
         {
            System.out.println("\nLength must be a positive number.");
            System.out.print("\nEnter the length of the room: ");
            length = input.nextDouble();
         }
         
         System.out.print("Enter the width of the room: ");
         width = input.nextDouble();
         
         // validates user input for width
         while(width <= 0)
         {
            System.out.println("\nWidth mmust be a positive number.");
            System.out.print("\nEnter the width of the room: ");
            width = input.nextDouble();
         }
         
         System.out.print("Enter the height of the room: ");
         height = input.nextDouble();

         // validates user input for height
         while(height <= 0)
         {
            System.out.println("\nHeight must be a positive number.");
            System.out.print("\nEnter the height of the room: ");
            height = input.nextDouble();
         }
         
         
         // calcualtes perimeter and wallspace
         double perimeter = calcPerimeter(length, width);
         double wallSpace = calcWallSpace(length, width, height);
         
         // calculating costs
         double paintCost = calcPaintCost(wallSpace);
         double laborCost = calcLaborCost(wallSpace);
         
         // adding variables to total cost
         totalCost += paintCost + laborCost;
         
         // displays current room's costs
         displayData(paintCost, laborCost);
      }
         
      // displays the final cost of all rooms
      System.out.printf("\nThe total cost of painting the %,d rooms is $%,.2f%n", rooms, totalCost);
      
      // close scanner object
      input.close();
   }
   
   /*
      method calculates and returns the perimeter of a room
         @param length The length of the room
         @param width The width of the  room
         @return The perimeter of the room
   */
   public static double calcPerimeter(double length, double width)
   {
      return (length + width) * 2;
   }
   
   /*
      method calculates and returns the wall space of one room
         @param length The length of the room
         @param width The width of the  room
         @param height The height of the room
         @return The square feet of wallspace in a room
   */
   public static double calcWallSpace(double length, double width, double height)
   {
      return calcPerimeter(length, width) * height;
   }
   
   /*
      method calculates and returns the cost of paint for painting a room
         @param wallSpace The square feet of wall space in the room
         @return The cost of paint for painting the room
   */
   public static double calcPaintCost(double wallSpace)
   {
      // Each gallon costs $60, aka flat fee
      final double PAINT_COST_PER_GALLON = 60;
      // one gallon of paint takes up 250 square feet
      final double SQ_FT_PER_GALLON = 250;
      // for every 250 sq ft of wallspace, a gallon of paint is required. Rounds up gallons if needed.
      double gallonsNeeded = Math.ceil(wallSpace / SQ_FT_PER_GALLON);
      
      return gallonsNeeded * PAINT_COST_PER_GALLON; 
   }
   
   /*
      method calculates and returns the cost of labor to work on one room
         @param wallSpace The square feet of wall space in the room
         @return The cost of labor for painting the room
   */
   public static double calcLaborCost(double wallSpace)
   {
      // for every 250 sq ft of wallspace, 4 hours of labor is required
      // $35 per hour of labor
      final double LABOR_COST_PER_HOUR = 35;
      // 250 sq ft takes 4 hours to paint + 1 gallon of paint
      final double SQ_FT_PER_GALLON = 250;
      final double HOURS_OF_LABOR_REQUIRED_PER_GALLON = 4;
      double hoursNeeded = (wallSpace / SQ_FT_PER_GALLON) * HOURS_OF_LABOR_REQUIRED_PER_GALLON;
      
      return hoursNeeded * LABOR_COST_PER_HOUR; 
   }
   
   /*
      method that displays the calculated paint and labor costs
         @param paintCost The cost of paint for painting a room
         @param laborCost The cost of labor for painting a room
   */
   public static void displayData(double paintCost, double laborCost)
   {
      System.out.printf("\nPaint Cost: $%,.2f" , paintCost);
      System.out.printf("\nLabor Cost: $%,.2f\n" , laborCost);
   }
}