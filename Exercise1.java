/**
 * Workshop 6 - Exercise 1 (Easy)
 *
 * Store the names of 10 favourite songs in an array of Strings and the
 * artist names in a second array. Output a list of the songs and artists.
 */
public class Exercise1 {

    public static void main(String[] args) {
        String[] songs = {
            "Bohemian Rhapsody",
            "Hotel California",
            "Imagine",
            "Billie Jean",
            "Like a Rolling Stone",
            "Smells Like Teen Spirit",
            "Wonderwall",
            "Hey Jude",
            "Stairway to Heaven",
            "Shape of You"
        };

        String[] artists = {
            "Queen",
            "Eagles",
            "John Lennon",
            "Michael Jackson",
            "Bob Dylan",
            "Nirvana",
            "Oasis",
            "The Beatles",
            "Led Zeppelin",
            "Ed Sheeran"
        };

        System.out.println("My 10 favourite songs:");
        System.out.println("----------------------");

        // both arrays are the same length and the same index refers to the same song
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
