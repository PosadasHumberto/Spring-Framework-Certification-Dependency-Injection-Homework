package org.hposadas.dependencyinjectionhomework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("UAT")
public class EnvironmentUatServiceImpl implements EnvironmentService {
    @Override
    public String getOperatingEnvironment() {
        return "This service belongs to User acceptance Testing";
    }
}
