//package com.example.demo.config;
//
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public OpenAPI openAPI() {
//        return new OpenAPI()
//                // 配置接口文档基本信息
//                .info(this.getApiInfo())
//                ;
//    }
//
//    private Info getApiInfo() {
//        return new Info()
//                // 配置文档标题
//                .title("SpringBoot3集成Swagger3")
//                // 配置文档描述
//                .description("SpringBoot3集成Swagger3示例文档")
//                // 配置作者信息
//                .contact(new Contact().name("程序员小凡").url("https://www.xiezhrspace.cn").email("1666397814@163.com"))
//                // 配置License许可证信息
//                .license(new License().name("Apache 2.0").url("https://www.xiezhrspace.cn"))
//                // 概述信息
//                .summary("SpringBoot3集成Swagger3示例文档aaa")
//                .termsOfService("https://www.xiezhrspace.cn")
//                // 配置版本号
//                .version("2.0");
//    }
//}