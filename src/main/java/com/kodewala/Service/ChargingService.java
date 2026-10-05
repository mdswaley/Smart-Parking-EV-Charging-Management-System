package com.kodewala.Service;

import com.kodewala.Model.Parking.EVParkingSlot;

public class ChargingService {
    public double calculateChargingCost(EVParkingSlot evParkingSlot, double unitConsume){
        if (unitConsume < 0){
            throw new IllegalArgumentException("Units consumed cannot be negative");
        }

        return evParkingSlot.calculatingChargingCost(unitConsume);
    }
}
