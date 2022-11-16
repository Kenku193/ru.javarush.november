package Module2.Lesson14.Airport.entity.transport.plane;

import Module2.Lesson14.Airport.entity.airport.runway.Runway;
import Module2.Lesson14.Airport.entity.transport.Aircraft;
import Module2.Lesson14.Airport.util.AircraftType;
import Module2.Lesson14.Airport.util.State;

public class LittlePlane extends Aircraft {
    Long id;

    State state;
    AircraftType aircraftType;

    public LittlePlane() {
        this.aircraftType = AircraftType.LittlePlane;
        this.id = System.currentTimeMillis();
        this.state = State.ONAIR;
    }

    @Override
    public AircraftType getAircraftType() {
        return aircraftType;
    }
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void goLand(Runway runway) {
        this.state = State.LANDING;
        System.out.println("Aircraft " + this.id + " " + aircraftType + " is landing on " + runway.takeTheAircraft());
        this.state = State.LANDED;
    }
}
