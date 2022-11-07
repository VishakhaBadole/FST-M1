package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car mycar = new Car();
       mycar.make = 2;
       mycar.color= "blue";
       //mycar.doors=this(car)
        mycar.displayCharacteristics();
        mycar.accelarate();
        mycar.brake();

    }

}
