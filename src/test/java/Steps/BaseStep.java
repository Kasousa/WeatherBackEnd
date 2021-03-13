package Steps;

import ApiEngine.Endpoints;
import Cucumber.ScenarioContext;
import Cucumber.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ApiDoc.ApiDocReader.Reader;

public class BaseStep {

    private Endpoints endPoints;
    private ScenarioContext scenarioContext;

    public BaseStep(TestContext testContext) {
        endPoints = testContext.getEndPoints();
        scenarioContext = testContext.getScenarioContext();
    }

    public Endpoints getEndPoints() {
        return endPoints;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}
