package Cucumber;

import ApiEngine.Endpoints;
import DataProvider.ConfigFileReader;
import Enums.Context;
import com.sun.tools.jxc.ConfigReader;

public class TestContext {
    private Endpoints endPoints;
    private ScenarioContext scenarioContext;

    public TestContext() {
        endPoints = new Endpoints(ConfigFileReader.getInstance().getBaseUrl(), ConfigFileReader.getInstance().getAPI_KEY());
        scenarioContext = new ScenarioContext();
        scenarioContext.setContext(Context.BASE_URL, ConfigFileReader.getInstance().getBaseUrl());
        scenarioContext.setContext(Context.API_KEY, ConfigFileReader.getInstance().getAPI_KEY());
    }

    public Endpoints getEndPoints() {
        return endPoints;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}