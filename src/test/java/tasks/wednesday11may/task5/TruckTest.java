package tasks.wednesday11may.task5;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class TruckTest {

    Truck truck = new Truck("black","mercedes",40,2,8);



    @Test
    public void loadTruck() {
        truck.isVehicleDriving = false;
        truck.isEngineOn = true;
        // empty truck test
        truck.setLoaded(false);
        truck.loadTruck(7);
        assertTrue(truck.isLoaded());
        // empty truck, but too heavy
        truck.setLoaded(false);
        truck.loadTruck(10);
        assertFalse(truck.isLoaded());
        // already loaded truck
        truck.setLoaded(true);
        boolean isLoadedSuccessfully = truck.loadTruck(7);
        assertFalse(isLoadedSuccessfully);
        //truck is driving
        truck.isVehicleDriving = true;
        truck.setLoaded(false);
        truck.loadTruck(7);
        assertFalse(truck.isLoaded());


    }

    @Test
    public void unLoadTruck() {
        truck.setLoaded(true);
        truck.unLoadTruck();
        assertFalse(truck.isLoaded());
        //already unloaded truck
        truck.setLoaded(false);
        boolean isUnloadedSuccessfully = truck.unLoadTruck();
        assertFalse(isUnloadedSuccessfully);
        //moving truck
        truck.setLoaded(true);
        truck.isVehicleDriving = true;
        truck.unLoadTruck();
        assertTrue(truck.isLoaded());
    }
    @Test
    public void testChangeDirection(){
        truck.isVehicleDriving = false;
        truck.setDirection(Direction.FORWARD);
        truck.turn(Direction.RIGHT);
        assertEquals(Direction.FORWARD,truck.getDirection());
        //driving truck
        truck.isVehicleDriving = true;
        truck.turn(Direction.RIGHT);
        assertEquals(Direction.RIGHT,truck.getDirection());
    }

}