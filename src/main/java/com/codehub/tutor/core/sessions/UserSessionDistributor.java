package com.codehub.tutor.core.sessions;

public class UserSessionDistributor {
    private static UserSessionService service = new UserSessionServiceImpl();

    public static UserSessionService getInstance(){
        return service;
    }
}
