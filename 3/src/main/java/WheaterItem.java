import com.jaunt.UserAgent;

public class WheaterItem {

    UserAgent userAgent = new UserAgent();

    public WheaterItem() {
    }

    public WheaterItem(Object value) {
    }

    //should pass UserAgent
    public int getUserAgent() {
        return 1;
    }

    public String getCityName() {
        return "CityName";
    }

    public String getWheaterTemperature() {
        return "WheaterTemp";
    }

    public int convertTempToInt(String s) {
        return 10;
    }

    public int convertCelsiusToFahrenheit(int i) {
        return 35;
    }

    public String convertToUppercase(String cityname) {
        return "CITYNAME";
    }

    public String fullInfo(String cityName, int i) {
        return "CityName 5C";
    }

    public int convertCelsiusToKelvin(int i) {
        return 280;
    }
}
