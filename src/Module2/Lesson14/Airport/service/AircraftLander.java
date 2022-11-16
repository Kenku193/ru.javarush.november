package Module2.Lesson14.Airport.service;


import Module2.Lesson14.Airport.entity.airport.Airport;
import Module2.Lesson14.Airport.entity.transport.Aircraft;
import Module2.Lesson14.Airport.repository.AircraftsRepository;
import Module2.Lesson14.Airport.util.AircraftType;

import java.util.concurrent.locks.ReentrantLock;

public class AircraftLander implements Runnable {

    Airport airport;
    AircraftsRepository aircraftsRepository;
    ReentrantLock locker;

    public AircraftLander(AircraftsRepository aircraftsRepository, Airport airport, ReentrantLock lock) {
        this.aircraftsRepository = aircraftsRepository;
        this.airport = airport;
        this.locker = lock;
    }

    @Override
    public void run() {

        locker.lock();
        try{

            while (true) {
               // Thread.sleep(1000);
                landAircrafts();
            }
        }
        catch (InterruptedException e) {}
        finally {
            locker.unlock();
        }


    }

    public void landAircrafts() throws InterruptedException {

        System.out.println("Size " + aircraftsRepository.aircraftsDeque.size());
        Aircraft aircraft = aircraftsRepository.aircraftsDeque.peekFirst();
        System.out.println(aircraft.getAircraftType() + " " + aircraft.getId());
        if (aircraft.getAircraftType().equals(AircraftType.Helicopter))
        {
            aircraft.goLand(airport.getHelipadList().get(0));
            aircraftsRepository.aircraftsDeque.removeFirst();
        }
        else if (aircraft.getAircraftType().equals(AircraftType.LittlePlane)){
            aircraft.goLand(airport.getRunwayList().get(0));
            aircraftsRepository.aircraftsDeque.removeFirst();
        }
        else if (aircraft.getAircraftType().equals(AircraftType.StandartPlane)){
            aircraft.goLand(airport.getRunwayList().get(0));
            aircraftsRepository.aircraftsDeque.removeFirst();
        }
        else if (aircraft.getAircraftType().equals(AircraftType.BigPlane)){
            aircraft.goLand(airport.getRunwayList().get(0));
            aircraftsRepository.aircraftsDeque.removeFirst();
        }
    }
}
