package com.jacob.weblog.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = WeblogJwtApplicationTests.Application.class)
class WeblogJwtApplicationTests {

    public static class Application {
    }

    @Test
    void contextLoads() {
    }

}
