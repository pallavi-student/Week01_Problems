//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
public class CalculateProfitLoss{
public static void main(String[]args){
double cost_Price=129, selling_Price=191;
// As SP is less than CP so profit is calculated
double profit=selling_Price-cost_Price;  //knowing the fact Profit = selling price - cost price
double profit_Percentage=profit/cost_Price*100; // knowing the fact Profit Percentage = profit / cost price * 100
System.out.print("The Cost Price is INR "+cost_Price + " and Selling Price is INR " +selling_Price+ "\n The Profit is INR " +profit+ "and the Profit Percentage is "+profit_Percentage+" %");
}}