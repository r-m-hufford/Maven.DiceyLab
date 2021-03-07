import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bins {

    public ArrayList<Integer> tossAndSumMemory = new ArrayList<Integer>();


    public void addToMemory(Integer i) {
        tossAndSumMemory.add(i);
    }


    public void clearMemory() {
        tossAndSumMemory.clear();
    }


    public void printBin() {
        System.out.println(tossAndSumMemory);
    }


    public Integer results(int numberToFind) {
        int instances = 0;
        for (int i = 0; i < tossAndSumMemory.size(); i++) {
            if (tossAndSumMemory.get(i) == numberToFind) {
                instances++;
            }
        }
        return instances;
    }

    public List<Integer> searchBinRange(int startBin, int finalBin) {
        List<Integer> searchResults = new ArrayList<Integer>();
        for (int i = startBin; i <= finalBin; i++) {
            searchResults.add(tossAndSumMemory.get(i));
        }
        return searchResults;
    }

    public Integer searchForBin(int binToFind) {
        return tossAndSumMemory.get(binToFind);
    }
}
