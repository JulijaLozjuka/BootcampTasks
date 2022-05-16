package tasks.wednesday11may.task5;

import java.util.logging.Logger;

public abstract class Vehicle {
    protected String color;
    protected String manufacturer;
    protected int speed;
    protected int mileage;
    protected boolean isEngineOn = false;
    protected boolean isVehicleDriving = false;
    protected Direction direction;



    public Vehicle(String color, String manufacturer, int mileage) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.mileage=mileage;

    }

    public Vehicle(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
        mileage = 0;
    }

    public void startEngine(){
        if (isEngineOn){
            System.out.println("the engine is already started");
            return;
        }
        System.out.println("the engine is starting...");
        isEngineOn = true;
    }
    public void stopEngine(){
        if (!isEngineOn){
            System.out.println("the engine is already stopped");
            return;
        }
        if (speed>0){
            System.out.println("first lower the speed");
            return;
        }
        System.out.println("the engine is stopping...");
        isEngineOn = false;
    }
    public void accelerate(int speedAmount){
        if (!isEngineOn||!isVehicleDriving){
            System.out.println("first you need to start driving!");
            return;
        }
        speed+=speedAmount;
        System.out.println("speed increased by "+ speedAmount);
    }
    public void lowerSpeed(int speedAmount){
        if (!isEngineOn||!isVehicleDriving){
            System.out.println("vehicle is not driving!");
            return;
        }
        if (speedAmount>=speed){
            speed=0;
            System.out.println("vehicle stopped");
            isVehicleDriving=false;
            return;
        }
        speed-=speedAmount;
        System.out.println("speed decreased by "+ speedAmount);
    }
    public void startDriving (int initialSpeed, Direction direction){
        if (!isEngineOn){
            System.out.println("first you need to start engine");
            return;
        }
        if (isVehicleDriving){
            System.out.println("vehicle is already driving");
            return;
        }
        this.direction=direction;
        isVehicleDriving=true;
        speed=initialSpeed;
    }
    public void stopDriving(){
        if (!isVehicleDriving){
            System.out.println("vehicle has already stopped");
            return;
        }
        if (speed>0){
            System.out.println("first decrease speed");
            return;
        }
        isVehicleDriving=false;

    }
    public void turn(Direction direction){
        if (!isVehicleDriving){
            System.out.println("vehicle isn't driving, can't turn");
            return;
        }
        this.direction = direction;
        System.out.println("vehicle has turned "+ direction);
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMileage() {
        return mileage;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public boolean isVehicleDriving() {
        return isVehicleDriving;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public void setVehicleDriving(boolean vehicleDriving) {
        isVehicleDriving = vehicleDriving;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
