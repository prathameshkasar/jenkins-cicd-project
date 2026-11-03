package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetMessage() {

        String result = App.getMessage();

        assertEquals(
            "Hello from Jenkins CI/CD Pipeline!",
            result
        );
    }
}
