public class SpeedLimitExceededException extends Exception {

    private int value;
    private int maximumValue;

    SpeedLimitExceededException(int val, int max) {
        this.value = val;
        this.maximumValue = max;
    }

    public String toString() {
        return ("Your speed " + value + " has exceeded the speed limit of " + maximumValue);
    }
}
