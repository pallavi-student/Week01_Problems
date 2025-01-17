import java.util.*;
class ExceptionsNullPointer{
public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void handleNullPointerException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
public static void main(String[]args){
try{
     ExceptionsNullPointer.generateNullPointerException();}
   catch(Exception e){
    System.out.println(e.getMessage());
}
handleNullPointerException();
}
}

    
    
   