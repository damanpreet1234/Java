import java.io.*;
import java.util.*;

public class printKPC {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = scn.nextLine();
        printKPC(str , "");

    }
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };


    public static void printKPC(String ques, String ans) {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        String codeofch = codes[ch - '0'];
        
        for(int i = 0 ; i < codeofch.length() ; i++)
        {
            char cho = codeofch.charAt(i);
            printKPC(roq , ans + cho);
        }
        
    }

}