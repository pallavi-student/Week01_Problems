import java.util.Scanner;
class CalculateDivisionElements{
    //Method to find Remainder and Quotient 
    public static int[] findRemainderAndQuotient(int number, int divisor){
    //Declaring array to hold the values of Reaminder and Quotient of number
    int []arr={0,0};
    arr[0]=number%divisor;
    arr[1]=number/divisor;
    return arr;
    }// main method to execute program
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter number to be divided");
    int number=input.nextInt();
    System.out.println("Enter divisor");
    int divisor=input.nextInt();
    int[]result={0,0};
    result=CalculateDivisionElements.findRemainderAndQuotient(number,divisor);
    System.out.println("Remainder of"+number+"  and "+divisor+ " is "+result[0]+" and Quotient is "+result[1]);
    }
}


    
    
