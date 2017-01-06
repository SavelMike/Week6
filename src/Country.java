/**
 * Created by Михаил on 06.01.2017.
 */
public class Country {

    private String name;
    private double area;
    private int population;

    public Country(String n, double a, int pop) {
        name = n;
        area = a;
        population = pop;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public String toString() {
        return "Name: " + name + ", area: " + area + ", population: " + population;
    }
}
