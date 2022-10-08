import java.util.*;

public class Main {
    public static void main(String[] args) {
      // Loops 
      
      // for Loop
      for(int i=0; i<5; i++){
        System.out.println(i);
      }
      
      System.out.println("-----------------------------");
      //while loop
      int k = 5;
      while(k>0){
        System.out.println(k);
        k--;
      }
      
      System.out.println("-----------------------------");
      //do-while loop
      do{
        System.out.println(k);
        k++;
      }while(k<5);
      
      System.out.println("-----------------------------");
      //nested for loop
      for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
          System.out.print("(" + i +","+j+')'+ " ");
        }
        System.out.println();
      }
  }
}