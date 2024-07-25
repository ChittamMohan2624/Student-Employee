package com.chittamtech.Student_Employee.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class SwaggerConfig {

/*    @Bean
    public Docket SwaggerAPI(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Java Techie").
                apiInfo(apiInfo()).select()
                .paths(regex("/student.*")).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Student Service")
                .description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
                .termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
                .license("Java_Gyan_Mantra License")
                .licenseUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ").version("1.0").build();
    }*/

    @Bean
    public GroupedOpenApi controllerApi() {
        return GroupedOpenApi.builder()
                .group("Student-api")
                .packagesToScan("com.chittamtech.Student_Employee.controller") // Specify the package to scan
                .build();
    }

}
