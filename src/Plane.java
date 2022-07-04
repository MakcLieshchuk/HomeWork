/* Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и
количество пассажиров. Для класса Ship – количество пассажиров и порт приписки. */
public class Plane extends Vehicle {
    public int heightOfFly;
    public int numberOfPlanePassengers;
    public Plane(int year, int speed, int price) {
        super();
        this.heightOfFly=heightOfFly;
        this.numberOfPlanePassengers=numberOfPlanePassengers;
    }

    public Plane() {
        super();
        this.heightOfFly = 11000;
        this.numberOfPlanePassengers = 290;
        this.year=2020;
        this.price=200000000;
        this.speed=900;
    }
    void soutOfPlane(){
        System.out.println("Plane: Year - "+year+", Price - "+price+" $, Speed - "+speed+" Km/h, Height of fly - "+heightOfFly+" m., Number of passengers - "+numberOfPlanePassengers);
    }
}
