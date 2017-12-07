import com.jaunt.Element;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class AppStatistics {

    public static String link;
    private UserAgent playLink = new UserAgent();
    private Element appName,downloads, image;
    private String nameString, downloadsString, imageString;

    public AppStatistics() {
    }

    public AppStatistics(String stringValue) {
        link = stringValue;
    }

    public String getAppName() throws ResponseException, NotFound {
        playLink.visit(link);
        appName = playLink.doc.findFirst("<div class=id-app-title>");
        nameString = appName.innerHTML();
        return nameString;
    }

    public String getDownloadsSize() throws ResponseException, NotFound {
        playLink.visit(link);
        downloads = playLink.doc.findFirst("<div class=content itemprop=numDownloads>");
        downloadsString = downloads.innerHTML();
        return downloadsString.replaceAll(" ","");
    }

    public int getDownloadsSizeInt(String s) {
        String[] parts = s.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        int integerFromString = Integer.parseInt(part2);
        return integerFromString;
    }

    public static String getAppNameUppercase(String appname) {
        appname.toUpperCase();
        return appname;
    }

    public String getOneStringInfo(String appName, String i) {
        return "App name: " + appName + " donwloads: " + i;
    }

    public String getImageUrl() throws ResponseException, NotFound {
        playLink.visit(link);
        image = playLink.doc.findFirst("<img class=cover-image>");
        imageString = image.innerHTML();
        return imageString;
    }

    public int getSymbolsCount(String someString) {
        int length = someString.length();
        return length;
    }
}
