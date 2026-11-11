/**
 * Workshop 6 - Exercise 2 (Hard)
 *
 * Modify Exercise 1 so the songs are output in alphabetical order.
 * Hint: bubble sort.
 *
 * When two songs are swapped, the artists must be swapped too,
 * otherwise the song and artist would no longer match.
 */
public class Exercise2 {

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

        // bubble sort on the song names
        for (int pass = 0; pass < songs.length - 1; pass++) {
            for (int i = 0; i < songs.length - 1 - pass; i++) {
                if (songs[i].compareToIgnoreCase(songs[i + 1]) > 0) {
                    // swap the songs
                    String tempSong = songs[i];
                    songs[i] = songs[i + 1];
                    songs[i + 1] = tempSong;

                    // swap the artists in exactly the same way
                    String tempArtist = artists[i];
                    artists[i] = artists[i + 1];
                    artists[i + 1] = tempArtist;
                }
            }
        }

        System.out.println("My 10 favourite songs (alphabetical):");
        System.out.println("-------------------------------------");

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
