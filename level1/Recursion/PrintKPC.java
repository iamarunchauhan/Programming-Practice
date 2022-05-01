import java.io.*;
import java.util.*;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
    }


    static String[] keypadArr = {".;", "abc", "def","ghi", 
    "jkl", "mno", "pqrs", "tu", "vwx", "yz"} ; 

    public static void printKPC(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char firstChar = str.charAt(0);
        String remChar = str.substring(1);

        String keyCharLen = keypadArr[firstChar - '0'];
        for(int i=0; i<keyCharLen.length(); i++){
            char ch = keyCharLen.charAt(i);
            printKPC(remChar, ans+ch);
        }
    }

}