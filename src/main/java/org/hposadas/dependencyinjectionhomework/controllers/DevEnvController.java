package org.hposadas.dependencyinjectionhomework.controllers;

import org.hposadas.dependencyinjectionhomework.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DevEnvController {

    //atributos
    @Autowired
    EnvironmentService service;

    //métodos
    public String sayOperatingEnv(){
        return service.getOperatingEnvironment();
    }
}
