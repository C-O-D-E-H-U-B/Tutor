package com.codehub.tutor.core.enums;

public enum AdvertisementStatus {

    /**
     * Ad will invisible ad this status
     */
    INVISIBLE(0),

    /**
     * Ad will visible ad this status
     */
    VISIBLE(1),

    /**
     * Ad will invisible visible happens due to the schedule
     */
    SCHEDULED(2);

    private final int status;

    AdvertisementStatus(int status) {
        this.status = status;
    }

    public int getIntValue() {
        return status;
    }

    public AdvertisementStatus getAdvertisementStatus(int value) {
        for (AdvertisementStatus adStatus : values()) {
            if (adStatus.status == value) {
                return adStatus;
            }
        }
        throw new IllegalArgumentException("Ad status not a valid one");
    }
}
