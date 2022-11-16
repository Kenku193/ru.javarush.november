package Module2.Lesson14.Airport.service;

import Module2.Lesson14.Airport.repository.AircraftsRepository;
import Module2.Lesson14.Airport.repository.HelicopterFactory;
import Module2.Lesson14.Airport.repository.PlaneFactory;
import Module2.Lesson14.Airport.util.AircraftType;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

public class AircraftGenerator implements Runnable {

    private AircraftsRepository aircraftsRepository;
    ReentrantLock locker;

    PlaneFactory planeFactory = new PlaneFactory();
    HelicopterFactory helicopterFactory = new HelicopterFactory();

    public AircraftGenerator(AircraftsRepository aircraftsRepository, ReentrantLock lock) {
        this.aircraftsRepository = aircraftsRepository;
        this.locker = lock;
    }

    @Override
    public void run() {

        locker.lock();

        try {

            while (true) {
                createAircrafts();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            locker.unlock();
        }
    }


    public void createAircrafts() throws InterruptedException {

        aircraftsRepository.aircraftsDeque.addLast(helicopterFactory.createAircraft(AircraftType.Helicopter));

        Thread.sleep(ThreadLocalRandom.current().nextInt(50, 500));
        aircraftsRepository.aircraftsDeque.addLast(planeFactory.createAircraft(AircraftType.BigPlane));

        aircraftsRepository.aircraftsDeque.addLast(planeFactory.createAircraft(AircraftType.LittlePlane));

        aircraftsRepository.aircraftsDeque.addLast(planeFactory.createAircraft(AircraftType.StandartPlane));

        System.out.println(aircraftsRepository.aircraftsDeque.size());

    }

}
