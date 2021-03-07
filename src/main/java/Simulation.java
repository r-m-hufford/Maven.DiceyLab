import java.util.ArrayList;
import java.util.List;


public class Simulation {
    Dice dice = new Dice();
    Bins bin = new Bins();

    private int numberOfDice;
    private int numberOfRolls;

    private ArrayList<Integer> simulationMemory = new ArrayList<Integer>();
    int[] simResults = new int[11];

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
        return total;
    }

    public void printResults() {

        for (int i = 0; i < simulationMemory.size(); i++) {
            if (simulationMemory.get(i) == 2) {
                simResults[0]++;
            } else if (simulationMemory.get(i) == 3) {
                simResults[1]++;
            } else if (simulationMemory.get(i) == 4) {
                simResults[2]++;
            } else if (simulationMemory.get(i) == 5) {
                simResults[3]++;
            } else if (simulationMemory.get(i) == 6) {
                simResults[4]++;
            } else if (simulationMemory.get(i) == 7) {
                simResults[5]++;
            } else if (simulationMemory.get(i) == 8) {
                simResults[6]++;
            } else if (simulationMemory.get(i) == 9) {
                simResults[7]++;
            } else if (simulationMemory.get(i) == 10) {
                simResults[8]++;
            } else if (simulationMemory.get(i) == 11) {
                simResults[9]++;
            } else {
                simResults[10]++;
            }
        }

        String two = String.format("% d :   % d:  %.2f %s", 2, simResults[0], (float)simResults[0]/1000000);
        String three = String.format("% d :   % d:  %.2f *****", 3, simResults[1], (float)simResults[1]/1000000);
        String four = String.format("% d :   % d:  %.2f ********", 4, simResults[2], (float)simResults[2]/1000000);
        String five = String.format("% d :   %d:  %.2f ***********", 5, simResults[3], (float)simResults[3]/1000000);
        String six = String.format("% d :   %d:  %.2f *************", 6, simResults[4], (float)simResults[4]/1000000);
        String seven = String.format("% d :   %d:  %.2f ****************", 7, simResults[5], (float)simResults[5]/1000000);
        String eight = String.format("% d :   %d:  %.2f *************", 8, simResults[6], (float)simResults[6]/1000000);
        String nine = String.format("% d :   %d:  %.2f ***********", 9, simResults[7], (float)simResults[7]/1000000);
        String ten = String.format("%d :   % d:  %.2f ********", 10, simResults[8], (float)simResults[8]/1000000);
        String eleven = String.format("%d :   % d:  %.2f *****", 11, simResults[9], (float)simResults[9]/1000000);
        String twelve = String.format("%d :   % d:  %.2f **", 12, simResults[10], (float)simResults[10]/1000000);


        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
        System.out.println(ten);
        System.out.println(eleven);
        System.out.println(twelve);

    }

    public String stars(int n) {

        String stars = "";
        int divided = simResults[n] / 10000;

        for (int i = 0; i < divided; i++) {
            stars += "*";
        }
        return stars;
    }

    public void printStars() {
        System.out.println(stars(0));
    }
}