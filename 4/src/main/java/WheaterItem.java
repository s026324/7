import com.jaunt.Element;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class WheaterItem {

    UserAgent userAgent = new UserAgent();

    public WheaterItem() {
    }

    public WheaterItem(UserAgent userAgent) {
        this.userAgent = userAgent;
    }


    public UserAgent getUserAgent() {
        return userAgent;
    }

    public String getCityName() throws ResponseException, NotFound {
        userAgent.visit("https://www.gismeteo.lt/city/daily/4230/");
        Element div = userAgent.doc.findFirst("<h2 class=typeC>");
        String response = div.innerHTML();
        return response;
    }

    public String getWheaterTemperature() throws ResponseException, NotFound {
        userAgent.visit("https://www.accuweather.com/lt/lt/vilnius/231459/current-weather/231459?lang=lt");
        Element div = userAgent.doc.findFirst("<span class=large-temp>");
        String response = div.innerHTML();
        String test = response.split("&")[0] + "C";
        return test;
    }

    public int convertTempToInt(String s) {
        int tempInt = Integer.parseInt(s);
        return tempInt;
    }

    public int convertCelsiusToFahrenheit(int temperature) {
        int farengeit = temperature * 9 / 5 + 32;
        return farengeit;
    }

    public String convertToUppercase(String cityname) {
        cityname.toUpperCase();
        return cityname;
    }

    public String fullInfo(String cityName, String temperature) {
        return "City name: " + cityName + " Temperature: " + temperature;
    }

    public int convertCelsiusToKelvin(int celcius) {
        int kelvin = celcius + 273;
        return kelvin;
    }
}
