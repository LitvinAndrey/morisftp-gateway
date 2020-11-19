package com.moris.morisftpgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class MorisftpGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MorisftpGatewayApplication.class, args);
	}

//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("test-service", r -> r.path("/test")
//						.uri("lb://test-service"))
//				.route("test-second-service", r -> r.path("/testsecond")
//						.uri("http://localhost:8082"))
//				.build();
//	}
}
