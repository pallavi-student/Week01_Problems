import java.util.Scanner;
class SimpleInterest{
     public double CalculateSimpleInterest(double principal,int rate,int time){
     double simpleInterest=principal*rate*time/100;
     return simpleInterest;
     }
     public static void main(String args[]){
     Scanner input=new Scanner(System.in);
     System.out.println("Enter Principal amount: ");
     double principal=input.nextDouble();
     System.out.println("Enter Rate percent: ");
     int rate=input.nextInt();
     System.out.println("Enter Time in Years: ");
     int time=input.nextInt();
     SimpleInterest obj=new SimpleInterest();
     double simpleInterest=obj.CalculateSimpleInterest(principal,rate,time);
     System.out.println("The Simple Interest is: "+simpleInterest+" for Principal "+principal+", Rate of Interest"+ rate+" and Time "+time);
     }
}




