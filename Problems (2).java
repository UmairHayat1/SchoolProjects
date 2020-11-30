import java.util.Random;


public class Problems {
   private int [] firstVals;
   private int [] secondVals;
   private int [] ansVals;
   private int no;
   private char type;
   private int min;
   private int max;
  //Declaring variables
   public Problems(int _no,char ch,int mn,int mx){ //Method name
       this.no=_no;
       this.setMin(mn);
       this.setMax(mx);
       this.setType(ch);
       this.setFirstVals(new int[this.no]);
       this.setSecondVals(new int[this.no]);
       this.setAnsVals(new int[this.no]);
       this.init();
       //Assigning values
   }
  
   public void init(){ //method name
       Random rand=new Random();
       for(int i=0;i<this.no;i++){ //beginning of for loop
          //performing function
           this.secondVals[i]=rand.nextInt(max-min)+min; 
           if(this.type=='D' || this.type=='d'){
               while(true){ //beginning of while loop                 
                   if(this.secondVals[i]!=0){
                       break;
                   }
                   this.secondVals[i]=rand.nextInt(max-min)+min;
               }
               this.firstVals[i]=(rand.nextInt(max-min)+min)*this.secondVals[i];
              
               this.ansVals[i]=this.firstVals[i]/this.secondVals[i];  
               //Arrays
           }          
          
           if(this.type=='a' || this.type=='A'){
               this.firstVals[i]=(rand.nextInt(max-min)+min)*this.secondVals[i];
               this.ansVals[i]=this.firstVals[i]+this.secondVals[i];  
           }
           if(this.type=='m' || this.type=='M'){
               this.firstVals[i]=(rand.nextInt(max-min)+min)*this.secondVals[i];
               this.ansVals[i]=this.firstVals[i]*this.secondVals[i];  
           }
           if(this.type=='s' || this.type=='S'){
               this.firstVals[i]=(rand.nextInt(max-min)+min)*this.secondVals[i];
               this.ansVals[i]=this.firstVals[i]-this.secondVals[i];  
               //creating the values for addition, subtraction, etc
           }
       }
   }

   public int [] getFirstVals() {
       return firstVals;
   }

   public void setFirstVals(int [] firstVals) {
       this.firstVals = firstVals;
   }

   public int [] getSecondVals() {
       return secondVals;
   }

   public void setSecondVals(int [] secondVals) {
       this.secondVals = secondVals;
   }

   public int [] getAnsVals() {
       return ansVals;
   }

   public void setAnsVals(int [] ansVals) {
       this.ansVals = ansVals;
   }

   public char getType() {
       return type;
   }

   public void setType(char type) {
       this.type = type;
   }

   public int getMin() {
       return min;
   }

   public void setMin(int min) {
       this.min = min;
   }

   public int getMax() {
       return max;
   }

   public void setMax(int max) {
       this.max = max;
   }
   public int getSize() {
       return no;
       //setting the paramaters of which the calculation will follow
   }
  
  
}