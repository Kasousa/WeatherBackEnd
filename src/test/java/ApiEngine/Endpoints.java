package ApiEngine;

import ApiEngine.Model.Responses.WeatherResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static ApiEngine.Route.*;

public class Endpoints {
    private final RequestSpecification request;
    private String APIKey;

    public Endpoints (String baseUrl, String APIKey) {
        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather?";
        request = RestAssured.given();
        request.queryParam(getAPIIDLabel(), APIKey);
        this.APIKey=APIKey;
    }

    public IRestResponse<WeatherResponse> ByCityName(String CityName) {
        Response response = request
                .queryParam(getCityNameLabel(), CityName)
                .get();
        return new RestResponse(WeatherResponse.class, response);
    }

    public IRestResponse<WeatherResponse> ByCityStateCountryNames(String CityName, String StateCode, String CountryCode) {
        Response response = request
                .queryParam(getCityNameLabel(), CityName + "," + StateCode + "," + CountryCode)
                .get();
        return new RestResponse(WeatherResponse.class, response);
    }

    public IRestResponse<WeatherResponse> ByCityID(String CityID) {
        Response response = request
                .queryParam(getCityIDLabel(), CityID)
                .get();
        return new RestResponse(WeatherResponse.class, response);
    }

    public IRestResponse<WeatherResponse> ByGeographicsCoordinates(String latitude, String longitude) {
        Response response = request
                .queryParam(getGeographicsLatitudeLabel(), latitude)
                .queryParam(getGeographicsLongitudeLabel(), longitude)
                .get();
        return new RestResponse(WeatherResponse.class, response);
    }

    public IRestResponse<WeatherResponse> ByZIPCode(String ZIPCode) {
        Response response = request
                .queryParam(getZIPCodeLabel(), ZIPCode)
                .get();
        return new RestResponse(WeatherResponse.class, response);
    }

}
