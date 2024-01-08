import java.util.Scanner;
public class cap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=a*b*c;
        System.out.printf("%.0f KB",s);
        
    }
}