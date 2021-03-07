import org.junit.Assert;
import org.junit.Test;

public class testSimulation {
    Dice dice = new Dice();


    @Test
    public void testInRange() {
        //expected
        Simulation sim = new Simulation(2,5);
        //method call
        Integer roll = sim.runSimulation();
        //assertion
        Assert.assertTrue(roll >= 10 && roll <= 60);
    }

    @Test
    public void testOutOfRange() {
        //expected
        Simulation sim = new Simulation(2,5);
        //method call
        Integer roll = sim.runSimulation();
        //assertion
        Assert.assertFalse(roll <= 10 && roll >= 60);
    }




}
