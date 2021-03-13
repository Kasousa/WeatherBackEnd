package Steps;

import ApiEngine.IRestResponse;
import ApiEngine.Model.Responses.WeatherResponse;
import Cucumber.TestContext;
import Enums.Context;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Então;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import java.util.Map;

import static ApiDoc.ApiDocReader.Reader;
import static Support.Helper.getCSVTestData;
import static Support.Helper.getScenarioTag;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class VerificationSteps extends BaseStep{
    IRestResponse<WeatherResponse> weatherResponse;
    Map<Object, Object> data;

    public VerificationSteps(TestContext testContext) {
        super(testContext);
    }

    public String getTestData (String key) { return (String) data.get(key); }

    @Before
    public void initTestData (Scenario scenario) throws Exception {
        String scenarioTag = getScenarioTag (scenario);
        data = getCSVTestData(scenarioTag);
    }

    @Então("valido que o retorno é 200 OK")
    public void ORetornoEOk() {
        weatherResponse = (IRestResponse<WeatherResponse>) getScenarioContext().getContext(Context.WEATHER_RESPONSE);
        Assert.assertEquals(HttpStatus.SC_OK, weatherResponse.getStatusCode());
    }

    @Então("valido as 'coordinates' no retorno da pesquisa")
    public void validoAsCoordenadasNoRetornoDaPesquisa() throws Exception {
        Float latitude = Float.valueOf(getTestData("latitude"));
        Float longitude = Float.valueOf(getTestData("longitude"));
        Float deltaCoord = Float.valueOf(getTestData("deltaCoord"));

        Assert.assertEquals(latitude, weatherResponse.getBody().coord.lat, deltaCoord);
        Assert.assertEquals(longitude, weatherResponse.getBody().coord.lon, deltaCoord);
    }

    @Então("valido a 'weather' no retorno da pesquisa")
    public void validoAWeatherNoRetornoDaPesquisa() throws Exception {
        String[] weatherData = Reader(String.valueOf(weatherResponse.getBody().weather[0].id), "WeatherConditionCodes.csv");

        Assert.assertEquals(weatherData[1], weatherResponse.getBody().weather[0].main);
        Assert.assertEquals(weatherData[2], weatherResponse.getBody().weather[0].description);
        Assert.assertThat(weatherResponse.getBody().weather[0].icon, startsWith(weatherData[3]));
    }

    @Então("valido a 'base' no retorno da pesquisa")
    public void validoABaseNoRetornoDaPesquisa() throws Exception {
        Assert.assertEquals("stations", weatherResponse.getBody().base);
    }

    @Então("valido a 'main' no retorno da pesquisa")
    public void validoAMainNoRetornoDaPesquisa() throws Exception {
        Float tempDefault = Float.valueOf(getTestData("tempDefault"));
        Float deltaTemp = Float.valueOf(getTestData("deltaTemp"));

        Assert.assertEquals(tempDefault, weatherResponse.getBody().main.temp, deltaTemp);
        Assert.assertEquals(tempDefault, weatherResponse.getBody().main.temp_min, deltaTemp);
        Assert.assertEquals(tempDefault, weatherResponse.getBody().main.temp_max, deltaTemp);
        Assert.assertEquals(tempDefault, weatherResponse.getBody().main.feels_like, deltaTemp);
        Assert.assertThat(weatherResponse.getBody().main.pressure, greaterThanOrEqualTo(0));
        Assert.assertThat(weatherResponse.getBody().main.humidity, greaterThanOrEqualTo(0));
    }

    @Então("valido a 'visibility' no retorno da pesquisa")
    public void validoAVisibilityNoRetornoDaPesquisa() throws Exception {
        Assert.assertThat(weatherResponse.getBody().visibility, greaterThan(0));
    }

    @Então("valido a 'wind' no retorno da pesquisa")
    public void validoAWindNoRetornoDaPesquisa() throws Exception {
        Assert.assertThat(weatherResponse.getBody().wind.speed, greaterThan((float) 0));
        Assert.assertThat(weatherResponse.getBody().wind.deg, greaterThan(0));
        Assert.assertThat(weatherResponse.getBody().wind.gust, greaterThanOrEqualTo((float)0));
    }

    @Então("valido a 'cloud' no retorno da pesquisa")
    public void validoACloudNoRetornoDaPesquisaPeloNomeDaCidade() throws Exception {
        Assert.assertThat(weatherResponse.getBody().clouds.all, greaterThanOrEqualTo(0));
    }

    @Então("valido a 'dt' no retorno da pesquisa")
    public void validoADtNoRetornoDaPesquisa() throws Exception {
        Assert.assertThat(weatherResponse.getBody().dt, greaterThanOrEqualTo(0));
    }

    @Então("valido a 'sys' no retorno da pesquisa")
    public void validoASysNoRetornoDaPesquisa() throws Exception {
        String country = getTestData("country");

        Assert.assertThat(weatherResponse.getBody().sys.type, greaterThan(0));
        Assert.assertThat(weatherResponse.getBody().sys.id, greaterThan(0));
        Assert.assertEquals(country, weatherResponse.getBody().sys.country);
        Assert.assertThat(weatherResponse.getBody().sys.sunrise, greaterThan(0));
        Assert.assertThat(weatherResponse.getBody().sys.sunset, greaterThan(0));
    }

    @Então("valido a 'timezone' no retorno da pesquisa")
    public void validoATimezoneNoRetornoDaPesquisa() throws Exception {
        int timezone = Integer.valueOf(getTestData("timezone"));

        Assert.assertEquals(timezone, weatherResponse.getBody().timezone);
    }

    @Então("valido a 'id' no retorno da pesquisa")
    public void validoAIdNoRetornoDaPesquisa() throws Exception {
        int id = Integer.valueOf(getTestData("id"));

        Assert.assertEquals(id, weatherResponse.getBody().id);
    }

    @Então("valido o 'name' no retorno da pesquisa")
    public void validoONomeNoRetornoDaPesquisa() throws Exception {
        String city = getTestData("city");

        Assert.assertEquals(city, weatherResponse.getBody().name);
    }

    @Então("valido a 'cod' no retorno da pesquisa")
    public void validoAsCoordenadasNoRetornoDaPesquisaPeloNomeDaCidade() throws Exception {
        int cod = Integer.valueOf(getTestData("cod"));

        Assert.assertEquals(cod, weatherResponse.getBody().cod);
    }
}
