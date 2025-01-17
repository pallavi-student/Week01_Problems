import java.util.Scanner;
public class PrintSubstring{
       public static String findSubstring(String text,int start,int end){
          String result="";
          for(int i=start;i<end;i++){
             result+=text.charAt(i);
          }
       return result;
       }
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
       Scanner input=new Scanner(System.in);
       System.out.println("Enter text");
       String text=input.nextLine();
       System.out.println("Enter first index to start to substring");
       int start=input.nextInt();
       System.out.println("Enter second index where to end substring");
       int end=input.nextInt();
       String userDefinedresult=PrintSubstring.findSubstring(text,start,end);
       String builtInResult=text.substring(start,end);
        boolean isTrue= PrintSubstring.isEqual(userDefinedresult,builtInResult);
      if(isTrue){
       System.out.println("Substring of text "+text+" from "+start+" to "+end+" from user defined method is "+ (userDefinedresult)+" and from buitIn method is "+(builtInResult)+" and both are equal");}
      else
       {System.out.println("Substring of text "+text+" from "+start+" to "+end+" from user defined method is "+ (userDefinedresult)+" and from buitIn method is "+(builtInResult)+" and both are not equal");
       }
      
      

       }
}

       

       
           
       