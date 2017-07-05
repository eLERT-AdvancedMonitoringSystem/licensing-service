package com.licensingservice.licensing;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by johnjenkins on 6/30/17.
 * This service is used to create the unique licensing keys
 * for the Licensing tool
 */

@Service
public class LicensingService {
    public LicenseModel createLicense() {
        //todo setup a data base and service
        LicenseModel licenseModel = new LicenseModel("Dev test",
                "Dev@elertDev.io",
                "123-123-123",
                new Date(),LicenseType.LIFETIME,
                "1");
        return licenseModel;
    }
}
