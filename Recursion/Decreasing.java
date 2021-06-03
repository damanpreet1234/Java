import java.util.*;
public class Decreasing{
    public static Scanner scn = new Scanner(System.in);
    public static void  dec(int n)
    {
        if(n == 0) return ;
        System.out.println(n);
        dec(n-1);
        
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        dec(n);
    }
}