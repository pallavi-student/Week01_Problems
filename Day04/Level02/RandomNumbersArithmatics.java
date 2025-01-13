import java.util.Scanner;

public class RandomNumbersArithmatics{
    
   //Method to return an array of 4 digit random number
   public static int[] generateRandomArray(int size){
      int[]randomArray=new int[size];
      for(int i=0;i<size;i++){
          randomArray[i]=1000+(int)(Math.random()*9000);//Generate 4 digit random number
       }
       return randomArray;
    }
    //Method to find average, min, and max value of random array
    public static double[]findAverageMinMax(int[]numbers){
       int min=numbers[0];
       int max=numbers[0];
       double sum=0;

       for(int i=0;i<numbers.length;i++){
           sum+=numbers[i];
           min=Math.min(min,numbers[i]);
           max=Math.max(max,numbers[i]);
       }
       double average=sum/numbers.length;
       double[]result={average,min,max};
return result;
    }
    public static void main(String[]args){
       int[]randomNumberArray= generateRandomArray(5);
       
       //Average,min,max
       double[]result=findAverageMinMax(randomNumberArray);
       //displaying
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + (int) result[1]);
        System.out.println("Maximum: " + (int) result[2]);
    }
}

          
    