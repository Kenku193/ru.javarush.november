package Module2.Lesson14.Airport.entity.airport;

import Module2.Lesson14.Airport.config.Settings;
import Module2.Lesson14.Airport.entity.airport.runway.LittleRunway;
import Module2.Lesson14.Airport.entity.airport.runway.Runway;
import Module2.Lesson14.Airport.entity.airport.runway.StandartRunway;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    List<Runway> runwayList = new ArrayList<>();
    List<Helipad> helipadList = new ArrayList<>();

   public Airport() {
        for (int i = 0; i < Settings.LittleRunwaysNumber; i++) {
            runwayList.add(new LittleRunway());
        }
        for (int i = 0; i < Settings.StandartRunwaysNumber; i++) {
            runwayList.add(new StandartRunway());
        }
        for (int i = 0; i < Settings.HelipadsNumber; i++) {
            helipadList.add(new Helipad());
        }
    }

    public List<Runway> getRunwayList() {
        return runwayList;
    }

    public List<Helipad> getHelipadList() {
        return helipadList;
    }
}
