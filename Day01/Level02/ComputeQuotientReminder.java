import java.util.Scanner;
public class ComputeQuotientReminder{
public static void main(String[] args){
int dividend,divisor;
Scanner input=new Scanner(System.in);
System.out.println("Enter First Number");
dividend=input.nextInt();
System.out.println("Enter Second Number");
divisor=input.nextInt();
int remainder=dividend % divisor;
int quotient=dividend/divisor;
System.out.print("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number " +dividend+" "+ divisor
);
}}



