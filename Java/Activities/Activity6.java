package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public void onboard(String p) {
       // this.passengers = new ArrayList<>();
        this.passengers.add(p);
    }

    public List<String> PrintPass() {
        return passengers;
    }

    public Date takeoff() {
        this.lastTimeTookOf = new Date();

        return lastTimeTookOf;
    }

    public Date Land() {
        this.lastTimeLanded = new Date();
        System.out.println("Time of landing" + lastTimeLanded);
        return lastTimeLanded;
    }

        public  Plane (int maxPassengers) {
         this.passengers = new ArrayList<>();
         this.maxPassengers= maxPassengers;

    }


}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane PlanObj = new Plane(10);
        PlanObj.onboard("mee");
        PlanObj.onboard("She");
        PlanObj.onboard("tee");

        System.out.println("Print take off time:" + PlanObj.takeoff());
        System.out.println("Print list of passengers:" + PlanObj.PrintPass());
        Thread.sleep(5000);
        PlanObj.Land();

    }
}



