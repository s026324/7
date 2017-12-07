import com.google.gson.JsonObject;
import org.junit.Assert;
import org.junit.Test;

public class JsonParserTest {
    String someUrl = "https://play.google.com/store/apps/details?id=com.facebook.katana";
    JsonObject jsonObject = new JsonObject();

    @Test
    public void testIfWeCanCreateJsonParserClass(){
        JsonParser jsonParser = new JsonParser();
    }

    @Test
    public void canWePassValuesUsingConstructor(){
        JsonParser jsonParser = new JsonParser(someUrl);
    }

    @Test
    public void didMadedClassHaveUrlVariable(){
        JsonParser jsonParser = new JsonParser();
        String string = jsonParser.inClassUrl;
    }

    @Test
    public void didMadedClassHaveJsonObjectVariable(){
        JsonParser jsonParser = new JsonParser();
        JsonObject object = jsonParser.rootObj;
    }

    @Test
    public void getPassedUrl() {
        JsonParser jsonParser = new JsonParser(someUrl);
        Assert.assertEquals(someUrl, jsonParser.getUrl());
    }

    //For geting all get'ers
    JsonParser jsonParser = new JsonParser();

    @Test
    public void shouldGetJsonRootObjectValue(){
        jsonObject.addProperty("Property","Value");
        Assert.assertEquals(jsonObject.get("Property").getAsString(), jsonParser.getJsonObjectValue());
    }

    @Test
    public void shouldGetCountryCodeFromJsonInStringFormat(){
        Assert.assertEquals("SomeCountryCodeInStringFormat",jsonParser.getCountryCode());
    }

    @Test
    public void shouldGetIpFromJsonInStringFormat(){
        Assert.assertEquals("ip",jsonParser.getIp());
    }

    @Test
    public void shouldGetTimeZoneInfoFromJsonInStringFormat(){
        Assert.assertEquals("TimeZone",jsonParser.getTimeZone());
    }

    @Test
    public void shouldGetContryNameInfoFromJsonInStringFormat(){
        Assert.assertEquals("ContryName",jsonParser.getCountryName());
    }
}
