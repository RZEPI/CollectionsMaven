import java.util.Comparator;

public class MagesComparePower implements Comparator<Mage> {
    MagesComparePower(){};
    @Override
    public int compare(Mage firstMage, Mage secondMage)
    {
        return Double.compare(secondMage.getPower(), firstMage.getPower());
    }
}
