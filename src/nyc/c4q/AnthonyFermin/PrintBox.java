package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/15/15.
 */
public class PrintBox {

    public static void stringInBox(String text){
        System.out.print("+");
        Repeat.repeatChar('-', text.length() + 2);
        System.out.println("+");
        System.out.println("| " + text + " |");
        System.out.print("+");
        Repeat.repeatChar('-', text.length() + 2);
        System.out.println("+");


    }

    public static void main(String[] args){

        stringInBox("Hello World!");

    }

}
