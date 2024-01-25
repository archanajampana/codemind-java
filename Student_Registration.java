import java.util.Scanner;
public class StudentReg{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int y=(int)Math.abs(b-c);
            if(y>=a)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}