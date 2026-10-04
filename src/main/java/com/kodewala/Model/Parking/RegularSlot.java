package com.kodewala.Model.Parking;

import com.kodewala.Enums.SlotType;
import com.kodewala.Model.Car;
import com.kodewala.Model.Vehicle;

public class RegularSlot extends ParkingSlot{

    public RegularSlot(String slotNumber) {
        super(slotNumber, SlotType.REGULAR);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle instanceof Car;
    }
}
