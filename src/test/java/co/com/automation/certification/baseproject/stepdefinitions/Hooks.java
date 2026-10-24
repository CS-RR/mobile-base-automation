package co.com.automation.certification.baseproject.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
    private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void logScenarioStart(Scenario scenario) {
        LOGGER.info("Starting scenario: {}", scenario.getName());
    }
}
