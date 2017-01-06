import java.util.ArrayList;

/**
 * Created by Михаил on 06.01.2017.
 */
public class CountrySet {

    ArrayList<Country> countries;

    public CountrySet() {
        countries = new ArrayList<>();
    }

    public void addCountry(Country c) {
        countries.add(c);
    }

    public Country LargestPopulation() {
        Country currentPop = countries.get(0);
        for (int i = 0; i < countries.size(); i++) {
            if (currentPop.getPopulation() < countries.get(i).getPopulation()) {
                currentPop = countries.get(i);
            }
        }
        return currentPop;
    }

    public Country LargestArea() {
        Country currentAr = countries.get(0);
        for (int i = 0; i < countries.size(); i++) {
            if (currentAr.getArea() < countries.get(i).getArea()) {
                currentAr = countries.get(i);
            }
        }
        return currentAr;
    }

    public Country LargestPopDensity() {
        Country currentDen = countries.get(0);
        for  (int i = 0; i < countries.size(); i++) {
            if (currentDen.getPopulation()/currentDen.getArea() < countries.get(i).getPopulation()/countries.get(i).getArea()) {
                currentDen = countries.get(i);
            }
        }
        return currentDen;
    }
}
