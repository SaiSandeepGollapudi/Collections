package org.example;

import java.util.TreeSet;

// Class representing a point with x and y coordinates
class Point implements Comparable<Point> {
    int x;
    int y;

    // Constructor to initialize the point
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // String representation of the point
    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    // Compare points based on their x and y coordinates
    public int compareTo(Point p) {
        // Compare x coordinates first
        if (this.x < p.x)
            return -1;
        else if (this.x > p.x)
            return 1;
        else {
            // If x coordinates are equal, compare y coordinates
            if (this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else
                return 0; // Points are equal
        }
    }
}

public class ComparableInterface {

    public static void main(String[] args) {

        // Create a TreeSet to store points
        TreeSet<Point> ts = new TreeSet<>();

        // Add points to the TreeSet
        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));

        System.out.println("Points in TreeSet: " + ts);
    }

}
