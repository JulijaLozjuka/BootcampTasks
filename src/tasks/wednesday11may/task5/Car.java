package tasks.wednesday11may.task5;

public  class Car extends Vehicle{
    protected int numberOfSeats;
    protected int gear;

    public Car(String color, String manufacturer, int mileage, int numberOfSeats) {
        super(color, manufacturer, mileage);
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String color, String manufacturer, int numberOfSeats) {
        super(color, manufacturer);
        this.numberOfSeats=numberOfSeats;
    }
    public void changeGear(int gear){
        if (!isVehicleDriving){
            System.out.println("you are not driving");
            return;
        }
        System.out.println("gear has been changed to " + gear + "gear");
        this.gear = gear;
    }




}
