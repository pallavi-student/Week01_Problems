import java.util.Scanner;
class VotingAgeCheck{
  public static void main(String[]args){
    // Creating Scanner Object
    Scanner input=new Scanner(System.in);
   // Declaring Array
   int[]studentsAge=new int[10];
   System.out.println("Enter Students Age's");
   // Taking studentAge as input
   for(int i=0;i<studentsAge.length;i++){
      studentsAge[i]=input.nextInt();
   }
   // Applying code logic to get valid age
   for(int i=0;i<studentsAge.length;i++){
   if(studentsAge[i]<0){
     System.out.println("Invalid age please enter valid age");
   }
   else if(studentsAge[i]>=18){
     System.out.println("The student with the age "+ studentsAge[i]+" can vote");
   }
   else{
     System.out.println("The student with the age "+studentsAge[i]+" cannot vote");
   }
   }
 }
}