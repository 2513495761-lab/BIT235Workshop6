/**
 * Workshop 6 - Exercise 3 (Medium)
 *
 * Use loops and arrays to reverse the sequence of letters in each word
 * of a sentence:
 *   "To be or not to be."  ->  "oT eb ro ton ot eb."
 *
 * Punctuation at the end of a word stays where it is, only the letters
 * are reversed.
 */
public class Exercise3 {

    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");

        String result = "";

        for (int w = 0; w < words.length; w++) {
            String word = words[w];

            // separate the trailing punctuation (e.g. the full stop)
            String letters = word;
            String punctuation = "";
            while (letters.length() > 0
                    && !Character.isLetter(letters.charAt(letters.length() - 1))) {
                punctuation = letters.charAt(letters.length() - 1) + punctuation;
                letters = letters.substring(0, letters.length() - 1);
            }

            // reverse the letters
            String reversed = "";
            for (int i = letters.length() - 1; i >= 0; i--) {
                reversed = reversed + letters.charAt(i);
            }

            result = result + reversed + punctuation;

            if (w < words.length - 1) {
                result = result + " ";
            }
        }

        System.out.println("Original : " + sentence);
        System.out.println("Reversed : " + result);
    }
}
