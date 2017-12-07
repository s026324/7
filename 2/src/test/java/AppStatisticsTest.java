import org.junit.Assert;
import org.junit.Test;

public class AppStatisticsTest {


    @Test
    public void testIfWeCanCreateAppStaticClass(){
        AppStatistics jsonParser = new AppStatistics();
    }

    @Test
    public void canWePassValuesUsingConstructor(){
        AppStatistics jsonParser = new AppStatistics("stringValue");
    }

    @Test
    public void doesMadedClassHaveLinkVariable(){
        String linkValue = AppStatistics.link;
    }
    //For geting all get'ers and etc.
    AppStatistics appStatistics = new AppStatistics();

    @Test
    public void checkIfWeCanGetAppNameInStringType(){
        Assert.assertEquals("AppName",appStatistics.getAppName());
    }

    @Test
    public void checkIfWeCanGetDonwloadsCountNumberInStringType(){
        Assert.assertEquals("10",appStatistics.getDownloadsSize());
    }

    @Test
    public void checkIfWeCanGetMainImageUrlInStringFormat(){
        Assert.assertEquals("ImageUrl",appStatistics.getImageUrl());
    }

    @Test
    public void makeFunctionThatReturnIntegerTypeNumberByPasiingStringTypeNumberDownloadsSize(){
        Assert.assertEquals(10,appStatistics.getDownloadsSizeInt("10"));
    }

    @Test
    public void makeFunctionThatReturnGivedStringValueInUppercase(){
        Assert.assertSame("APPNAME",AppStatistics.getAppNameUppercase("appname"));
    }

    @Test
    public void makeFunctionThatReturnAppNameAndDownloadsSize(){
        Assert.assertEquals("AppName and Downloads",appStatistics.getOneStringInfo("AppName", 10));
    }

    @Test
    public void makeFunctionThatCountsSymbolsInGivenSymbols(){
        Assert.assertEquals(10,appStatistics.getSymbolsCount("SomeString"));
    }
}
