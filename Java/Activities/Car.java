package activities;



public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

//Make a constructor to initialize tyres to 4 and doors to 4
    public Car()
    {
        tyres=4;
        doors=2;
    }
    //methods
//- This displays the values of all the variables
    public void displayCharacteristics(){
        System.out.println("color is"+ color);
        System.out.println("number of tyre is"+tyres);
    }
    //- This prints "Car is moving forward."
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }
    //- This prints "Car has stopped."
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
