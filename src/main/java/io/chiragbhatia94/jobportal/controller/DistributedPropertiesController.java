package io.chiragbhatia94.jobportal.controller;

import io.chiragbhatia94.jobportal.config.MetaProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistributedPropertiesController {
    @Value("${port}")
    String port;

    @Autowired
    private MetaProperties properties;

    @GetMapping("/getConfigFromValue")
    public String getConfigFromValue() {
        return port;
    }
    @GetMapping("/getConfigFromProperty")
    public String getConfigFromProperty() {
        return properties.getPort();
    }
}
