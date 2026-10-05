package com.kodewala.Service;

import com.kodewala.Exception.ParkingFullException;
import com.kodewala.Model.Parking.ParkingSlot;
import com.kodewala.Model.Vehicle;

import java.util.List;

public class ParkingService {
    private List<ParkingSlot> parkingSlots;

    public ParkingService(List<ParkingSlot> parkingSlots){
        this.parkingSlots = parkingSlots;
    }

    public ParkingSlot findAvailableSlot(Vehicle vehicle){
        for (ParkingSlot parkingSlot:parkingSlots){
            if (!parkingSlot.isOccupied() && parkingSlot.canPark(vehicle)){
                return parkingSlot;
            }
        }

        throw new ParkingFullException("No suitable parking slot available for " + vehicle.getVehicleNumber());
    }

    public void parkVehicle(Vehicle vehicle) {

        ParkingSlot slot = findAvailableSlot(vehicle);

        slot.occupy();

        System.out.println("Vehicle " + vehicle.getVehicleNumber() + " parked at slot " + slot.getSlotNumber());
    }

    public void releaseSlot(ParkingSlot slot) {

        slot.release();

        System.out.println("Slot " + slot.getSlotNumber() + " is now available");
    }
}

