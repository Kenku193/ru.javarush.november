package Module2.Lesson14.Airport.service;

import Module2.Lesson14.Airport.entity.airport.Airport;
import Module2.Lesson14.Airport.entity.airport.runway.Runway;
import Module2.Lesson14.Airport.repository.AircraftsRepository;

import java.util.List;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.locks.ReentrantLock;

public class GameWorker {
    public static void main(String[] args) {
        Airport airport = new Airport();
        ReentrantLock lock = new ReentrantLock();
        AircraftsRepository aircraftsRepository = new AircraftsRepository();

        AircraftGenerator aircraftGenerator = new AircraftGenerator(aircraftsRepository, lock);
        AircraftLander aircraftLander = new AircraftLander(aircraftsRepository, airport, lock);

        List<Runway> runwayList = airport.getRunwayList();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);
        scheduledExecutorService.submit(aircraftGenerator);
        scheduledExecutorService.schedule(aircraftLander, 1, TimeUnit.SECONDS);


    }


}
