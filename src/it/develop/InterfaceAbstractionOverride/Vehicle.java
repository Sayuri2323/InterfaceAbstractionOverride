package it.develop.InterfaceAbstractionOverride;

public abstract class Vehicle {

    public String type;
    public int numberOfWheels;


    public void showVehicleDetails(){

        System.out.println("The type of vehicle is: "+type+" The numbers of wheels is:  "+numberOfWheels);
    }
    public abstract void doVehicleSouds();

}
