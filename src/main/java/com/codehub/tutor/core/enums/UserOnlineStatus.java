package com.codehub.tutor.core.enums;

public enum UserOnlineStatus {

    /**
     * When user is offline
     */
    OFFLINE(0),

    /**
     * When user is online
     */
    ACTIVE(1),

    /**
     * When user is online but away at that moment
     */
    AWAY(2),

    /**
     * When user is online but busy at that moment
     */
    BUSY(3);

    private final int status;

    UserOnlineStatus(int status){
        this.status = status;
    }

    public static UserOnlineStatus getValue(int value){
        for(UserOnlineStatus status: values()){
            if(status.status == value) return status;
        }
        throw new IllegalArgumentException("invalid input");
    }
}
