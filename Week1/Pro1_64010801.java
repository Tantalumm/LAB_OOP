package Week1;

import java.net.SecureCacheResponse;

public class Pro1_64010801 {
    public static void main(String[] args) {
        double BirthRate = 7.0;
        double DeathRate = 13.0;
        double NewImmigrant = 45.0;

        double CurrentPopulation = 312032486;

        double SecondinYear = 60 * 60 * 24 *365;

        double numBirth = SecondinYear / BirthRate;
        double numDeaths = SecondinYear / DeathRate;
        double numImmigrant = SecondinYear / NewImmigrant;

        CurrentPopulation += numBirth + numImmigrant - numDeaths;
        System.out.println(" 1 Year = " + (int)CurrentPopulation);
        CurrentPopulation += numBirth + numImmigrant - numDeaths;
        System.out.println(" 2 Year = " + (int)CurrentPopulation);
        CurrentPopulation += numBirth + numImmigrant - numDeaths;
        System.out.println(" 3 Year = " + (int)CurrentPopulation);
        CurrentPopulation += numBirth + numImmigrant - numDeaths;
        System.out.println(" 4 Year = " + (int)CurrentPopulation);
        CurrentPopulation += numBirth + numImmigrant - numDeaths;
        System.out.println(" 5 Year = " + (int)CurrentPopulation);
    }
}
