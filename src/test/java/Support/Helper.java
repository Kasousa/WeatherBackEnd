package Support;

import io.cucumber.java.Scenario;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ApiDoc.ApiDocReader.Reader;

public class Helper {
    public static String getScenarioTag (Scenario scenario) {
        Collection<String> scenarioTags = scenario.getSourceTagNames();
        List<String> scenarioFilteredTags = scenarioTags.stream().filter(t -> t.contains("Test-")).collect(Collectors.toList());
        return scenarioFilteredTags.get(0).replace("@", "").substring(0, scenarioFilteredTags.get(0).length()-9);
    }

    public static Map<Object, Object> getCSVTestData (String scenarioTag) throws Exception {
        String[] dataString = Reader(scenarioTag, "TestData.csv");
        List<String> dataList = Arrays.stream(dataString[1].split(";")).collect(Collectors.toList());
        return dataList.stream().collect(Collectors.toMap(s -> s.split(":")[0].trim(), s -> s.split(":")[1].trim()));
    }
}
