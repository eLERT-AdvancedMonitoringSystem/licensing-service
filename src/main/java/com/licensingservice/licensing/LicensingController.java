package com.licensingservice.licensing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johnjenkins on 6/30/17.
 */

@RestController
public class LicensingController {

    //logger for my tool
    private Logger logger = LoggerFactory.getLogger(getClass());

    LicensingService licensingService;

    @Autowired
    public LicensingController(LicensingService licensingService) {
        this.licensingService = licensingService;
    }


    /**
     * Get the license
     * this controller gets the license info from the database
     */
    @RequestMapping("/")
    public LicenseModel getLicense(){
        return licensingService.createLicense();
    }

}
