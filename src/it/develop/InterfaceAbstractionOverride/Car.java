package it.develop.InterfaceAbstractionOverride;

public class Car extends Vehicle{

   public int numberOfDoors;
   public double carPrice;


   public Car(int wheels, int doors, double price){
       this.type=type;
       this.numberOfWheels=wheels;
       this.numberOfDoors=doors;
       this.carPrice=price;


   }

   @Override

   public void showVehicleDetails(){
       super.showVehicleDetails();
       System.out.println("the number of doors: "+numberOfDoors);
   }




    @Override
    public void doVehicleSouds() {
        System.out.println("The sound of car is: bruuuum");

    }
}
