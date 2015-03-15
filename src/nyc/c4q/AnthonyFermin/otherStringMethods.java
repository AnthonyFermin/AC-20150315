package nyc.c4q.AnthonyFermin;

public class otherStringMethods {

    public static void main(String[] args) {
	    String s = "Hello, world!";
        System.out.println(s.length());
        System.out.println(("Hello, " + "world!").endsWith("!"));

        System.out.println("mesquite in your cellar".replace('e','o'));
        String w = String.valueOf(42);

    }
}
