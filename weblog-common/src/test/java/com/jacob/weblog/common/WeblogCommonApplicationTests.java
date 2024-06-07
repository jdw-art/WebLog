package com.jacob.weblog.common;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = WeblogCommonApplicationTests.Application.class)
@Slf4j
class WeblogCommonApplicationTests {

    public static class Application {
    }

    @Test
    void contextLoads() {
    }

}
