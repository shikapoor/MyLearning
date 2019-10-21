package com.example.springbootexceptionhandling.data;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@AllArgsConstructor
public class AppInit implements ApplicationRunner {

    private SampleData sampleData;

    public void run(ApplicationArguments args) {
        log.info("Loading sample DATA into DB...");

        sampleData.createSampleData();
    }
}