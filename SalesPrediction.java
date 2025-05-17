/*
   Chapter 2
   Prompt: "Sales Predication"
   
   Summary: The East Coast sales division of a company generates 
   62 percent of total sales.
   
   This program will predict how much the East Coast division
   will generate if the company has $4.6 million in sales this year.

*/

public class SalesPrediction 
{
   public static void main(String args[])
   {
      // declaring and initializing variables.
         // to represent 62% of the total sales the sales division generates alone
      double eastCoastSales = .62;
      
         // to represent $4.6 million (4,600,000) of the total sales the company generates
      double companyTotalSales = 4600000;
      
         // Dynamic variable
      double predictedEastCoastSales = eastCoastSales * companyTotalSales;
      
      // displays prediction results
      System.out.printf( "If the company made $%,.2f in sales this year, then 62%% of that, coming from the sales from the East Coast Division, would be $%,.2f.%n", companyTotalSales, predictedEastCoastSales);
   }
}