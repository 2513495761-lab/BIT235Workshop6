/**
 * Workshop 6 - Exercise 7 (Medium)
 *
 * Driver class: contains main() and tests the Boxes class.
 */
public class BoxDriver {

    public static void main(String[] args) {
        // test the toString() method
        Boxes smallBox = new Boxes(4);
        Boxes largeBox = new Boxes(10);

        System.out.println("Box size: " + smallBox);
        smallBox.draw();

        System.out.println();
        System.out.println("Box size: " + largeBox);
        largeBox.draw();

        // test the setSize() method
        smallBox.setSize(6);
        System.out.println();
        System.out.println("After setSize(6): " + smallBox);
        smallBox.draw();

        // size above the maximum is limited to 10
        smallBox.setSize(25);
        System.out.println();
        System.out.println("After setSize(25): " + smallBox);
    }
}
