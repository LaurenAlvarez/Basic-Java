//ReplaceOddWords.java

public class ReplaceOddWords {
    public static void main (String[] args) {
        int numOfArgs = args.length;
            for (int i = 0; i < numOfArgs; i++) {
                if (i % 2 == 0) {
                    System.out.print (args[i] + " and. ");
                }
            }
        }
    }
