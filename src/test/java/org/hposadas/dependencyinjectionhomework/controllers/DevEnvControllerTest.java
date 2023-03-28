package org.hposadas.dependencyinjectionhomework.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@ActiveProfiles("DEV")
class DevEnvControllerTest {

    //atributos
    @Autowired
    DevEnvController controller;

    @Test
    void sayOperatingEnv() {
        System.out.println(controller.sayOperatingEnv());
    }
}