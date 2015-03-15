package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/15/15.
 */


public class RepeatString {

    public static String stringRepeat(String text, int resultLength){
        String result = "";

        for(int i = 0; i < resultLength;){

            for(int j = 0; j < text.length(); j++){
                if (i < resultLength){
                    result += text.charAt(j);
                    i++;
                }else{ //stops inner loop from running if this is false
                    break;
                }

            }

        }

        return result;
    }


    public static void main(String[] args){
        System.out.println(stringRepeat("Anthony Fermin", 15));



    }
}
