import java.util.Scanner;
class Compare{
  //Method to find smallest and largest number among three numbers
  public static int[] findSmallestAndLargest(int number1, int number2, int number3){ // Declaring array to hold the values of largest and smallest number
  int[]arr={number1,number1};
  //Condition for finding largest number
  if(number2<arr[0]&&number2<number3||number3<arr[0]||number3<number2){
    if(number3<arr[0]||number3<number2){
    arr[0]=number3;
    }
    else
    arr[0]=number2;
  }
  // condition for finding smallest number
  if(number2>arr[0]&&number2>number3||number3>arr[0]||number3>number2){
    if(number3>arr[0]||number3>number2){
    arr[1]=number3;
    }
    else
    arr[1]=number2;
  }
  // Condition to handel when all numbers are equal
  if(number2==arr[0]&&number2==number3){
    arr[0]=-1;
    arr[0]=-1;
  }
return arr;
}// main method to execute program
  public static void main(String[]args){
  // creating Scanner object to take inputs
  Scanner input=new Scanner(System.in);
  System.out.println("Enter first number: ");
  int number1=input.nextInt();
  System.out.println("Enter second number: ");
  int number2=input.nextInt();
  System.out.println("Enter third number: ");
  int number3=input.nextInt();
  int[]result=new int[2];
  result=Compare.findSmallestAndLargest(number1,number2,number3);
  System.out.println("Largest number from "+number1+","+number2+" and "+number3+" is "+result[1]+" and Smallest number is "+result[0]);
  }
}
  





  
 