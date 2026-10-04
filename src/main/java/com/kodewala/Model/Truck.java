package com.kodewala.Model;

import com.kodewala.Enums.VehicleType;

public class Truck extends Vehicle{

    public Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.TRUCK;
    }

    @Override
    public double getBaseParkingRate() {
        return 80;
    }
}
