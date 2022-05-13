package tasks.wednesday11may.task5;

public class Truck extends Car{
    private int loadCapacity;
    private boolean isLoaded = false;

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
