package Module2.Lesson14.Airport.repository;

import Module2.Lesson14.Airport.entity.transport.Aircraft;
import Module2.Lesson14.Airport.entity.transport.plane.BigPlane;
import Module2.Lesson14.Airport.entity.transport.plane.LittlePlane;
import Module2.Lesson14.Airport.entity.transport.plane.StandartPlane;
import Module2.Lesson14.Airport.util.AircraftType;

public class PlaneFactory extends AircraftFactory{

    @Override
    public Aircraft createAircraft(AircraftType aircraftType) {

        if (aircraftType.name().equals("BigPlane")){
            return new BigPlane();
        }
        else if (aircraftType.name().equals("StandartPlane")) {
            return new StandartPlane();
        }
        else if (aircraftType.name().equals("LittlePlane")){
            return new LittlePlane();
        }
        else throw new IllegalArgumentException("не корректный вид транспорта");
    }
}
