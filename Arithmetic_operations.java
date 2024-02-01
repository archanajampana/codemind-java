import java.util.Scanner;
public class ArithmeticOperations{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=a+b;
        int q=a-b;
        int r=a*b;
        int s=a/b;
        int t=a%b;
        System.out.printf("Sum:%d
Difference:%d
Product:%d
Quotient:%d
Remainder:%d
",p,q,r,s,t);
    }
}