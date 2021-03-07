import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
        Dice dice = new Dice();
        Bins results = new Bins();
        Simulation sim = new Simulation(2,1000000);

        sim.runSimulation();
        sim.printResults();

    }
}
