package labshopmonolithjaducku.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopmonolithjaducku.MonolithApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MonolithApplication.class })
public class CucumberSpingConfiguration {}
