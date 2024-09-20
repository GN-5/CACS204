public class NegativeNumberException extends Exception {

    private String property;
    private float value;

    NegativeNumberException(String prop, float val) {
        this.property = prop;
        this.value = val;
    }

    public String toString() {
        return (property + " can't have negative value " + value);
    }

}
