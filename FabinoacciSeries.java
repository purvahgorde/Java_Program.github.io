import java.util.Scanner;
class FabinoacciSeries{
    public static void main(String[] args) {
        int i,n,a=0,b=1,c;
        Scanner sc=new Scanner (System.in);
        System.out.println("Entre the number");
        n=sc.nextInt();
        System.out.println(" "+a);
        System.out.println(" "+b);
        for(i=2;i<n;i++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}