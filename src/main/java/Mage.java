import java.util.*;
public class Mage implements Comparable<Mage> {
    private static int type;
    private static final MagesComparePower alternativeCompare = new MagesComparePower();
    private final String  name;
    private final int level;
    private final double power;
    private Set<Mage> apprentices;
    private Map<Mage,Integer> statistics;

    public Mage(String name, int level, double power)
    {
        this.name = name;
        this.level = level;
        this.power = power;
        this.setCollections();
    }

    public void setCollections()
    {
        if (type == 0)
        {
            this.apprentices = new HashSet<Mage>();
            this.statistics = new HashMap<Mage, Integer>();
        }
        else if(type == 1)
        {
            this.apprentices = new TreeSet<Mage>();
            this.statistics = new TreeMap<Mage, Integer>();
        }
        else
        {
            this.apprentices = new TreeSet<Mage>(alternativeCompare);
            this.statistics = new TreeMap<Mage, Integer>(alternativeCompare);
        }
    }


    public static void setType(int _type)
    {
        type = _type;
    }

    public double getPower() {
        return power;
    }

    public int getLevel() {
        return level;
    }

    public void addApprentice(Mage apprentice)
    {
        this.apprentices.add(apprentice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mage mage = (Mage) o;
        return level == mage.level && Double.compare(mage.power, power) == 0 && Objects.equals(name, mage.name) && Objects.equals(apprentices, mage.apprentices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, power, apprentices);
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Mage mg)
    {
        return Integer.compare(this.getLevel(), mg.getLevel());
    }


    public void printStructure(String depth)
    {
        System.out.println(depth+this);
        for (Mage apprentace :this.apprentices) {
            apprentace.printStructure(depth+"-");
        }
    }

    public void printStats()
    {
        System.out.println(statistics);
    }

    public int countStats()
    {
        int counter = 0;
        for (Mage apprentice: this.apprentices) {
            counter += apprentice.countStats();
            counter++;
        }
        this.statistics.put(this, counter);
        return counter;
    }
}
