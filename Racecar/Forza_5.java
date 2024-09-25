import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Forza_5 implements Serializable {

    public static void main(String args[]) {

        Racetrack Monaco = new Racetrack(500);

        Racecar McLaren = new Racecar(100, 10, 25);

        Racecar Pugeot = new Racecar();

        try {
            Pugeot.setFuel(100);
            Pugeot.setFuelDrainageRate(5);
            Pugeot.setSpeed(30);
        }

        catch (NegativeNumberException ex) {
            System.out.println(ex.toString());
        }

        catch (CannotBeGreaterThanMaximumException ex) {
            System.out.println(ex.toString());
        }

        McLaren.startRace(Monaco);

        System.out.println("The available colors are " + Racecar.getAvailableColors());

        System.out.println("The fuel efficiency for McLaren is " + McLaren.carFuelEfficiency());

        Pugeot.startRace(Monaco);
        System.out.println("The racetime for Pugeot is " + Pugeot.getRaceTime());

           try (ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("racecar.bin"))) {
            Racecar Tesla = new Racecar(50, 100, 10);
            op.writeObject(Tesla);
            System.out.println(Tesla);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

}
