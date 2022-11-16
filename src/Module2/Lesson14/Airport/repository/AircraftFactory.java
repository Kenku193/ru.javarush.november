package Module2.Lesson14.Airport.repository;

import Module2.Lesson14.Airport.entity.transport.Aircraft;
import Module2.Lesson14.Airport.util.AircraftType;

abstract class AircraftFactory {
    public abstract Aircraft createAircraft(AircraftType aircraftType);
}
