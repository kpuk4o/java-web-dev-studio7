package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {
    //need somewhere to store that data:
    //Class Variable
    private String discData;
    private HashMap<String, String> discInfo;
    private boolean isInserted;

    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    //constructor to set that data to sth useful
    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.discData= "";
        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;

        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRPM = spinSpeed;

        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeedInRPM));
    }

    //to allow the user to give the disc a title we need to overload the constructor
    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);
    }

    //Methods
    //Getters and Setters

    public boolean isInserted() {
        return this.isInserted;
    }

    public int getStorageCapacity() {
        return this.storageCapacityInMB;
    }

    //no setters for storageCapacity and spinSpeed because they are final

    public int getSpinSpeed() {
        return this.spinSpeedInRPM;
    }


    protected void writeData(String data) {
        this.discData += data;
    }

    public String readData() {
        return this.discData;
    }

    public HashMap<String, String> getInfo(){
        return this.discInfo;
    }

    public void insert() {
        this.isInserted = true;
    }


}
