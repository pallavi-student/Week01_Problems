import java.util.Scanner;
class SeasonCheck{
    //method to check for spring season
    public boolean isSpringSeason(int month,int day){
    if(month>=3&&month<=6){
    //if condition for check using logical operator
    if(month==4||month==5||(month==3&&day>=20) ||(month==6&&day<=20))
    return true;
     
    }
    return false;

}
//Main method
public static void main(String[]args){
//creating Scanner object
Scanner input=new Scanner(System.in);
//Extracting input for month
System.out.println("Enter Month");
int month=input.nextInt();
//Extracting input for day
System.out.println("Enter Day")
int day=input.nextInt();
//Creating object of class to call its instance method
SeasonCheck obj=new SeasonCheck();
boolean result=obj.isSpringSeason(month,day);
if(result){
System.out.println("Current Season is Spring Season");
}
else{
System.out.println("Current Season is not a Spring Season");
}
}
}

