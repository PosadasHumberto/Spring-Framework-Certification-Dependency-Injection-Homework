package org.hposadas.dependencyinjectionhomework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("PROD")
public class EnvironmentProdServiceImpl implements EnvironmentService {
    @Override
    public String getOperatingEnvironment() {
        return "This service belongs to Production";
    }
}
