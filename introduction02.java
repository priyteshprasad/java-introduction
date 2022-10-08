import java.util.*;       //from java.util import all modules
import java.util.Scanner; //from java.util import Scanner module

public class Main {
    public static void main(String[] args) {
      //Rule for defining a variable
      /*
      1. Must not start with number or special char(except '_'): Valid(a, a1, a_1, _a), NotValid(1a, 11, @a)
      2. Must not be a reserved key word(like: var, System, println, int)
      3. Must not be pre-occupied(like: int a; double a;)
      4. Can contain alphabets, numbers and _ or $ Eg: $var1, a_1, _small
      */
      int a = 10; System.out.println(a);
      int b = 3; System.out.println(b);
      int _1 = 15; System.out.println(_1);
      
      
      //Arthametic Operation 
      //+, -, *, /, %
      int s = a + b; System.out.println(s);
      int d = a - b; System.out.println(d);
      int m = a * b; System.out.println(m);
      int r = a % b; System.out.println(r);
      
      //Type-casting: forcefull conversion of data Type
      double q = (double) a/b;  System.out.println(q);
      float qf = (float) a/b;   System.out.print(qf);
      int qi = (int) q;         System.out.println(qi);
      String qs = "10112.222";  System.out.print((String) q); 
      // float qsf = (float) qs;   System.out.println(qsf); //not possible in Java 
      
      
      
      //Inpurt: nextInt(), nextLong(), nextFloat(), 
      //nextDouble(), nextBoolean(), nextLine(), next() - Functions
      Scanner sc = new Scanner(System.in);
      //This line is important before using sc which is Scanner class Object
      
      int a1 = sc.nextInt();          System.out.println(a1);
      int b1 = sc.nextInt();          System.out.println(b1);
      boolean bo = sc.nextBoolean();  System.out.println(bo);
      char c = sc.next().charAt(0);   System.out.println(c);
      float f = sc.nextFloat();       System.out.println(f);
      double d1 =sc.nextDouble();     System.out.println(d1);
      
      String s1 = sc.nextLine();      System.out.println(s1);
      String s2 = sc.next();          System.out.println(s2); 
      /*this line will scan ('I') and rest will be left for onther scan, 
      and sc.nextInt() will genereate error
      //InputMisMatchException- Wrong data type entered
      */
      // int integer1 = sc.nextInt();    System.out.println(integer1);
      //this line is generating above mention error 
      
      
      
      //--------------Conditional Programming------------------------
      int v1 = 1;
      int v2 = 0;
      System.out.println(v1 > v2); System.out.println(v1 < v2);System.out.println(v1 == v2);
      if (v1 > 0){
        System.out.println(v1);
      }else{
        System.out.println("negetive value");
      }
      
      
      /*Input for STDIN:
      1
      2
      true
      Hello
      123.456
      123456.789123 how are your
      I am fine
      555555
      
      */
      
      
      
      
      
      
      
      
  }
}