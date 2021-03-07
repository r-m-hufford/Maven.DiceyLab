import java.util.ArrayList;
import java.util.List;

public class Simulation {
    Dice dice = new Dice();
    Bins bin = new Bins();

    private int numberOfDice;
    private int numberOfRolls;


    public Simulation (int dice, int rolls) {
        this.numberOfDice = dice;
        this.numberOfRolls = rolls;

    }

    public Integer runningSimulation() {
        int rolls = numberOfRolls;

        int total = 0;
        while (rolls > 0) {
            total += dice.tossAndSum(this.numberOfDice);
            rolls--;
        }
        System.out.println("Total: " + total);
        return total;
    }

    public void addToRollMemory() {

    }



}
