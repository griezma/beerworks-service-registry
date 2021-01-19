package griezma.mssc.beerworksregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BeerworksServiceRegistry {
    public static void main(String[] args) {
        SpringApplication.run(BeerworksServiceRegistry.class, args);
    }
}
