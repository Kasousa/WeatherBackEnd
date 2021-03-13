package Steps;

import ApiEngine.IRestResponse;
import ApiEngine.Model.Responses.WeatherResponse;
import Cucumber.TestContext;
import Enums.Context;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.restassured.response.Response;
import org.junit.Assert;

public class RequestsSteps extends BaseStep {

    public RequestsSteps(TestContext testContext) {
        super(testContext);
    }

    @Dado("Que solicito a temperatura para cidade de {string}")
    public void queSolicitoATemperaturaParaCidadeDe_(String CityName) {
        IRestResponse<WeatherResponse> weatherResponse = getEndPoints().ByCityName(CityName);
        getScenarioContext().setContext(Context.WEATHER_RESPONSE, weatherResponse);
    }

    @Dado("Que solicito a temperatura para cidade de {string}, {string}, {string}")
    public void queSolicitoATemperaturaParaCidadeDe_(String CityName, String StateCode, String CountryCode) {
        IRestResponse<WeatherResponse> weatherResponse = getEndPoints().ByCityStateCountryNames(CityName, StateCode, CountryCode);
        getScenarioContext().setContext(Context.WEATHER_RESPONSE, weatherResponse);
    }

    @Dado("Que solicito a temperatura pelo ID {string}")
    public void queSolicitoATemperaturaPeloID_(String CityID) {
        IRestResponse<WeatherResponse> weatherResponse = getEndPoints().ByCityID(CityID);
        getScenarioContext().setContext(Context.WEATHER_RESPONSE, weatherResponse);
    }

    @Dado("Que solicito a temperatura pela coordenada latitude={string} e longitude={string}")
    public void queSolicitoATemperaturaPelaCoordenadaLatitude_ELongitude_(String latitude, String longitude) {
        IRestResponse<WeatherResponse> weatherResponse = getEndPoints().ByGeographicsCoordinates(latitude, longitude);
        getScenarioContext().setContext(Context.WEATHER_RESPONSE, weatherResponse);
    }

    @Dado("Que solicito a temperatura pelo código ZIP {string}")
    public void queSolicitoATemperaturaPeloCódigoZIP(String ZIPCode) {
        IRestResponse<WeatherResponse> weatherResponse = getEndPoints().ByZIPCode(ZIPCode);
        getScenarioContext().setContext(Context.WEATHER_RESPONSE, weatherResponse);
    }
}
