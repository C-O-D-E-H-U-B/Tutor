package com.codehub.tutor.core.sessions;

public class Sessions {
    private int onlineStatus;
    private boolean isSessionExpired;
    private String userPermissions;
    private String userSettings;

    public Sessions(int onlineStatus, boolean isSessionExpired, String userPermissions, String userSettings) {
        this.onlineStatus = onlineStatus;
        this.isSessionExpired = isSessionExpired;
        this.userPermissions = userPermissions;
        this.userSettings = userSettings;
    }

    public int getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(int onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public boolean isSessionExpired() {
        return isSessionExpired;
    }

    public void setSessionExpired(boolean sessionExpired) {
        isSessionExpired = sessionExpired;
    }

    public String getUserPermissions() {
        return userPermissions;
    }

    public void setUserPermissions(String userPermissions) {
        this.userPermissions = userPermissions;
    }

    public String getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(String userSettings) {
        this.userSettings = userSettings;
    }
}
