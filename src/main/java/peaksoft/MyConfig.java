package peaksoft;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:app.properties")
public class MyConfig {

}
