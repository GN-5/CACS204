public class CannotBeGreaterThanMaximumException extends Exception {
    private String property;
    // private float value;
    private float maximumValue;

    CannotBeGreaterThanMaximumException(String prop, float val, float max) {
        this.property = prop;
        // this.value = val;
        this.maximumValue = max;
    }

    public String toString() {
        return (property + " can't have more value than max value = " + maximumValue);
    }

}
