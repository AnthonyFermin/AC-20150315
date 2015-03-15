package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/15/15.
 */

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String reverseThis){
        String reversedString = "";
        for(int i = reverseThis.length() - 1; i >= 0; i--){
            reversedString += reverseThis.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args){
        System.out.println(reverseString("Hello, world!"));
    }
}
