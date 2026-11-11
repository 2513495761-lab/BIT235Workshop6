/**
 * Workshop 6 - Exercise 4 (Easy)
 *
 * Decode the coded message "G tgsl Qefe." using the key
 *
 *   a b c d e f g h i j k l m n o p q r s t u v w x y z
 *   c r g z a v i b s d o e q f h u j x k l w m y n p t
 *
 * Each letter of the coded message is looked up in the alphabet and the
 * letter in the same position of the key is the decoded letter.
 * To decode a different message only the message variable has to change.
 */
public class Exercise4 {

    public static void main(String[] args) {
        String codedMessage = "G tgsl Qefe.";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String key      = "crgzavibsdoeqfhujxklwmynpt";

        String decoded = "";

        for (int i = 0; i < codedMessage.length(); i++) {
            char letter = codedMessage.charAt(i);

            // find the letter in the alphabet (ignore upper/lower case)
            int position = alphabet.indexOf(Character.toLowerCase(letter));

            if (position == -1) {
                // not a letter (space, full stop, ...) - keep it unchanged
                decoded = decoded + letter;
            } else {
                char plainLetter = key.charAt(position);

                // keep the original capitalisation
                if (Character.isUpperCase(letter)) {
                    plainLetter = Character.toUpperCase(plainLetter);
                }
                decoded = decoded + plainLetter;
            }
        }

        System.out.println("Coded message   : " + codedMessage);
        System.out.println("Decoded message : " + decoded);
    }
}
