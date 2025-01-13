import java.util.Scanner;
class MaximumHandshakesVoid{
   // Method definition for calculating total handshakes
   public void numberOfHandshakes(int numberOfStudents){
    int handshakeCount=(numberOfStudents*(numberOfStudents-1))/2;
    System.out.println("Total no of handshakes among "+numberOfStudents+ "is"+handshakeCount);

   }
   // Main methods
   public static void main(String args[]){
   // Creating Scanner object
   Scanner input=new Scanner(System.in);
   
   System.out.print("Enter number of Students: ");
   // Create class object to call non static methods
   MaximumHandshakesVoid obj=new MaximumHandshakesVoid();
   // Taking input for number of students
   int numberOfStudents=input.nextInt();
   // Calling method
   obj.numberOfHandshakes(numberOfStudents);
      } 
}
   