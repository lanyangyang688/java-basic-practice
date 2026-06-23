package lab9;
import java.util.ArrayList;
import java.util.List;

// Rentable Interface
interface Rentable {
    void printRentalAgreement(int days);
}

// Base Vehicle Class
abstract class Vehicle implements Rentable {
    private String licensePlate;
    private double baseDailyRate;
    private int year;

    // Constructor
    public Vehicle(String licensePlate, double baseDailyRate, int year) {
        this.licensePlate = licensePlate;
        this.baseDailyRate = baseDailyRate;
        this.year = year;
    }

    // Getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public double getBaseDailyRate() {
        return baseDailyRate;
    }

    public int getYear() {
        return year;
    }

    // Abstract method (subclasses must override)
    public abstract double calculateRentalCost(int days);

    // Default implementation of Rentable method
    @Override
    public void printRentalAgreement(int days) {
        double totalCost = calculateRentalCost(days);
        System.out.println("=============================");
        System.out.println("Vehicle: " + getLicensePlate());
        System.out.println("Rental duration: " + days + " day(s)");
        System.out.printf("Total cost: $%.2f%n", totalCost);
        System.out.println("=============================");
    }
}

// Car Subclass
class Car extends Vehicle {
    private int seatCount;
    private boolean hasAirConditioning;

    // Constructor
    public Car(String licensePlate, double baseDailyRate, int year, int seatCount, boolean hasAirConditioning) {
        super(licensePlate, baseDailyRate, year);
        this.seatCount = seatCount;
        this.hasAirConditioning = hasAirConditioning;
    }

    // Setters (for dynamic updates)
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    // Getters
    public int getSeatCount() {
        return seatCount;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    // Override rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        double seatFactor = (seatCount > 5) ? 1.2 : 1.0;
        double acFactor = hasAirConditioning ? 1.1 : 1.0;
        return getBaseDailyRate() * days * seatFactor * acFactor;
    }
}

// Truck Subclass
class Truck extends Vehicle {
    private double loadCapacityTons;

    // Constructor
    public Truck(String licensePlate, double baseDailyRate, int year, double loadCapacityTons) {
        super(licensePlate, baseDailyRate, year);
        this.loadCapacityTons = loadCapacityTons;
    }

    // Setter (for dynamic updates)
    public void setLoadCapacityTons(double loadCapacityTons) {
        this.loadCapacityTons = loadCapacityTons;
    }

    // Getter
    public double getLoadCapacityTons() {
        return loadCapacityTons;
    }

    // Override rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        return getBaseDailyRate() * days * (1 + loadCapacityTons / 10);
    }
}

// FleetManager Class (Main)
public class FleetSkeleton {
    public static void main(String[] args) {
        // Initialize fleet list
        List<Vehicle> fleet = new ArrayList<>();

        // Instantiate Car and Truck
        Car car = new Car("C-123", 50.0, 2020, 7, true);
        Truck truck = new Truck("T-789", 60.0, 2019, 3.0);

        // Dynamically update properties
        car.setHasAirConditioning(true);       // Update A/C status
        car.setSeatCount(7);                   // Update seat count
        truck.setLoadCapacityTons(5.0);        // Update load capacity

        // Add vehicles to fleet
        fleet.add(car);
        fleet.add(truck);

        // Generate Fleet Rental Report
        System.out.println("=== Fleet Rental Report ===");
        for (Vehicle vehicle : fleet) {
            // Print vehicle type and details
            if (vehicle instanceof Car) {
                Car carVehicle = (Car) vehicle;
                System.out.println("Vehicle: Car (License: " + carVehicle.getLicensePlate() + ")");
                System.out.println("Seats: " + carVehicle.getSeatCount() + ", A/C: " + carVehicle.isHasAirConditioning());
            } else if (vehicle instanceof Truck) {
                Truck truckVehicle = (Truck) vehicle;
                System.out.println("Vehicle: Truck (License: " + truckVehicle.getLicensePlate() + ")");
                System.out.printf("Load capacity: %.1f tons%n", truckVehicle.getLoadCapacityTons());
            }

            // Print 7-day rental cost
            double sevenDayCost = vehicle.calculateRentalCost(7);
            System.out.printf("7-day cost: $%.2f%n", sevenDayCost);

            // Print rental agreement (via Rentable interface)
            vehicle.printRentalAgreement(7);
            System.out.println(); // Spacing between vehicles
        }

        // Print total fleet size (new requirement)
        System.out.println("Total fleet size: " + fleet.size());
    }
}