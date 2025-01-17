import java.util.*;
class DemoIllegalArgumentException{

public static void generateIllegalArgumentException(String text) {
        System.out.println(text.substring(5, 2)); // This will throw IllegalArgumentException
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
public static void main(String[]args){
String text="beauty";
try{
     generateIllegalArgumentException(text);}
   catch(Exception e){
    System.out.println(e.getMessage());
}
handleIllegalArgumentException(text);
}
}
