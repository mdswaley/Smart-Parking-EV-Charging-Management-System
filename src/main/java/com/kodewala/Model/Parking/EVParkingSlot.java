package com.kodewala.Model.Parking;

import com.kodewala.Enums.SlotType;
import com.kodewala.Model.ElectricCar;
import com.kodewala.Model.Vehicle;

public class EVParkingSlot extends ParkingSlot{

    private final double chargingRate;

    public EVParkingSlot(String slotNumber, double chargingRate) {
        super(slotNumber, SlotType.EV_CHARGING);
        this.chargingRate = chargingRate;
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        return vehicle instanceof ElectricCar;
    }

    private double calculatingChargingCost(double units){
        return units * chargingRate;
    }

    public double getChargingRate(){
        return chargingRate;
    }
}
