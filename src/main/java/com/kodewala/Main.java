package com.kodewala;

import com.kodewala.Exception.ParkingFullException;
import com.kodewala.Model.Bike;
import com.kodewala.Model.Car;
import com.kodewala.Model.ElectricCar;
import com.kodewala.Model.Parking.BikeSlot;
import com.kodewala.Model.Parking.EVParkingSlot;
import com.kodewala.Model.Parking.ParkingSlot;
import com.kodewala.Model.Parking.RegularSlot;
import com.kodewala.Service.ParkingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Create Vehicle
        Car car = new Car("KA01AB1234", "Rahul");
        Bike bike = new Bike("KA01XY5678", "Swaley");
        ElectricCar electricCar = new ElectricCar("KA05EV9999", "Amit");
        Car car2 = new Car("KA02CD5678", "John");


//        Create parking slots
        ParkingService parkingService = getParkingService();

        // Park car
        try {

            parkingService.parkVehicle(car);

            // Second car
            parkingService.parkVehicle(car2); // this throw exception bcz no available slot for car2

            // Park bike
            parkingService.parkVehicle(bike);

            // Park electric car
            parkingService.parkVehicle(electricCar);

        }catch (ParkingFullException e){
            System.out.println(e.getMessage());
        }

    }

    private static ParkingService getParkingService() {
        ParkingSlot carSlot = new RegularSlot("C-01");
        ParkingSlot bikeSlot = new BikeSlot("B-01");
        ParkingSlot evSlot = new EVParkingSlot("EV-01", 15);


//         Add slots to list
        List<ParkingSlot> parkingSlots = new ArrayList<>();

        parkingSlots.add(carSlot);
        parkingSlots.add(bikeSlot);
        parkingSlots.add(evSlot);


        // Create ParkingService
        ParkingService parkingService = new ParkingService(parkingSlots);
        return parkingService;
    }
}