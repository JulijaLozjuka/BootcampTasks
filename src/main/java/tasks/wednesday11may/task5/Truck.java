package tasks.wednesday11may.task5;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Truck extends Car{
    private int loadCapacity;
    private boolean isLoaded = false;
    private static final Logger logger = LogManager.getLogger(Truck.class);




    public Truck(String color, String manufacturer,int mileage, int numberOfSeats, int loadCapacity) {
        super(color, manufacturer,mileage,numberOfSeats);
        this.loadCapacity = loadCapacity;

    }

    public Truck(String color, String manufacturer,int numberOfSeats, int loadCapacity) {
        super(color, manufacturer, numberOfSeats);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public boolean loadTruck(int weight){
        System.out.println(logger.getLevel());
        logger.debug("logger debug level");
        logger.info("logger info level");
        logger.warn("logger warn level");
        logger.error("logger error level");
        logger.fatal("logger fatal level");

        if (weight>getLoadCapacity()){
            System.out.println("too heavy cargo");
            return false;
        }
        if (isLoaded){
            System.out.println("truck has already been loaded");
            return false;
        }
        if (isVehicleDriving){
            System.out.println("first you should stop driving");
            return false;
        }
        System.out.println("truck has been loaded");
        isLoaded = true;
        return true;
    }
    public boolean unLoadTruck(){
        if (!isLoaded){
            System.out.println("nothing to unload");
            return false;
        }
        if (isVehicleDriving){
            System.out.println("first you should stop driving");
            return false;
        }
        System.out.println("truck has been unloaded");
        isLoaded=false;
        return true;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

}
