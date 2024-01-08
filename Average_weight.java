import java.util.Scanner;
public class weight
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double x=3*w-a-b;
        
        System.out.printf("%.0f",x);
        
    }
}