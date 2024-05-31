public class Person {
    private Direction[] directions = new Direction[]{
            new Direction(0, 1),
            new Direction(-1, 1),
            new Direction(-1, 0),
            new Direction(-1, -1),
            new Direction(0, -1),
            new Direction(1, -1),
            new Direction(1, 0),
            new Direction(1, 1)
    };
    private int i, j, index;

    public Person(int i, int j, int index) {
        this.i = i;
        this.j = j;
        this.index = index;

    }

    public void walk(int step) {
        i += step * directions[index].getRow();
        j += step * directions[index].getCol();
    }

    public void changeDirection() {
        index = (index + 1) % 8;
    }

    public Direction[] getDirections() {
        return directions;
    }

    public void setDirections(Direction[] directions) {
        this.directions = directions;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
