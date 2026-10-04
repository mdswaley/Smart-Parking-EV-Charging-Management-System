package com.kodewala.Model;

import com.kodewala.Enums.VehicleType;

public class Car extends Vehicle{

    public Car(String vehicleNumber, String ownerName){
        super(vehicleNumber, ownerName);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.CAR;
    }

    @Override
    public double getBaseParkingRate() {
        return 50;
    }
}
