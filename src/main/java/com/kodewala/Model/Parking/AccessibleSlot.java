package com.kodewala.Model.Parking;

import com.kodewala.Enums.SlotType;
import com.kodewala.Model.Vehicle;

public class AccessibleSlot extends ParkingSlot{

    public AccessibleSlot(String slotNumber) {
        super(slotNumber, SlotType.ACCESSIBLE);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return true;
    }
}
