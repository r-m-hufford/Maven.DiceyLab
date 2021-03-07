import org.junit.Assert;
import org.junit.Test;

public class testDice {
    Dice dice = new Dice();
    @Test
    public void testFiveRolls() {
        //expected

        //method call
        Integer roll = dice.tossAndSum(5);
        //assertion
        Assert.assertTrue(roll >= 5 && roll <= 30);

    }

    @Test
    public void testOneRoll() {
        //expected

        //method call
        Integer roll = dice.tossAndSum(1);
        //assertion
        Assert.assertTrue(roll >= 1 && roll <= 6);

    }

    @Test
    public void testThousandRolls() {
        //expected

        //method call
        Integer roll = dice.tossAndSum(1000);
        //assertion
        Assert.assertTrue(roll >= 1000 && roll <= 6000);

    }

    @Test
    public void testTenThousandRolls() {
        //expected

        //method call
        Integer roll = dice.tossAndSum(10000);
        //assertion
        Assert.assertTrue(roll >= 10000 && roll <= 60000);

    }


}
