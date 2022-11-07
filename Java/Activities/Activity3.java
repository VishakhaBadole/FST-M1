package activities;

public class Activity3 {
    public static void main(String [] args ){
       double MercuryYear=0;
               double VenusYear=0;
       double MearssYear=0;
       double JupiterYear=0;
       double SaturnSYear=0;
       double UranusYear=0;
       double NeptuneYear=0;


        double seconds = 1000000000;
        double earth_year=0;
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        earth_year=seconds/31557600;
        MercuryYear= MercurySeconds*earth_year;
        VenusYear= VenusSeconds*earth_year;
        MearssYear= MarsSeconds*earth_year;
        JupiterYear= JupiterSeconds*earth_year;
        SaturnSYear= SaturnSeconds*earth_year;
        UranusYear= UranusSeconds*earth_year;
        NeptuneYear= NeptuneSeconds*earth_year;
        System.out.println(MercuryYear);
    }


    }



