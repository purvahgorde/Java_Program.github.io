import java.util.Scanner;
class Palindrome{
 public static void main(String[] args) {
    int i, n,temp,sum=0;
    System.out.println("entre the number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    temp=n;    
    while(n>0){    
     i=n%10;  //getting remainder  
     sum=(sum*10)+i;    
     n=n/10;    
    }    
    if(temp==sum)    
     System.out.println("palindrome number ");    
    else    
     System.out.println("not palindrome");    
  }  

 }   
