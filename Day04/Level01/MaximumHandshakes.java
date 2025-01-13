import java.util.Scanner;
class MaximumHandshakes{
   // Method definition for calculating total handshakes
   public int numberOfHandshakes(int numberOfStudents){
    int handshakeCount=(numberOfStudents*(numberOfStudents-1))/2;
   return handshakeCount;
   }
   // Main methods
   public static void main(String args[]){
   // Creating Scanner object
   Scanner input=new Scanner(System.in);
   
   System.out.print("Enter number of Students: ");
   // Create class object to call non static methods
   MaximumHandshakes obj=new MaximumHandshakes();
   // Taking input for number of students
   int numberOfStudents=input.nextInt();
   // Calling method
   int totalHandshakes= obj.numberOfHandshakes(numberOfStudents);
   System.out.println("Total no of handshakes among "+numberOfStudents+ "is"+totalHandshakes);
   } 
}
   