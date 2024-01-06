import java.util.Scanner;
public class HypClass{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double ans=Math.hypot(a,b);
        System.out.printf("%.2f",ans);
        
    }
}