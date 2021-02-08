package com.rexlite.rexlitebasicnew;

public class Device {
    private byte deviceId;
    private byte deviceSN[];
    private String deviceName;

    public Device(String deviceName, int deviceIcon) {
        this.deviceName = deviceName;
        this.deviceIcon = deviceIcon;
    }

    public int getDeviceIcon() {
        return deviceIcon;
    }

    public void setDeviceIcon(int deviceIcon) {
        this.deviceIcon = deviceIcon;
    }

    int deviceIcon;

    public Device() {
    }

    public Device(byte device_Id, byte[] device_SN, String device_Name) {
        deviceId = device_Id;
        deviceSN = device_SN;
        deviceName = device_Name;
        
    }
    

    public byte getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(byte deviceId) {
        this.deviceId = deviceId;
    }

    public byte[] getDeviceSN() {
        return deviceSN;
    }

    public void setDeviceSN(byte[] deviceSN) {
        this.deviceSN = deviceSN;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
