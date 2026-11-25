public class Country{
    String countryid;
    String country;
    String capital;
    long population;

    public Country(String countryid, String country, String capital, long population){
        this.countryid=countryid;
        this.country=country;
        this.capital=capital;
        this.population=population;
    }
    @Override
    public String toString() {
        return "countryid:" + countryid + "\ncountry:" + country + "\ncapital:" + capital + "\npopulation:"+ population + "\n";
    }
}