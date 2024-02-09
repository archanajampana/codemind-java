import java.util.*;
public class CamelCaseCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        char[] arr=s.toCharArray();
        for(int i=1;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                c++;
            }
        }
        System.out.print(c+1);
        
    }
}