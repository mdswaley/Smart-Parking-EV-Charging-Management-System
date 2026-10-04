package com.kodewala.Model;

import com.kodewala.Enums.VehicleType;

public class ElectricCar extends Vehicle{

    public ElectricCar(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.ELECTRIC_CAR;
    }

    @Override
    public double getBaseParkingRate() {
        return 40;
    }
}
