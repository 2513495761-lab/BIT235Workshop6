/**
 * Workshop 6 - Exercise 7 (Medium)
 *
 * Class Boxes: displays a square box on the console.
 *   '-' for the top and bottom lines
 *   '|' for the sides
 *
 * Required members:
 *   - a constructor that accepts the size of the box
 *   - a method that sets the size of the box
 *   - toString() that returns the size as a String, e.g. "10 x 10"
 *   - a method that draws the box to the screen
 *
 * The maximum size is 10.
 */
public class Boxes {

    private static final int MAX_SIZE = 10;

    private int size;

    // constructor accepts the size of the box
    public Boxes(int size) {
        setSize(size);
    }

    // sets the size of the box (kept between 1 and the maximum of 10)
    public void setSize(int size) {
        if (size < 1) {
            size = 1;
        }
        if (size > MAX_SIZE) {
            size = MAX_SIZE;
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    // returns the size of the box as a String, e.g. "10 x 10"
    public String toString() {
        return size + " x " + size;
    }

    // draws the box to the console
    public void draw() {
        // top line
        for (int i = 0; i < size; i++) {
            System.out.print('-');
        }
        System.out.println();

        // middle rows: '|', spaces, '|'
        for (int row = 1; row < size - 1; row++) {
            System.out.print('|');
            for (int i = 1; i < size - 1; i++) {
                System.out.print(' ');
            }
            System.out.println('|');
        }

        // bottom line
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                System.out.print('-');
            }
            System.out.println();
        }
    }
}
