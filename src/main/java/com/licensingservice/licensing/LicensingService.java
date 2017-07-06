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

    /**
     * @generatNewLicense genrates a new license based on the params entered
     * @param name the name of the org
     * @param email the email of the license contact
     * @param licenseType the type of the license
     * @param version the current license version
     * @return
     */
    public LicenseModel generateNewLicense(String name, String email, LicenseType licenseType, String version) {

        return new LicenseModel(name,email,"1234345",new Date(),licenseType,version);

    }


}


