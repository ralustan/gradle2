package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTest {

    @Test
    void hello() {
        DemoApplication helloController=new DemoApplication();
        String response=helloController.hello();
        assertEquals("Hello World!!",response);
    }
}