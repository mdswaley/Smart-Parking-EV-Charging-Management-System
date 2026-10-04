package com.kodewala.Model;

public abstract class ParkingSlot {
    private String slotNumber;
    private boolean occupied;

    public ParkingSlot(String slotNumber) {
        this.slotNumber = slotNumber;
        this.occupied = false;
    }

//    check the status
    public boolean isOccupied() {
        return occupied;
    }

//    release the parking
    public void release(){
        occupied = false;
    }

//    already occupy by other vehicle
    public void occupy() {
        occupied = true;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public abstract boolean canPark(Vehicle vehicle);

}
