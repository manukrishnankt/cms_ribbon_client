package com.opensource.cmsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.opensource.cmsclient.configuration.RibbonConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class CmsclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsclientApplication.class, args);
	}

}
