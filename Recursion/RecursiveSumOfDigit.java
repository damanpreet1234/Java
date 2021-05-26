import java.util.*;
public class RecursiveSumOfDigit{

    public static int SumOfDigits(String str , int idx){
        if(idx == str.length() ){
            return 0 ;
        }
        int ans = SumOfDigits(str , idx +1);
        return ans + (str.charAt(idx) - '0');
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(SumOfDigits(str , 0 )); 
    }
}
