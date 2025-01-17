import java.util.Scanner;
public class StringEquality{
      public static Boolean isEqual(String text1,String text2){
      if(text1.length()!=text2.length()){
        return false;}
      else{
         for(int i=0;i<text1.length();i++){
            if(text1.charAt(i)!=text2.charAt(i)){
              return false;
            }
         } }
      return true;
      }
      public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first text");
      String text1=sc.nextLine();
      System.out.println("Enter second text");
      String text2=sc.nextLine();
      Boolean result1=StringEquality.isEqual(text1,text2);
      Boolean result2=text1.equals(text2);
      if(result1==result2&&result1==true)
      {System.out.println("Both the strings are equal and both user method and built in method give same result");}
      else
      {System.out.println("Both the strings are not equal and both user method and built in method give same result");}
      }
}

          
