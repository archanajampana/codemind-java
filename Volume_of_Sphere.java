import java.util.Scanner;
public class vol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double area=(4.0/3.0)*3.14*r*r*r;
        
        System.out.printf("%.2f",area);
        
    }
}