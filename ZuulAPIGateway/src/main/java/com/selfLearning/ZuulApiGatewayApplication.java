package com.selfLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.selfLearning.filter.ErrorFilter;
//import com.selfLearning.filter.PostFilter;
import com.selfLearning.filter.PreFilter;
//import com.selfLearning.filter.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

//	@Bean
//	public PostFilter postFilter() {
//		return new PostFilter();
//	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

//	@Bean
//	public RouteFilter routeFilter() {
//		return new RouteFilter();
//	}

}
