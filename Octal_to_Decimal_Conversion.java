import java.util.Scanner;
public class OctalToDecimal{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=Integer.parseInt(s,8);
        System.out.println(n);
        
    }
}