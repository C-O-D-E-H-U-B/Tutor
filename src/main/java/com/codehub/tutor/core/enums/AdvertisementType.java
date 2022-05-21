package com.codehub.tutor.core.enums;

public enum AdvertisementType {
    /**
     * PLATINUM ads will display in the landing page
     * the size will be height x width
     */
    PLATINUM(1),

    /**
     * GOLD ads will display in the wall
     * the size will be height x width
     */
    GOLD(2),

    /**
     * SILVER ads will display in as the popup
     * the size will be height x width
     */
    SILVER(3);

    private final int advertisementType;

    AdvertisementType(int advertisementType) {
        this.advertisementType = advertisementType;
    }

    public int getIntValue() {
        return this.advertisementType;
    }

    public static AdvertisementType getAdvertisementType(int type) {
        for (AdvertisementType ad : values()) {
            if (ad.getIntValue() == type) {
                return ad;
            }
        }
        throw new IllegalArgumentException("Invalid Advertisement Type");
    }
}
