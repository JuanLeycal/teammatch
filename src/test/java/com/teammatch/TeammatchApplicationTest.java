package com.teammatch;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/"},
        glue = {"com.teammatch"},plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"})

public class TeammatchApplicationTest {


}
