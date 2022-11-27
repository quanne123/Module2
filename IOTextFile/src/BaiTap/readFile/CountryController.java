package BaiTap.readFile;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class CountryController {
    public static final String COUNTRY_FILE = "src/BaiTap/readFile/Country.csv" ;

    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        List<String> lineList = new ArrayList<>();
        lineList = FIleReader.readFile(COUNTRY_FILE);
        for (String line : lineList) {
            String[] methodOfCountry = line.split(",");
            Country country = new Country(Integer.parseInt(methodOfCountry[0]), methodOfCountry[1], methodOfCountry[2]);
            countryList.add(country);
        }

        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}

