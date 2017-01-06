import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * Created by Михаил on 06.01.2017.
 */
public class CountryTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input file name: ");
        String filename = sc.next();
        File f = new File(filename);
        Scanner scanner = new Scanner(f);

        while (scanner.hasNextLine()) {
            String line = scanner.next();
            Scanner scStr = new Scanner(line);

            String country = "";
            if (scStr.hasNext()) {
                country = scStr.next();
            } else {
                System.exit(1);
            }

            double area = 0;
            if (scStr.hasNextDouble()) {
                area = scStr.nextDouble();
            } else {
                System.exit(1);
            }

            int population = 0;
            if (scStr.hasNextInt()) {
                population = scStr.nextInt();
            } else {
                System.exit(1);
            }

            Country c = new Country(country, area, population);
        }
    }
}
