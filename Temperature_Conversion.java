import java.util.Scanner;
public class TempConv{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float temp=32+(c*9/5);
        System.out.printf("%.2f",temp);
    }
}