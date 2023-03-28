package org.hposadas.dependencyinjectionhomework.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("PROD")
class ProdEnvControllerTest {

    //atributos
    @Autowired
    ProdEnvController controller;

    @Test
    void sayOperatingEnv() {
        System.out.println(controller.sayOperatingEnv());
    }
}