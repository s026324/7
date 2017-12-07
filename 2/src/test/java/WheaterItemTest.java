import org.junit.Assert;
import org.junit.Test;

public class WheaterItemTest {
    Object value;
    @Test
    public void testIfWeCanCreateWheaterItemClass(){
        WheaterItem wheaterItem = new WheaterItem();
    }

    @Test
    public void canWePassValuesUsingConstructor(){
        WheaterItem wheaterItem = new WheaterItem(value);
    }

    //Create class for testing get'ers
    WheaterItem wheaterItem = new WheaterItem();

    @Test
    public void checkIfWeCanGetUserAgenObject(){
        Object agentTest = new Object();
        agentTest = 1;
        Assert.assertEquals(agentTest, wheaterItem.getUserAgent());
    }

    @Test
    public void shouldReturnCityNameInStringFormat(){
        Assert.assertEquals("CityName",wheaterItem.getCityName());
    }

    @Test
    public void shouldReturnWheaterInformationInStringFormat(){
        Assert.assertEquals("WheaterTemp",wheaterItem.getWheaterTemperature());
    }

    @Test
    public void writeFunctionThatConvertWheaterTempFromStringTypeToInteger(){
        Assert.assertEquals(10,wheaterItem.convertTempToInt("10"));
    }

    @Test
    public void writeFunctionThatConvertCelciusToFahrenheit(){
        Assert.assertEquals(35,wheaterItem.convertCelsiusToFahrenheit(5));
    }

    @Test
    public void writeFunctionThatConvertCelsiusToKelvin(){
        Assert.assertEquals(280,wheaterItem.convertCelsiusToKelvin(5));
    }

    @Test
    public void writeFunctionThatMakeCityNameUppercase(){
        Assert.assertEquals("CITYNAME",wheaterItem.convertToUppercase("cityname"));
    }

    @Test
    public void writeFunctionThatReturnCityNameAntTemperatureInOneString(){
        Assert.assertEquals("CityName 5C",wheaterItem.fullInfo("CityName",5));
    }

}
