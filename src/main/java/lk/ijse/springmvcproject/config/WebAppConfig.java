package lk.ijse.springmvcproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.springmvcproject")
@EnableWebMvc
public class WebAppConfig {
}
