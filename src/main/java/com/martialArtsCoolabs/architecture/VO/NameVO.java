package com.martialArtsCoolabs.architecture.VO;

public final class NameVO {
    private final String value;

    private NameVO(String value) {
        this.value = value;
    }

    public static NameVO of(String value) {
        return new NameVO(value);
    }
    
}