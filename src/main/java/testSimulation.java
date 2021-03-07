import org.junit.Assert;
import org.junit.Test;

public class testSimulation {
    Dice dice = new Dice();


    @Test
    public void testFiveRolls() {
        //expected
        Simulation sim = new Simulation(2,5);
        //method call
        Integer roll = sim.runSimulation();
        //assertion
        Assert.assertTrue(roll >= 10 && roll <= 60);
    }




}
