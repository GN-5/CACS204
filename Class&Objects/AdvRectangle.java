public class AdvRectangle extends Rectangle {

    private int borderWidth;

    AdvRectangle() {
        super();
    };

    AdvRectangle(int l, int b, int bW) {
        super(l, b);
        this.borderWidth = bW;
    }

    public int getborderWidth() {
        return this.borderWidth;
    }

    public long calcArea() {
        if (super.length > 0 && super.breadth > 0) {
            return super.calcArea();
        } else {
            System.out.println("error");
        }
        return 0;
    }
}
