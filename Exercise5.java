/**
 * Workshop 6 - Exercise 5 (Medium)
 *
 * Search engine: search for a phrase inside an array of 10 paragraphs.
 * If the phrase is found, print the index and the paragraph.
 * If it is not found, print a message saying so.
 */
public class Exercise5 {

    public static void main(String[] args) {
        String[] paragraphs = {
            "Lose all the weight you want.",
            "I can't I must work",
            "That would be like a keyword search.",
            "This would be Victoria.",
            "Join the party.",
            "To be or not to be.",
            "That is a question to test keyword search.",
            "Can you find a needle in a hay stack?",
            "This could be the last paragraph, but its not.",
            "Ada Lovelace is the worlds first programmer as of 1860."
        };

        // change this phrase to search for something else
        String phrase = "keyword search";

        boolean found = false;

        System.out.println("Searching for: \"" + phrase + "\"");
        System.out.println();

        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].contains(phrase)) {
                System.out.println("Found at index " + i + ":");
                System.out.println("   " + paragraphs[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("The phrase \"" + phrase + "\" was NOT found in any paragraph.");
        }
    }
}
