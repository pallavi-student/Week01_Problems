import java.util.Scanner;
public class PrecedenceCheckForDouble{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
double a,b,c;
double operation_1=0,operation_2=0,operation_3=0,operation_4=0;
System.out.println("Enter Number 1");
a=input.nextDouble();
System.out.println("Enter Number 2");
b=input.nextDouble();
System.out.println("Enter Number 3");
c=input.nextDouble();
operation_1= a + b *c;
operation_2= a * b + c;
operation_3= c + a / b;
operation_4= a % b + c;
// Following the precedence rule PEMDAS
System.out.print("The results of Int Operations are "+operation_1+","+operation_2+","+operation_3+","+operation_4);
}}




