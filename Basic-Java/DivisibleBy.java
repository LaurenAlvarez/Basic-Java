//DivisibleBy.java
public class DivisibleBy {
    public static void main ( String[] args) {
        int x = Integer.parseInt (args [0]);
        int y = Integer.parseInt (args [1]);

            if (x % y == 0 ) {
                System.out.println ( x + " is divisible by " + y + ".");
            }
            else {
                System.out.println (x + " is not divisible by " + y + ".");
            }



    }
}
