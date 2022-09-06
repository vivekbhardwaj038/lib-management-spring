package com.example.libmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author vivek
 * @created on 25/08/22 and 6:21 PM
 */

@RestController
@Slf4j
@RequestMapping(value = "/patient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PatientHistory {

    @GetMapping("/medicine-history")
    public ResponseEntity<String> test() {
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
