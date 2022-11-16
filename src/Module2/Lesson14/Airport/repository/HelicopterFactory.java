package Module2.Lesson14.Airport.repository;

import Module2.Lesson14.Airport.entity.transport.Aircraft;
import Module2.Lesson14.Airport.entity.transport.helicopter.Helicopter;
import Module2.Lesson14.Airport.util.AircraftType;

public class HelicopterFactory extends AircraftFactory {
    @Override
    public Aircraft createAircraft(AircraftType aircraftType)  {

        if (aircraftType.name().equals("Helicopter")){
            return new Helicopter();
        }
        else throw new IllegalArgumentException("не корректный вид транспорта");
    }

}

