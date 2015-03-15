package nyc.c4q.AnthonyFermin;

/**Anthony Fermin
 *Displays count of a user inputted character contained within user inputted string
 * Created by c4q-anthonyf on 3/15/15.
 */
import java.util.Scanner;

public class CountString {

    public static int searchString(String text, char toSearch){
        int count = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == toSearch){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string you want to search");
        String searchThis = in.nextLine().toLowerCase();

        System.out.print("Enter the character you want to count: ");
        char charToCount = in.next().toLowerCase().charAt(0);
        System.out.println("Amount of char '" + charToCount + "' in your string: " + searchString(searchThis, charToCount));


    }


}
