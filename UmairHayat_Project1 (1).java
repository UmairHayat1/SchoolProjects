import java.util.Scanner;
public class UmairHayat_Project1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  public static int get_factor(int high,int low){
		    return (int)(low + (Math.random() * high)); 
		  }
		  // main method
		  public static void main(String[] args) {
		    // initialize scanner
		    Scanner s = new Scanner(System.in);
		    // initialize start time
		    long start_time=System.currentTimeMillis();
		    // get name and operation 
		    System.out.println("Enter your name:");
		    String name=s.next();
		    System.out.println();
		    System.out.println("Enter \"A\" for Addition,\"S\" for Subtraction, \"M\" for Multiplication, \"D\" for Division:");
		    char input=s.next().toUpperCase().charAt(0);
		    // enter num of problems
		    System.out.println("Enter the number of problems you wish to work:");
		    int num_computation=s.nextInt();
		    System.out.println();
		    // enter high and low values for generating random integers
		    System.out.println("What are the low and high numbers you want in your problems?");
		    System.out.println("Enter the low value for your problems:");
		    int low_value=s.nextInt();
		    System.out.println();
		    System.out.println("Enter the high value for your problems:");
		    int high_value=s.nextInt();
		    System.out.println();

		    // count to store num of correct answers
		    int num_correct=0;
		    // declare time and score
		    long time;
		    int percent;
		    // switch operation given as input
		    switch(input){
		      // for addition
		      case 'A':
		      // loop for num of problems amount
		    	for(int i=0;i<num_computation;i++){
		          // get two random integers
		          int first_num=get_factor(high_value, low_value);
		          int second_num=get_factor(high_value, low_value);
		          // get the answer for addition of both numbers from user
		          System.out.print(first_num + " + " + second_num + "=") ;
		          int answer=s.nextInt();
		          // in user answer is correct
		          if(answer==(first_num+second_num)){
		            // increment correct count
		            num_correct++;
		            System.out.println("Correct");
		          }
		          else{
		            System.out.println("Incorrect");
		          }
		        }
		        // print sessions Summary
		        System.out.println("Session Summary");
		        System.out.println(num_computation+" problems,"+num_correct+" correct");
		        // get difference of start_time and current time in seconds
		        time=(System.currentTimeMillis()-start_time)/1000;
		        // get the score out of 100
		        // score=correct/total * 100
		        // round the value to integer
		        percent=(int)Math.round((double)(num_correct) / num_computation*100);
		        System.out.println("Score is "+percent+",Time is "+time+" seconds");
		        // get current date time
		        System.out.println("Session for "+name+" was addition on "+java.time.LocalTime.now());
		        break;
		      // for Subtraction
		      case 'S':
		        for(int i=0;i<num_computation;i++){
		          int first_num=get_factor(high_value, low_value);
		          int second_num=get_factor(high_value, low_value);
		          // minuend=first_num+second_num
		          int minuend=first_num+second_num;
		          // get the answer for Subtraction of minuend and second_num from user
		          System.out.print(first_num + " - " + second_num +"= " );
		          int answer=s.nextInt();
		          if(answer==(minuend-second_num)){
		            num_correct++;
		            System.out.println("Correct");
		          }
		          else{
		            System.out.println("Incorrect");
		          }
		        }
		        System.out.println("Session Summary");
		        System.out.println(num_computation+" problems,"+num_correct+" correct");
		        time=(System.currentTimeMillis()-start_time)/1000;
		        percent=(int)Math.round((double)(num_correct) / num_computation*100);
		        System.out.println("Score is "+percent+",Time is "+time+" seconds");
		        System.out.println("Session for "+name+" was Subtraction on "+java.time.LocalTime.now());
		        break;
		      case 'M':
		        for(int i=0;i<num_computation;i++){
		          int first_num=get_factor(high_value, low_value);
		          int second_num=get_factor(high_value, low_value);
		          // get the answer for Multiplication of both numbers from user
		          System.out.print(first_num+" * "+second_num+"=");
		          int answer=s.nextInt();
		          if(answer==(first_num*second_num)){
		            num_correct++;
		            System.out.println("Correct");
		          }
		          else{
		            System.out.println("Incorrect");
		          }
		        }
		        System.out.println("Session Summary");
		        System.out.println(num_computation+" problems,"+num_correct+" correct");
		        time=(System.currentTimeMillis()-start_time)/1000;
		        percent=(int)Math.round((double)(num_correct) / num_computation*100);
		        System.out.println("Score is "+percent+",Time is "+time+" seconds");
		        System.out.println("Session for "+name+" was Multiplication on "+java.time.LocalTime.now());
		        break;
		      case 'D':
		        for(int i=0;i<num_computation;i++){
		          int first_num=get_factor(high_value, low_value);
		          int second_num=get_factor(high_value, low_value);
		          // dividend=first_num*second_num
		          int dividend=first_num*second_num;
		          // get the answer for Division of  dividend with first_num from user
		          System.out.print(dividend+" / "+first_num+"=");
		          int answer=s.nextInt();
		          if(answer==(dividend/first_num)){
		            num_correct++;
		            System.out.println("Correct");
		          }
		          else{
		            System.out.println("Incorrect");
		          }
		        }
		        System.out.println("Session Summary");
		        System.out.println(num_computation+" problems,"+num_correct+" correct");
		        time=(System.currentTimeMillis()-start_time)/1000;
		        percent=(int)Math.round((double)(num_correct) / num_computation*100);
		        System.out.println("Score is "+percent+",Time is "+time+" seconds");
		        System.out.println("Session for "+name+" was Division on "+java.time.LocalTime.now());
		        break;  
		    }
		    
		  }
		}