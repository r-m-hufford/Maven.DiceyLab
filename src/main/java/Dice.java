import java.util.ArrayList;
import java.util.Random;

public class Dice {

    public Integer tossAndSum(int i) {
        Random random = new Random();
        Integer thisToss = 0;

        while (i >= 1) {
            int randomGen = (random.nextInt(6) + 1);
            thisToss += randomGen;
            i--;
        }
        return thisToss;
    }
}
