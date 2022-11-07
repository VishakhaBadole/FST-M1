package activities;


interface BicycleParts {
    public int gears = 0;
    public int speed = 0;
}

interface BicycleOperations {
    public void applyBrake(int decrement) ;
    public void speedUp(int increment) ;
}

//base class
class bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int speed;

    public bicycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed=-decrement;
        System.out.println("speed reduced by:"+ decrement+"to"+speed);
    }

    public void speedUp(int increment){
        speed=-increment;
        System.out.println("speed reduced by:"+ increment+"to"+speed);
    }

    public String bicycleDesc() {
        return ("No of gears are " + gears + "\nSpeed of bicycle is " + speed);
    }

}
//Derived class
class MountainBike extends bicycle {

    //The MountainBike subclass adds one more field
    public int seatHeight;

    //The MountainBike subclass has one constructor
    public MountainBike(int gears, int speed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}

//Driver class
public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}


