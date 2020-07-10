package com.martialArtsCoolabs.schools;

import com.martialArtsCoolabs.masters.Master;

import java.util.regex.Pattern;

public class School {
    private final String name;
    private final String logo;
    private final String filiation;
    private final Address address;
    private final Master master;

    private School(Builder builder) {
        this.name = builder.name;
        this.logo = builder.logo;
        this.filiation = builder.filiation;
        this.address = new Address();
        this.master = new Master();
    }

    public static class Builder {
        private static final Pattern NAME = Pattern.compile("[A-Za-z0-9 ]");
        private static final Pattern ZIPCODE = Pattern.compile("[0-9-]");
        private final String name;
        private final String masterName;
        private final String masterGraduation;
        private String filiation;
        private String logo;
        private String zipCode;
        private String street;
        private String number;

        public Builder(String name, String masterName, String masterGraduation) {
            this.name = name;
            this.masterName = masterName;
            this.masterGraduation = masterGraduation;
        }

        public Builder logo(String val) {
            if (!NAME.matcher(val).matches())
                throw new IllegalArgumentException("Illegal value for logo. Logo should contain only letters and numbers");
            this.logo = val;
            return this;
        }

        public Builder zipCode(String val) {
            if (!ZIPCODE.matcher(val).matches())
                throw new IllegalArgumentException("Illegal value for zipcode. ZipCode should contain only numbers and dash");
            this.zipCode = val;
            return this;
        }

        public Builder street(String val) {
            if (!NAME.matcher(val).matches())
                throw new IllegalArgumentException("Illegal value for street. Street should contain only letters and numbers");
            this.street = val;
            return this;
        }

        public Builder number(String val) {
            if (!NAME.matcher(val).matches())
                throw new IllegalArgumentException("Illegal value for number. Number should contain only letters and numbers");
            this.number = val;
            return this;
        }

        public Builder filiation(String val) {
            this.filiation = filiation;
            return this;
        }

        public School Build() {
            return new School(this);
        }
    }
}