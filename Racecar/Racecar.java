import java.lang.Comparable;

class Racecar extends Car implements Comparable {
    private int fuel;
    transient private int fuelDrainageRate;
    private int speed;
    int distanceDriven;
    int raceTime;
    int time = 0;
    static String color = ("red, blue, green, white, black");
    long efficiency;
    final int numberOfWheels = 4;
    final int maxSpeed = 50;

    int fuelConsumed = fuel;

    Racetrack r1 = new Racetrack();

    Racecar() {
    }

    Racecar(int fuel, int drain, int speed) {

        this.fuel = fuel;
        this.fuelDrainageRate = drain;
        this.speed = speed;

        if (speed > maxSpeed) {
            System.out.println("Speed can't be more than Max Speed");
        }

    }

    public void setSpeed(int speed) throws NegativeNumberException, CannotBeGreaterThanMaximumException {
        if (speed < 0) {
            throw new NegativeNumberException("speed", speed);
        } else if (speed > maxSpeed) {
            throw new CannotBeGreaterThanMaximumException("speed", speed, maxSpeed);
        } else {
            this.speed = speed;
        }
    }

    public void setFuel(int fuel) throws NegativeNumberException {
        if (fuel < 0) {
            throw new NegativeNumberException("fuel", fuel);
        } else {
            this.fuel = fuel;
        }
    }

    public void setFuelDrainageRate(int FDR) throws NegativeNumberException, CannotBeGreaterThanMaximumException {
        if (FDR < 0) {
            throw new NegativeNumberException("Fuel Drainage Rate", FDR);
        } else {
            this.fuelDrainageRate = FDR;
        }
    }

    public void startRace(Racetrack r1) {

        while (this.carDrive() != 0) {

            if (r1.distance != 0) {
                r1.distance = r1.distance - this.carDrive();
                time = time + 1;
            }

        }
        this.raceTime = time;

        if (r1.distance == 0) {
            System.out.println("You finished the race!");

        }

        else {
            System.out.println("You did not finish the race. The remaining distance until finish is " + r1.distance);
        }

    }

    static String getAvailableColors() {
        return color;

    }

    long getRaceTime() {
        return this.raceTime;
    }

    int carDrive() {

        distanceDriven = 0;

        distanceDriven = distanceDriven + speed;

        fuelConsumed = fuelConsumed - fuelDrainageRate;

        if (fuelConsumed != 0) {

            return distanceDriven;

        }

        else
            return 0;

    }

    public long carFuelEfficiency() {

        efficiency = (this.raceTime * this.speed) / this.fuel;
        return efficiency;
    }

    // public int carAccelerate() {

    // for (int i = 0; i < raceTime; i++) {
    // int speed = this.speed + 2;

    // if (speed > maxSpeed) {
    // return i;
    // } else {
    // return speed;
    // }
    // }
    // }

    public String toString() {
        return "Car with speed = " + this.speed + " fuel = " + this.fuel;
    }

    public int compareTo(Object o) {
        if(this.speed > o.speed){

        }
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        return 0;
    }

}
