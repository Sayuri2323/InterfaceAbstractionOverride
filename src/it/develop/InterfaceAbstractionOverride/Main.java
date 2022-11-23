package it.develop.InterfaceAbstractionOverride;

public class Main {
    public static void main(String[] args) {

        Car c1=new Car(4,5,100.000);
        c1.type="Car";
        c1.showVehicleDetails();
        c1.doVehicleSouds();


        Boat b1=new Boat(15.3, 30000);
        b1.type="Boat";
        b1.showVehicleDetails();
        System.out.println(b1.getBoatWeightAndSpeed());
        b1.doVehicleSouds();
    }
}