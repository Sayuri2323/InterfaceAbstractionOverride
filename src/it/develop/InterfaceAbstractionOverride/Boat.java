package it.develop.InterfaceAbstractionOverride;

public class Boat extends Vehicle{

    public double maxKnotsSpeed;
    public int boatKilosWeight;


    public Boat(double maxSpeed, int weight){
        this.type=type;
        this.maxKnotsSpeed=maxSpeed;
        this.boatKilosWeight=weight;
    }
    public String getBoatWeightAndSpeed(){
        return "total kilos: "+boatKilosWeight+" tons, maximum knots speed: "+maxKnotsSpeed;
    }


    @Override
    public void doVehicleSouds() {
        System.out.println("The sounds of boat is: tuuuuu tuuuu");
    }
}
