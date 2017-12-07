import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonParser {


    public String inClassUrl;
    public JsonObject rootObj;

    public JsonParser() {
    }

    public JsonParser(String someUrl) {
        inClassUrl = someUrl;
    }

    private void jsonWork() throws IOException {

        URL url = new URL(getUrl());
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();
        com.google.gson.JsonParser jp = new com.google.gson.JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        rootObj = root.getAsJsonObject(); //May be an array, may be an object.
    }

    public String getUrl() {
        return inClassUrl;
    }

    public String getJsonObjectValue(String someItem) {
        return rootObj.get(someItem).getAsString();
    }

    public String getCountryCode() throws IOException {
        jsonWork();
        return rootObj.get("country_code").getAsString();
    }

    public String getIp() throws IOException {
        jsonWork();
        return rootObj.get("ip").getAsString();
    }

    public String getTimeZone() throws IOException {
        jsonWork();
        return rootObj.get("time_zone").getAsString();
    }

    public String getCountryName() throws IOException {
        jsonWork();
        return rootObj.get("country_name").getAsString();
    }
}
