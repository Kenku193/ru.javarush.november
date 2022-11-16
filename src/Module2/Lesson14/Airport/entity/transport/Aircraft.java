package Module2.Lesson14.Airport.entity.transport;

import Module2.Lesson14.Airport.entity.airport.runway.Runway;
import Module2.Lesson14.Airport.util.AircraftType;


public abstract class Aircraft {

    public abstract Long getId();

    public abstract void goLand(Runway runway);

    public abstract AircraftType getAircraftType();

}
