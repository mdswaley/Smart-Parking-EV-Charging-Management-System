package com.kodewala.Model.Parking;

import com.kodewala.Enums.SlotType;
import com.kodewala.Model.Bike;
import com.kodewala.Model.Vehicle;

public class BikeSlot extends ParkingSlot{

    public BikeSlot(String slotNumber) {
        super(slotNumber, SlotType.BIKE);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle instanceof Bike;
    }
}
