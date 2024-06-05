package annotation;

import annotation.sample.SampleValue;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = SampleValue.class)
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class PropertyConfig {
}
