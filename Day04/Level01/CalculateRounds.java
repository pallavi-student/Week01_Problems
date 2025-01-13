import java.util.Scanner;
class CalculateRounds{
   // Method definition for calculating total handshakes
   public int toatalRounds(int side1,int side2,int side3,int targetDistance){
    int perimeter=side1+side2+side3;
    targetDistance*=1000;
    int rounds=targetDistance/perimeter;
    return rounds;

   }
   // Main methods
   public static void main(String args[]){
   // Creating Scanner object
   Scanner input=new Scanner(System.in);
   
   System.out.print("Enter side 1: ");
   // Taking input for number of students
   int side1 =input.nextInt();
   System.out.print("Enter side 2: ");
   int side2=input.nextInt();
    System.out.print("Enter side 3: ");
   int side3=input.nextInt();
   int targetInKm=5;
   CalculateRounds obj=new CalculateRounds();
   // Calling method
   int rounds=obj.toatalRounds(side1,side2,side3,targetInKm);
   System.out.println("Total rounds athlete cover "+rounds);
      } 
}
   