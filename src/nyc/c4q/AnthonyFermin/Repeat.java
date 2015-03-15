package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

/**
 * Created by c4q-anthonyf on 3/15/15.
 */
public class Repeat {

    public static void repeatChar(char repeatThis, int number){
        String repeatedChars = "";

        for(int i = 0; i < number; i++){
            System.out.print(repeatThis);
        }


    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Type a character to repeat: ");
        char toRepeat = in.next().charAt(0);

        System.out.print("Type in how many times to repeat: ");
        int numOfRepeat = in.nextInt();

        repeatChar(toRepeat, numOfRepeat);




    }
}
