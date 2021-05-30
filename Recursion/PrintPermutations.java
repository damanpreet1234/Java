import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str  = scn.nextLine();
        
        printPermutations(str , "");

    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0)
        {
            System.out.println(asf);
            return ;
        }
        for(int i = 0 ; i < str.length(); i++ )
        {
            char ch = str.charAt(i);
            String leftpart = str.substring(0 , i);
            String rightpart = str.substring(i + 1);
            String ros = leftpart + rightpart;
            printPermutations(ros , asf + ch);
        }
        
    }

}