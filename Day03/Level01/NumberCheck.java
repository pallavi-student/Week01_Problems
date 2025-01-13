import java.util.Scanner;
class NumberCheck{
  public static void main(String[]args){
  //Creating Scanner Object for taking user input
  Scanner input=new Scanner(System.in);
   // Declaring Array
   int[]numbers=new int[5];
   System.out.println("Enter Number");
   // Taking Number as input
   for(int i=0;i<numbers.length;i++){
      numbers[i]=input.nextInt();
   }
   // Applying code logic to get valid age
   for(int i=0;i<numbers.length;i++){
   if(numbers[i]<0){
     System.out.println(numbers[i]+" is negative number");
   }
   else if(numbers[i]==0){
     System.out.println(numbers[i]+" is equals to zero");
   }


   else{
       if(numbers[i]%2==0){
          System.out.println(numbers[i]+" is even number");

       }
   else{
         System.out.println(numbers[i]+" is odd number");

  }
  }

  }
  if(numbers[0]>numbers[numbers.length-1]){
        System.out.println(numbers[0]+" which is first number is greater than the last element");
  }
  else if(numbers[0]<numbers[numbers.length-1]){
        System.out.println(numbers[numbers.length-1]+" which is last number is greater than the first element");
  }
  else{
        System.out.println(numbers[numbers.length-1]+" "+ numbers[0]+" first and last elements of the array are equal");
  }
 }
}

