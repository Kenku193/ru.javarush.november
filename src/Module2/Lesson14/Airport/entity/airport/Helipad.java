package Module2.Lesson14.Airport.entity.airport;

import Module2.Lesson14.Airport.entity.airport.runway.Runway;


public class Helipad implements Runway {
    @Override
    public String takeTheAircraft(){
        return "Helipad";
    }
}
