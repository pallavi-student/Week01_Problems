import java.util.Scanner;
class FizzBuzz{
  public static void main(String[]args){
	  // creating Scanner object
    Scanner input=new Scanner(System.in);
     // taking number as input
    int number=input.nextInt();
    //Check for positive number 
    if(number>0){
    String[]array=new String[number];
    for(int i=0;i<number;i++){ 
    if(i%3==0&&i%5==0){
    array[i]="FizzBuzz";
	}
    else if(i%3==0)
    {array[i]="Fizz";
    }
    else if(i%5==0){
    array[i]="Buzz";
	}
    else{
    array[i]=Integer.toString(i);}
    }

    for(int i=0;i<number;i++){
    System.out.println(array[i]);}}
    else{
    System.out.println("You entered negative number");
	}
	input.close();

  }
}
