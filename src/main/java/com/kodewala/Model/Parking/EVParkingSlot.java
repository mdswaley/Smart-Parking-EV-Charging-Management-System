package com.kodewala.Model.Parking;

import com.kodewala.Model.ElectricCar;
import com.kodewala.Model.Vehicle;

public class EVParkingSlot extends ParkingSlot{

    private final double chargingRate;

    public EVParkingSlot(String slotNumber, double chargingRate) {
        super(slotNumber);
        this.chargingRate = chargingRate;
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle instanceof ElectricCar;
    }

    private double calculatingChargingCost(double units){
        return units * chargingRate;
    }
}
