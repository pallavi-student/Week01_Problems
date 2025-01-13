import java.util.Scanner;
class checkIntegerType{
//method to check Integer types 
   public int checkFunction(int number){
     if(number<0){
return -1;}
     else if(number>0)
return 1;
     else 
return 0;}
public static void main(String[]args){
//Scanner object is created
Scanner input=new Scanner(System.in);
System.out.println("Input a number");
int number=input.nextInt();
checkIntegerType obj=new checkIntegerType();
int result=obj.checkFunction(number);
if(result==1){
System.out.println("Input number is positive Integer");}
     else if(result==-1){
System.out.println("Input number is negative Integer");
}
  else 
System.out.println("Input number is zero");
}
}



      