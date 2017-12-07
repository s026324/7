import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

import java.io.IOException;

public class MainProgram {
    //variables
    public static UserAgent userAgent = new UserAgent();
    public static String appLink = "https://play.google.com/store/apps/details?id=free.wordgames.cat.dog.goat.horse.bear.guess.awesome.babygames.good.time.animals";
    //Classes
    public static AppStatistics appStatistics = new AppStatistics(appLink);
    public static JsonParser jsonParser = new JsonParser("http://freegeoip.net/json/");
    public static WheaterItem  wheter = new WheaterItem(userAgent);

    public static void main(String[] args) throws NotFound, ResponseException, IOException {
        System.out.println("******************************************************");
        System.out.println("App statistic");
        System.out.println(appStatistics.getAppName());
        System.out.println(appStatistics.getDownloadsSize());
        System.out.println(appStatistics.getOneStringInfo(appStatistics.getAppName(),appStatistics.getDownloadsSize()));
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println("JsonParser");
        System.out.println(jsonParser.getIp());
        System.out.println(jsonParser.getCountryName());
        System.out.println(jsonParser.getCountryCode());
        System.out.println(jsonParser.getTimeZone());
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println("WheaterItem");
        System.out.println(wheter.getCityName());
        System.out.println("Celsius: "+wheter.getWheaterTemperature());
        String[] string = wheter.getWheaterTemperature().split("C");
        String stringNext = string[0];
        int celsius = Integer.parseInt(stringNext);
        System.out.println("Fahrenheit: " + wheter.convertCelsiusToFahrenheit(celsius));
        System.out.println("Kelvin: " + wheter.convertCelsiusToKelvin(celsius));
        System.out.println("******************************************************");
    }
}
