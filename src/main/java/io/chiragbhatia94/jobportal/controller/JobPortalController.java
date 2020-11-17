package io.chiragbhatia94.jobportal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobPortalController {
    private static final Logger logger = LoggerFactory.getLogger(JobPortalController.class);

    @GetMapping("/")
    String test() {
        return "Welcome to Paccar Warranty Project!";
    }

    @GetMapping("/health")
    String healthCheck() {
        return "UP";
    }

    @CrossOrigin
    @PostMapping(value = "/service/cdk-drive/paccar/v1/warranty/capi", produces = "application/json", consumes = "application/json")
    public ResponseEntity<String> paccarWarrantyCapi() {
        logger.debug("this is a test");
        return new ResponseEntity<>("Capi", new HttpHeaders(), HttpStatus.OK);
    }
}