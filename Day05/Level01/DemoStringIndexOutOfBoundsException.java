import java.util.*;
class DemoStringIndexOutOfBoundsException{
public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println(text.charAt(text.length())); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
public static void main(String[]args){
String text="Beauty";
try{
    generateStringIndexOutOfBoundsException(text);}
   catch(Exception e){
    System.out.println(e.getMessage());
}
handleStringIndexOutOfBoundsException(text);}
}
