package com.kodewala;

import com.kodewala.Model.Bike;
import com.kodewala.Model.Car;
import com.kodewala.Model.ElectricCar;
import com.kodewala.Model.Parking.BikeSlot;
import com.kodewala.Model.Parking.EVParkingSlot;
import com.kodewala.Model.Parking.ParkingSlot;
import com.kodewala.Model.Parking.RegularSlot;
import com.kodewala.Service.ParkingService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Create Vehicle
        Car car = new Car("KA01AB1234", "Rahul");
        Bike bike = new Bike("KA01XY5678", "Swaley");
        ElectricCar electricCar = new ElectricCar("KA05EV9999", "Amit");


//        Create parking slots
        ParkingService parkingService = getParkingService();

        // Park car
        parkingService.parkVehicle(car);

        // Park bike
        parkingService.parkVehicle(bike);

        // Park electric car
        parkingService.parkVehicle(electricCar);

    }

    private static ParkingService getParkingService() {
        ParkingSlot carSlot = new RegularSlot("C-01");
        ParkingSlot bikeSlot2 = new BikeSlot("B-01");
        ParkingSlot evSlot = new EVParkingSlot("EV-01", 15);


//         Add slots to list
        List<ParkingSlot> parkingSlots = new ArrayList<>();

        parkingSlots.add(carSlot);
        parkingSlots.add(bikeSlot2);
        parkingSlots.add(evSlot);


        // Create ParkingService
        ParkingService parkingService = new ParkingService(parkingSlots);
        return parkingService;
    }
}