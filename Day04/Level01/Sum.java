import java.util.Scanner;
class Sum{
  //Method to calculate natural no sum
  public int sumOfNaturalNumber(int number){
  // local variable to store sum
  int sum=0;
  for(int i=0;i<number;i++){
   sum+=(i+1);
  }
  return sum;
  }
  // main method to call method 
  public static void main(String[]args){
  // Declaring scanner object to extract keyboard input
  Scanner input=new Scanner(System.in);
  System.out.println("Enter natural number upto which you want sum");
  // Taking user input
  int number=input.nextInt();
  // creating class object to call non static method
  Sum obj=new Sum();
  // Calling method using class object
  int sumResult=obj.sumOfNaturalNumber(number);
  System.out.println("Sum of  "+number+" natural numbers is "+sumResult);
  }
}

