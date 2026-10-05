# 🚗 SmartPark – Smart Parking Management System

SmartPark is a **Java-based Smart Parking Management System** designed to demonstrate core **Object-Oriented Programming (OOP)** concepts through a practical real-world use case.

The system manages different types of vehicles, parking slots, parking availability, and parking operations while following clean object-oriented design principles.

---

## 📌 Project Overview

Managing parking spaces manually can become difficult when there are different types of vehicles and parking slots.

SmartPark provides a simple system to:

- Register different types of vehicles
- Manage different types of parking slots
- Find suitable available parking slots
- Park vehicles
- Release parking slots
- Handle parking-full scenarios using custom exceptions
- Support EV charging parking slots

The main goal of this project is to understand how **OOP concepts can be applied to build a real-world system**.

---

## 🛠️ Technologies Used

- **Java**
- **Object-Oriented Programming**
- Java Collections
- Custom Exceptions
- Java Time API

---

## 🧠 OOP Concepts Used

This project demonstrates the following Java OOP concepts:

### 1. Encapsulation

Vehicle and parking-slot properties are kept private and accessed through methods.

```java
private String vehicleNumber;
private String ownerName;
```

### 2. Inheritance

Different vehicle and parking-slot types extend their respective base classes.

```text
Vehicle
├── Car
├── Bike
└── ElectricCar
```

```text
ParkingSlot
├── RegularSlot
├── BikeSlot
└── EVParkingSlot
```

### 3. Abstraction

Common behavior is defined using abstract classes.

```java
public abstract class Vehicle
```

and

```java
public abstract class ParkingSlot
```

### 4. Polymorphism

Different parking slots implement their own parking rules using method overriding.

```java
@Override
public boolean canPark(Vehicle vehicle) {
    return vehicle instanceof ElectricCar;
}
```

### 5. Interfaces

Payment methods are designed using the `Payment` interface.

```text
Payment
├── CashPayment
├── UpiPayment
└── CardPayment
```

### 6. Custom Exceptions

The project uses custom exceptions to handle invalid parking operations.

```java
ParkingFullException
```

---

## 📂 Project Structure

```text
SmartPark/
│
├── src/
│   └── com/
│       └── kodewala/
│           │
│           ├── Main.java
│           │
│           ├── Model/
│           │   ├── Vehicle.java
│           │   ├── Car.java
│           │   ├── Bike.java
│           │   ├── ElectricCar.java
│           │   │
│           │   └── Parking/
│           │       ├── ParkingSlot.java
│           │       ├── RegularSlot.java
│           │       ├── BikeSlot.java
│           │       └── EVParkingSlot.java
│           │
│           ├── Service/
│           │   └── ParkingService.java
│           │
│           ├── Payment/
│           │   ├── Payment.java
│           │   ├── CashPayment.java
│           │   ├── UpiPayment.java
│           │   └── CardPayment.java
│           │
│           └── Exception/
│               └── ParkingFullException.java
│
└── README.md
```

---

## 🚘 Supported Vehicles

Currently, SmartPark supports:

| Vehicle | Description |
|---|---|
| 🚗 Car | Regular four-wheel vehicle |
| 🏍️ Bike | Two-wheeler |
| ⚡ ElectricCar | Electric vehicle |

---

## 🅿️ Supported Parking Slots

| Slot | Vehicle |
|---|---|
| RegularSlot | Car |
| BikeSlot | Bike |
| EVParkingSlot | ElectricCar |

Each parking slot determines whether a particular vehicle can park using:
