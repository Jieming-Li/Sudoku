package sudoku.problemdomain;

import java.util.Objects;

//used as keys in a hashmap to keep track of UI elements
public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //help to store coordinate objects in a hash map
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x &&
                y == that.y;
    }

    //unique identifier generated from x and y
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
