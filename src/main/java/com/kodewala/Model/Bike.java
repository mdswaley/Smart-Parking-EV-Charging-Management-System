package com.kodewala.Model;

import com.kodewala.Enums.VehicleType;

public class Bike extends Vehicle{

    public Bike(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.BIKE;
    }

    @Override
    public double getBaseParkingRate() {
        return 20;
    }
}
