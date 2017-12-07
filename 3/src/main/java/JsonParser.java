import com.google.gson.JsonObject;

public class JsonParser {


    public String inClassUrl;
    public JsonObject rootObj;

    public JsonParser() {
    }

    public JsonParser(String someUrl) {
        inClassUrl = someUrl;
    }

    public String getUrl() {
        return "https://play.google.com/store/apps/details?id=com.facebook.katana";
    }

    public String getJsonObjectValue() {
        return "Value";
    }

    public String getCountryCode() {
        return "SomeCountryCodeInStringFormat";
    }

    public String getIp() {
        return "ip";
    }

    public String getTimeZone() {
        return "TimeZone";
    }

    public String getCountryName() {
        return "ContryName";
    }
}
