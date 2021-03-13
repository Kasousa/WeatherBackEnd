package ApiEngine;

public class Route {
    private static final String CityNameLabel = "q";
    private static final String CityIDLabel = "id";
    private static final String GeographicsLatitudeLabel = "lat";
    private static final String GeographicsLongitudeLabel = "lon";
    private static final String ZIPCodeLabel = "zip";
    private static final String APIIDLabel = "appid";

    public static String getCityNameLabel() {
        return CityNameLabel;
    }

    public static String getCityIDLabel() {
        return CityIDLabel;
    }

    public static String getGeographicsLatitudeLabel() {
        return GeographicsLatitudeLabel;
    }

    public static String getGeographicsLongitudeLabel() {
        return GeographicsLongitudeLabel;
    }

    public static String getZIPCodeLabel() {
        return ZIPCodeLabel;
    }

    public static String getAPIIDLabel() {
        return APIIDLabel;
    }
}
