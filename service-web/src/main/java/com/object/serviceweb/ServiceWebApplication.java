package com.object.serviceweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 * 必须加上@EnableFeignClient这个注解，否则会报错。
 * basePackages 这个是由于包的加载顺序的问题
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.object")
public class ServiceWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceWebApplication.class, args);
	}

}
