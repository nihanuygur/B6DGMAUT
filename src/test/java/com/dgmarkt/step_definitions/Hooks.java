package com.dgmarkt.step_definitions;

import com.dgmarkt.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {
    @Before //cucumber
    public void setUp(){

        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.get().manage().window().maximize();
    }

    @After //cucumber
    public void tearDown(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Thread.sleep(2000);
        Driver.closeDriver();
    }

}
