import java.util.Scanner;
public class ReverseNum {
   public static void main(String[] args) {
//     int num = 123456, reverse = 0;  
// //we have not mentioned the initialization part of the for loop  
// for( ;num != 0; num=num/10)   
// {  
// int remainder = num % 10;  
// reverse = reverse * 10 + remainder;  
// }  
// System.out.println("The reverse of the given number is: " + reverse);  


   int num;
   Scanner sc=new Scanner(System.in);
   System.out.println("entre the num");
   num=sc.nextInt();
   int result=0;
   while(num!=0){
    int remender=num%10;
   result=result*10+remender;
   num=num/10;

   }
   System.out.println("reverse of digit is  "+result);

   } 
   } 




