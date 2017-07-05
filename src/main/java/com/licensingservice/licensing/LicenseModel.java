package com.licensingservice.licensing;

import java.util.Date;

/**
 * Created by johnjenkins on 7/5/17.
 */
public class LicenseModel {
    private String name;
    private String email;
    private String licenseNumber;
    private LicenseType licenseType;
    private Date expiration;
    private String version;

    public LicenseModel() {
        name = "";
        email = "";
        licenseNumber = "";
        expiration = new Date();
        version = "";
        licenseType = LicenseType.TRIAL;
    }

    public LicenseModel(String name, String email, String licenseNumber, Date expiration, LicenseType licenseType, String version) {
        this.name = name;
        this.email = email;
        this.licenseNumber = licenseNumber;
        this.expiration = expiration;
        this.licenseType = licenseType;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
