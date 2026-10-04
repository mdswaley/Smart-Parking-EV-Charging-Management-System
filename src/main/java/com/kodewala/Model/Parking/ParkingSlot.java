package com.kodewala.Model.Parking;

import com.kodewala.Enums.SlotType;
import com.kodewala.Model.Vehicle;

public abstract class ParkingSlot {
    private String slotNumber;
    private SlotType slotType;
    private boolean occupied;

    public ParkingSlot(String slotNumber, SlotType slotType) {
        this.slotNumber = slotNumber;
        this.slotType = slotType;
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

    public SlotType getSlotType() {
        return slotType;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public abstract boolean canPark(Vehicle vehicle);

}
