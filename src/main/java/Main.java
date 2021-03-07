import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
        Dice dice = new Dice();
        Bins bins = new Bins();
        Simulation sim = new Simulation(2,5);

        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));
        bins.addToMemory(dice.tossAndSum(2));

        bins.printBin();
        System.out.println(bins.results(10));
    }
}
