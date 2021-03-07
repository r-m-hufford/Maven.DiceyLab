import java.util.ArrayList;
import java.util.List;

public class Simulation {
    Dice dice = new Dice();
    Bins bin = new Bins();

    private int numberOfDice;
    private int numberOfRolls;

    private ArrayList<Integer> simulationMemory = new ArrayList<Integer>();

    public Simulation(int dice, int rolls) {
        this.numberOfDice = dice;
        this.numberOfRolls = rolls;

    }

    public Integer runSimulation() {
        int rolls = numberOfRolls;

        int total = 0;
        while (rolls > 0) {
            int thisRoll = dice.tossAndSum(this.numberOfDice);
            total += thisRoll;
            simulationMemory.add(thisRoll);
            rolls--;
        }
        System.out.println("Total: " + total);
        return total;
    }

    public void printResults() {
        System.out.println(simulationMemory);

        String twos = "";
        String threes = "";
        String fours = "";
        String fives = "";
        String sixes = "";
        String sevens = "";
        String eights = "";
        String nines = "";
        String tens = "";
        String elevens = "";
        String twelves = "";

        for (int i = 0; i < simulationMemory.size(); i++) {
            if (simulationMemory.get(i) == 2) {
                twos += "*";
            } else if (simulationMemory.get(i) == 3) {
                threes += "*";
            } else if (simulationMemory.get(i) == 4) {
                fours += "*";
            } else if (simulationMemory.get(i) == 5) {
                fives += "*";
            } else if (simulationMemory.get(i) == 6) {
                sixes += "*";
            } else if (simulationMemory.get(i) == 7) {
                sevens += "*";
            } else if (simulationMemory.get(i) == 8) {
                eights += "*";
            } else if (simulationMemory.get(i) == 9) {
                nines += "*";
            } else if (simulationMemory.get(i) == 10) {
                tens += "*";
            } else if (simulationMemory.get(i) == 11) {
                elevens += "*";
            } else {
                twelves += "*";
            }
        }
            System.out.println(twos);
            System.out.println(threes);
            System.out.println(fours);
            System.out.println(fives);
            System.out.println(sixes);
            System.out.println(sevens);
            System.out.println(eights);
            System.out.println(nines);
            System.out.println(tens);
            System.out.println(elevens);
            System.out.println(twelves);

    }
}