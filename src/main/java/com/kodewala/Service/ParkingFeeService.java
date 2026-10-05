package com.kodewala.Service;

import com.kodewala.Model.Vehicle;

public class ParkingFeeService {
    public double calculateFee(Vehicle vehicle, long hours){
        if (hours <= 0){
            return 0;
        }

        return vehicle.getBaseParkingRate() * hours;
    }
}
