import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
public class CountriesHashMapMain {
    public static void main (String[]args){
        HashMap<String, Country>countries=new HashMap<String, Country>();

        countries.put("gr", new Country("gr", "Greece", "Athens", 10_400_720));
        countries.put("cy", new Country("cy", "Cyprus", "Lefkosia", 923_272));
        countries.put("it", new Country("it", "Italy", "Rome", 58_968_501));
        countries.put("eg", new Country("eg", "Egypt", "Kairo", 107_304_000));
        countries.put("tr", new Country("tr", "Turkey", "Agkyra", 85_372_377));
        countries.put("al", new Country("al", "Albania", "Tyranna", 2_402_113));

        for(HashMap.Entry<String, Country> e:countries.entrySet()) {
            System.out.println(e.getValue());
        }
            Scanner scanner=new Scanner(System.in);
        Country country=null;
        String countryid=null;
        for(;;) {
            System.out.println("Enter countryid(x=exit): ");
            countryid = scanner.nextLine().toLowerCase();
            if (countryid.equalsIgnoreCase("x")||(countryid.equalsIgnoreCase("χ")))
              break;
            country = countries.get(countryid);
            if (country == null)
                System.out.println("Not found.");
            else
                System.out.println(country);

            String capital = null;
            System.out.println("Enter capital(x=exit): ");
            capital = scanner.nextLine();
            if (capital.equalsIgnoreCase("x")|| (capital.equalsIgnoreCase("χ")))
                break;

            for (Country c : countries.values()) {
                if (c.capital.equals(capital)) {
                    country = c;
                    break;
                }

                if (countryid != null) {
                    System.out.println(country);
                } else {
                    System.out.println("Not found.");
                }
            }
        }


        scanner.close();
        System.out.println("END OF PROGRAM.");

    }
    }


