import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) {
         int mark1,mark2,mark3,mark4,mark5,total; float average; 
         Scanner input=new Scanner(System.in); 
         System.out.println("enter the subject mark:"); 
         mark1=input.nextInt(); 
         mark2=input.nextInt(); 
         mark3=input.nextInt(); 
         mark4=input.nextInt(); 
         mark5=input.nextInt(); 
         total=mark1+mark2+mark3+mark4+mark5; 
         average=total/5;
          System.out.println("total mark:"+ total+" "+"and the average is:"+average); 
          if(average==100)
          {
             System.out.println("you are the topper"); } 
             else if(average>=90&&average<100)
             { System.out.println("you scored good marks");
              } 
              else if(average>=80&&average<90)
              { 
                System.out.println("distinction");

                } else if(average>=70&&average<80)
                 { 
                    System.out.println("first class"); 
                    } 
                    else
                     { System.out.println("failed"); 
                     } } }