
import java.util.Scanner;


public class Driver {
   public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter your name: ");
       String nm=sc.next();
       System.out.print("Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, or 'D' for Division: ");
       String type=sc.next();
       System.out.print("Enter the number of problems you wish to work: ");
       int n=sc.nextInt();
       System.out.print("Enter the lowest value for the range of factors in your problems: ");
       int min=sc.nextInt();
       System.out.print("Enter the highest value for the range of factors in your problems: ");
       int max=sc.nextInt();
      //Assigning values to the method of calculations
       Session1 ssn=new Session1(nm,n,type.charAt(0),min,max);
       ssn.start(sc);
       //defining obj
   }
}
