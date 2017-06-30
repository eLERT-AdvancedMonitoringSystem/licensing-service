package com.licensingservice.licensing;

import org.springframework.stereotype.Service;

/**
 * Created by johnjenkins on 6/30/17.
 * This service is used to create the unique licensing keys
 * for the Licensing tool
 */

@Service
public class LicensingService {
    public String createLicense() {
        return "License"+ Math.random();
    }
}
