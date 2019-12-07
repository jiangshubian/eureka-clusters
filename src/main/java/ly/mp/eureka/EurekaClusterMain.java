package ly.mp.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author jiangshubian
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterMain.class, args);
    }
}
