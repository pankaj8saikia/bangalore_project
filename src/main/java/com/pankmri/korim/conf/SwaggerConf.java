package com.pankmri.korim.conf;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-12
 **/
public class SwaggerConf {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pankmri.korim.rest.controller"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metadata());
    }
    private ApiInfo metadata() {
        return new ApiInfo(
                "User Registration Service",
                "REST API guides for User Registration Service",
                "0.0.1-SNAPSHOT",
                "Terms & Services",
                new Contact("PankMri Pvt LTD",
                        "https://www.pankmri.com/",
                        "admin@pankmri.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
    }
}
