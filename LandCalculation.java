/*
   Chapter 2
   Prompt: "Land Calculation"
   
   Summary: Knowing that one acre of land is equivalent to 43,560 square feet,
   this program calculates the number of acres in a tract of land with 589,767 square feet.
   
   (Hint: divide the size of the tract of the land - by the size of an acre to get the number of acres.)
*/

public class LandCalculation
{
   public static void main(String[] args)
   {
      // delcaring and initializing variables
      double oneAcre = 43560, tractOfLand = 389767;
      
      // dynamic variable
      double finalAcres = tractOfLand / oneAcre;
            
      System.out.printf("The number of acres in this tract of land is approximately %,.0f square feet.", finalAcres);
   }
}