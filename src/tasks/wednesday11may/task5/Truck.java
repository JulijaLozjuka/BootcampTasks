package tasks.wednesday11may.task5;

public class Truck extends Car{
    private int loadCapacity;
    private boolean isLoaded;

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

    public void loadTruck(int weight){
        if (weight>getLoadCapacity()){
            System.out.println("too heavy cargo");
            return;
        }
        if (isLoaded){
            System.out.println("truck has already been loaded");
            return;
        }
        if (isVehicleDriving){
            System.out.println("first you should stop driving");
            return;
        }
        System.out.println("truck has been loaded");
        isLoaded = true;
    }
    public void unLoadTruck(){
        if (!isLoaded){
            System.out.println("nothing to unload");
            return;
        }
        if (isVehicleDriving){
            System.out.println("first you should stop driving");
            return;
        }
        System.out.println("truck has been unloaded");
        isLoaded=false;
    }
}
