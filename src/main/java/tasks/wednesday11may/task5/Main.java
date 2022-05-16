package tasks.wednesday11may.task5;



public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck("black","isuzu",800,2,7);
        Truck anotherTruck = new Truck("white","volvo",3,5);
        truck.startDriving(50,Direction.FORWARD);
        System.out.println("is truck driving? " + truck.isVehicleDriving); // engine has not started
        truck.startEngine();
        truck.startDriving(50,Direction.FORWARD);
        System.out.println("is truck driving? " + truck.isVehicleDriving);
        truck.turn(Direction.LEFT);
        truck.turn(Direction.RIGHT);
        System.out.println("truck is driving in " + truck.getDirection() + "direction");
        truck.accelerate(50);
        System.out.println("current speed: " + truck.getSpeed());
        truck.changeGear(4);
        truck.lowerSpeed(40);
        System.out.println("current speed: " + truck.getSpeed());
        truck.stopDriving(); // can't stop because need to decrease speed first
        truck.lowerSpeed(truck.getSpeed());
        truck.stopDriving();
        truck.loadTruck(10); // can't load , too heavy
        truck.loadTruck(5);
        truck.unLoadTruck();
        truck.stopEngine();


    }



}
