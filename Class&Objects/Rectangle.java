import java.io.Serializable;

class Rectangle extends Shape implements Serializable {

    protected int length;
    protected int breadth;
    protected boolean isSquare = false;
    private static int count = 0;

    Rectangle() {
        count++;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        count++;
    }

    Rectangle(int length, boolean isSqr) {
        this.length = length;
        this.isSquare = isSqr;
        count++;
    }

    long calcArea() {
        return length * breadth;
    }

    long calcPerimeter() {
        if (isSquare)
            return 4 * length;

        else
            return (2 * (length + breadth));
    }

    void setDim(int length, int breadth) throws NegativeNumberException {

        if (length < 0) {
            throw new NegativeNumberException("length", length);
        } else if (breadth < 0) {
            throw new NegativeNumberException("breadth", breadth);
        } else {
            this.length = length;
            this.breadth = breadth;
        }

    }

    void setDim(int length, boolean isSqr) {
        this.length = length;
        this.isSquare = isSqr;
    }

    public static int getCount() {
        return count;
    }

    public void setLength(int l) {
        this.length = l;
    }

    public void setBreadth(int b) {
        this.breadth = b;
    }

    public boolean isEqual(Rectangle rect) {
        return ((this.length == rect.length) && (this.breadth == rect.breadth));
    }

    public String toString() {
        return "Rectangle with length " + this.length + " and breadth " + this.breadth;
    }
}