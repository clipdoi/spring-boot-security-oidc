package com.son.SpringBootOIDC.jwtauthorities;

/**
 *
 */

import com.son.SpringBootOIDC.utils.YamlLoaderInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringOidcJwtAuthoritiesApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringOidcJwtAuthoritiesApplication.class);
        ApplicationContextInitializer<ConfigurableApplicationContext> yamlInitializer = new YamlLoaderInitializer("jwtauthorities-application.yml");
        application.addInitializers(yamlInitializer);
        application.run(args);
    }
}