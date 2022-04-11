import java.io.*;
import java.util.*;

public class Main {

    static String[] keypadArr = {".;", "abc", "def","ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"} ; 

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> arrList = getKPC(str);
        System.out.println(arrList);
    }

    public static ArrayList<String> getKPC(String str) {
        ArrayList<String> finalList = new ArrayList<String>();

        if(str.length() == 1){
            int first = str.charAt(0) - '0';
            String firstStr = keypadArr[first];
            char[] firstCharArr = firstStr.toCharArray();
            ArrayList<String> resultList = new ArrayList<String>();

            for(char c : firstCharArr){
                resultList.add(c+"");
            }
            return resultList; // ["g", "h", "i"]
        }

        finalList = getKPC(str.substring(1)); // "573"

        char[] strArr = str.toCharArray();
        int first = strArr[0] - '0';
        String firstStr = keypadArr[first]; // "tu"
        char[] firstCharArr = firstStr.toCharArray();    // ['t', 'u']

        ArrayList<String> tempList = new ArrayList<String>();
        for(char c : firstCharArr){
            for(int i=0; i < finalList.size(); i++){
                tempList.add(c + finalList.get(i)); 
            }
        }
        // ["tg", "th", "ti", "ug", "uh", "ui"]


        return tempList;
    }

}
