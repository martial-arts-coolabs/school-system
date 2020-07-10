package com.martialArtsCoolabs.schools;

import java.util.regex.Pattern;

public class School {
    private final String name;
    private final String logo;
    private final String filiation;

    private School(Builder builder) {
        this.name = builder.name;
        this.logo = builder.logo;
        this.filiation = builder.filiation;
    }

    public static class Builder {
        private static final Pattern NAME = Pattern.compile("[A-Za-z0-9 ]");
        private final String name;
        private String filiation;
        private String logo;

        public Builder(String name) {
            if (!NAME.matcher(name).matches())
                throw new IllegalArgumentException("Illegal value for name. Name should contain only letters and numbers");
            this.name = name;
        }

        public Builder logo(String val) {
            if (!NAME.matcher(val).matches())
                throw new IllegalArgumentException("Illegal value for logo. Logo should contain only letters and numbers");
            this.logo = val;
            return this;
        }

        public Builder filiation(String val) {
            if (!NAME.matcher(val).matches())
                throw new IllegalArgumentException("Illegal value for filiation. Filiation should contain only letters and numbers");
            this.filiation = filiation;
            return this;
        }

        public School build() {
            return new School(this);
        }
    }
}