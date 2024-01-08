import java.util.Scanner;
public class area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=(a+b+c)/2;
        double p=s*(s-a)*(s-b)*(s-c);
        double x=Math.sqrt(p);
        System.out.printf("%.2f",x);
        
    }
}