package com.travismclarke;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApiGatewayApplication.class)
public class ApiGatewayApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Configuration
    public static class ByPassConfiguration {
        @Bean
        public ServerProperties serverProperties() {
            return new ServerProperties();
        }
    }

}
