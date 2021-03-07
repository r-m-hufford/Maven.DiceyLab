import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class testBin {
    Dice dice = new Dice();
    Bins bin = new Bins();


    @Test
    public void addMemoryTest() {
        //given
        bin.addToMemory(dice.tossAndSum(2));
        bin.addToMemory(dice.tossAndSum(2));
        bin.addToMemory(dice.tossAndSum(2));
        //when

        //then
        Assert.assertTrue(bin.tossAndSumMemory.size() == 3);
        bin.clearMemory();
    }

    @Test
    public void clearMemoryTest(){
        bin.addToMemory(dice.tossAndSum(2));
        bin.addToMemory(dice.tossAndSum(2));
        bin.addToMemory(dice.tossAndSum(2));
        //when
        bin.clearMemory();
        //then
        Assert.assertTrue(bin.tossAndSumMemory.size() == 0);

    }

}
